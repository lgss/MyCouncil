package uk.gov.selfserve;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class BinRoundFinder extends HttpServlet
   {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,
                     HttpServletResponse response) 
                    throws ServletException, IOException
      {
	  String host = getServletContext().getInitParameter("host") + "/" + getServletContext().getServletContextName();
	  String phoneNumber = getServletContext().getInitParameter("contactNumber");
	  String userAgent = request.getHeader("user-agent").toLowerCase();
	  String postCode = request.getParameter("postcode").toUpperCase();
	  response.setContentType("text/html");
	  PrintWriter output = response.getWriter();
	  String htmlHeader = "<html><head><title>Check Your Collection Day</title><link rel='stylesheet'type='text/css'href='nbc.css'/>";
  	  htmlHeader += "<meta name=\"HandheldFriendly\" content=\"True\"><meta name=\"MobileOptimized\" content=\"320\"><meta name=\"viewport\" content=\"width=device-width, target-densitydpi=160dpi, initial-scale=1.0\"></head><body><div id='Logo'><p></p><img src='images/logo.gif'><p></p></div><div id='TitleBar'>Check Your Collection Day</div>"; 
  	  String htmlFooter = "</body></html>";
  	  String onClickScript = "<script type=\"text/javascript\" src=\"binFinderResults.js\"></script>";
	  String htmlError = "<div id=\"error\"><p>Unfortunately there's been an error, or there are no results for your postcode.</p></div>"
		  + "<p>Please <a href=\"http://www.royalmail.com/postcode-finder\">check your post code</a> or call us on "+phoneNumber+" to check your collection.</p>";
  	  
  	  boolean mobileApp = false;
	  boolean mobileBrowser = false;
	  
	  try{
		  /*check the parameter value for mobile app*/
    	  String app = request.getParameter("mobileApp");
    	  if(app.compareToIgnoreCase("true") == 0){
        	  		mobileApp = true;
    	  }
      }catch(NullPointerException e){
    	  /*check the client value for mobile browser*/
          mobileBrowser = isMobileBrowser(userAgent);
      }
      
      //get search results
      List<BinCollection> results = getResults(postCode);
      
      if(mobileApp == true){
 		 response.setContentType("text/xml");
 		 getAppResponse(results,output);
 	  }else{
 		  //if 1 or more results
 		  if(results.size() == 1){
    		  //send mobile response
    		  if(mobileBrowser == true){
    			  results.get(0).getNextCollection();
    			  response.sendRedirect(host + "/binFinderResults.html?&day=" + results.get(0).day + "&type=" + results.get(0).type + "&date=" + results.get(0).nextCollection);   
    		  }
    		  //send desktop response
    		  else{ 
    			  results.get(0).getNextCollection();
    			  response.sendRedirect(host + "?mode=collectionDay&search=" + postCode + "&day=" + results.get(0).day +"&type=" + results.get(0).type + "&week=" + results.get(0).week);
    		  }
    	  }
 		  else if(results.size() > 1){
    			 output.print(htmlHeader);
    			 output.println("<div id=\"results\">");
    			 output.println("<p>Please choose your property from the list below:</p>");
    			//get mobile response
       		  if(mobileBrowser == true){
       			 String result = "<select id=\"address\">";
      			 for(int n = 0; n < results.size(); n++){
      				 results.get(n).getNextCollection();
     				 result += "<option value=\""+host + "/binFinderResults.html?&day=" + results.get(n).day +"&type=" + results.get(n).type+ "&date=" + results.get(n).nextCollection+"\">"+results.get(n).address+"</option>";
     				 
     			 }
      			result += "</select>";
      			output.println(result);
       		  }else{
       			  String result = "<select id=\"address\">";
     			 for(int n = 0; n < results.size(); n++){
     				results.get(n).getNextCollection();
     				 result += "<option value=\""+host + "?mode=collectionDay&search=" + postCode + "&day=" + results.get(n).day + "&type="+ results.get(n).type+"&week=" + results.get(n).week+"\">"+results.get(n).address+"</option>"; 
     			 }
     			result += "</select>";
     			output.println(result);
       		  }
       		  output.println("<p id=\"findit\" onclick=\"javascript:getResult()\">Find It</p>");
       		  output.println("</div>");
       		  output.println(onClickScript);
       		  output.print(htmlFooter);
    	  }
 		  //if no results
 		  else{
			 output.print(htmlHeader);
			 output.print(htmlError);
			 output.print(htmlFooter);
 		  }
 	  }
}
	
	
	public boolean isMobileBrowser(String userAgent){
		boolean mobile = false;
		if(userAgent == null){
			return mobile;
		}else{
			String[] mobileAgents = {"ipad","iphone","ipod","android","opera mini","blackberry","iris","3g_t","windows ce","opera mobi","windows ce smartphone","iemobile","symbian","kindle"};
			for(int x = 0; x < mobileAgents.length; x++){
			  if(userAgent.contains(mobileAgents[x])){
				  mobile = true;
			  }
			}
		}
		return mobile;
	}
	
	public List<BinCollection> getResults(String postCode){
		List<BinCollection> binCollections = new ArrayList<BinCollection>();
		String postCodePattern = "^[Nn]{1,2}[0-9].+";
		int numberOfBinDays = 0;
		int numberOfBinRounds = 0;
		String address = "";
		String day = "";
		int week;
		
		try{
			Class.forName("org.sqlite.JDBC");
		}catch (ClassNotFoundException error){
			System.out.println("SQL Class not found exception.");
		}
		

		if (postCode.length() <= 7 && postCode.matches(postCodePattern)){
			
			if (postCode.length() == 6){
				postCode = new StringBuffer(postCode).insert(3," ").toString();
			}
		
		try{
			Connection dbConnection = DriverManager.getConnection("jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/mycouncil.db3"));
			String selectDay = "SELECT COUNT(distinct Day) from binRoundLookup where PostCode = ?";
			PreparedStatement dbStatement = dbConnection.prepareStatement(selectDay);
			dbStatement.setString(1, postCode);
			ResultSet dbResult = dbStatement.executeQuery();;
			
			if(dbResult.next()){
				numberOfBinDays = dbResult.getInt(1);
				String selectWeek = "SELECT COUNT(distinct Week) from binRoundLookup where PostCode = ?";
				PreparedStatement dbStatementWeek = dbConnection.prepareStatement(selectWeek);
				dbStatementWeek.setString(1, postCode);
				dbResult = dbStatementWeek.executeQuery();
				if(dbResult.next()){
					numberOfBinRounds += dbResult.getInt(1);
				}
			}
			String selectCols = "SELECT DISTINCT HouseNumber,HouseName,Street,PostCode,Day,Week from binRoundLookup where PostCode = ? ORDER BY HouseNumber ASC";
			PreparedStatement dbStatementFields = dbConnection.prepareStatement(selectCols);
			dbStatementFields.setString(1, postCode);
			dbResult = dbStatementFields.executeQuery();

			if(numberOfBinDays==1 && numberOfBinRounds ==1){
				if(dbResult.next()){
					for(int currentAddressItem=3;currentAddressItem<4;currentAddressItem++){
						try{
							if(!dbResult.getString(currentAddressItem).equals("")){
								if(!address.equals("")){
									address+=", ";
								}
								address+=dbResult.getString(currentAddressItem);
							}
						}
						catch(NullPointerException error){
						}
					}
					postCode = dbResult.getString(4);
					day=dbResult.getString(5);
					week=dbResult.getInt(6);
					
					BinCollection collection = new BinCollection();
					collection.day = day;
					collection.week = week;
					collection.address = address;
					binCollections.add(collection);
            }   
		}else{
       	  while(dbResult.next()){
        	  address = "";
        	  for(int currentAddressItem=1;currentAddressItem<4;currentAddressItem++){
          		try{
          			if(!dbResult.getString(currentAddressItem).equals("")&&!dbResult.getString(currentAddressItem).equals("0")){
         				address+=dbResult.getString(currentAddressItem);
          				if(!address.equals("")){
          					address+=" ";	
          				}
           			}
          		}
          		catch(NullPointerException error){
          		};
        	  }
        	  postCode=dbResult.getString(4);
        	  day=dbResult.getString(5);
        	  week=dbResult.getInt(6);
        	  
        	  BinCollection collection = new BinCollection();
        	  collection.day = day;
        	  collection.week = week;
        	  collection.address = address;
        	  binCollections.add(collection);
        	  
        	}
    	}
       
    }
	catch (SQLException error){
		error.printStackTrace();
		System.out.println("Sql Exception.");
	}}
	return binCollections;
	}
	
	public void getAppResponse(List<BinCollection> collections, PrintWriter output){
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;
		try {
			docBuilder = docFactory.newDocumentBuilder();
			// root element
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("properties");
			doc.appendChild(rootElement);
			for(int x = 0; x < collections.size(); x++){
				
				collections.get(x).getNextCollection();
				
				Element property =  doc.createElement("property");
			
				Element address = doc.createElement("address");
				address.setTextContent(collections.get(x).address);
				property.appendChild(address);
				
				Element day = doc.createElement("day");
				day.setTextContent(collections.get(x).day);
				property.appendChild(day);
				
				Element date = doc.createElement("date");
				date.setTextContent(collections.get(x).nextCollection);
				property.appendChild(date);
				
				Element type = doc.createElement("type");
				type.setTextContent(collections.get(x).type);
				property.appendChild(type);
			
				rootElement.appendChild(property);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult();
			result.setWriter(output);

			try {
				transformer.transform(source, result);
			} catch (TransformerException e) {
				e.printStackTrace();
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
 }
   
