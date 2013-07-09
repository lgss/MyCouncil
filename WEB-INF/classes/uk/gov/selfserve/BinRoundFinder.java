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
		String postCode = "";
		String uprn = "";
		try{
		   postCode = request.getParameter("postcode").toUpperCase();
		}
		catch(NullPointerException error){
		}
		try{
			uprn = request.getParameter("uprn").toUpperCase();
		}
		catch(NullPointerException error){
		}
		response.setContentType("text/json");
		PrintWriter output = response.getWriter();
		boolean mobileApp = false;

		try{
			/*check the parameter value for mobile app*/
			String app = request.getParameter("mobileApp");
			if(app.compareToIgnoreCase("true") == 0){
				mobileApp = true;
			}
		}catch(NullPointerException e){
		}

		//get search results
		List<BinCollection> results = getResults(postCode,uprn);

		if(mobileApp == true){
			response.setContentType("text/xml");
			getAppResponse(results,output);
		}else{
			if(results.size() == 1){
				results.get(0).getNextCollection();
				output.println("{\"result\":\"success\"" + 
						",\"rounds\":\"single\"" +
						",\"day\":\"" + results.get(0).day + "\"" +
						",\"type\":\"" + results.get(0).type + "\"" +
						",\"date\":\"" + results.get(0).nextCollection + "\"" +
						",\"url\":\"" + results.get(0).url + "\"" +
						",\"oldDay\":\"" + results.get(0).oldDay + "\"" +
						",\"oldWeek\":\"" + results.get(0).oldWeek + "\"" +
						",\"newWeek\":\"" + results.get(0).week + "\"" +
				"}"); 
			}
			else if(results.size() > 1){
				output.println("{\"result\":\"success\"" + 
						",\"rounds\":\"multiple\"" + 
				",\"properties\":[");
				for(int n = 0; n < results.size(); n++){
					if(n>0){
						output.println(",");	 
					}
					results.get(n).getNextCollection();
					output.println("{\"property\":\"" + results.get(n).address + "\"" + 
							",\"day\":\"" + results.get(n).day + "\"" +
							",\"type\":\"" + results.get(n).type + "\"" +
							",\"date\":\"" + results.get(n).nextCollection + "\"" +
							",\"url\":\"" + results.get(n).url + "\"" +
							",\"oldDay\":\"" + results.get(n).oldDay + "\"" +
							",\"oldWeek\":\"" + results.get(n).oldWeek + "\"" +
							",\"newWeek\":\"" + results.get(n).week + "\"" +
					"}");
				}
				output.println("]}"); 	  
			}		  
			else{
				if(postCode.equals("")){
					output.println("{\"result\":\"failure\"" + 
							",\"description\":\"No property found\"" +
					"}"); 					
				}
				else{					
					output.println("{\"result\":\"failure\"" + 
							",\"description\":\"No properties found\"" +
					"}"); 
				}
			}
		}
	}

	public List<BinCollection> getResults(String postCode,String uprn){
		List<BinCollection> binCollections = new ArrayList<BinCollection>();
		String postCodePattern = "^[Nn]{1,2}[0-9].+";
		int numberOfBinDays = 0;
		int numberOfBinRounds = 0;
		String address = "";
		String day = "";
		int week;
		String url = "";
		String oldUrl = "";
		String oldDay = "";
		int oldWeek;
		
		try{
			Class.forName("org.sqlite.JDBC");
		}catch (ClassNotFoundException error){
			System.out.println("SQL Class not found exception.");
		}


		if ((postCode.length() <= 7 && postCode.matches(postCodePattern))||!uprn.equals("")){

			if (postCode.length() == 6){
				postCode = new StringBuffer(postCode).insert(3," ").toString();
			}

			try{
				Connection dbConnection = DriverManager.getConnection("jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/mycouncil.db3"));
				ResultSet dbResult=null;

				if(!postCode.equals("")){
				
					String selectDay = "SELECT COUNT(distinct NewDay) from binRounds where Postcode = ?";
					PreparedStatement dbStatement = dbConnection.prepareStatement(selectDay);
					dbStatement.setString(1, postCode);
					dbResult = dbStatement.executeQuery();;

					if(dbResult.next()){
						numberOfBinDays = dbResult.getInt(1);
						String selectWeek = "SELECT COUNT(distinct NewWeek) from binRounds where Postcode = ?";
						PreparedStatement dbStatementWeek = dbConnection.prepareStatement(selectWeek);
						dbStatementWeek.setString(1, postCode);
						dbResult = dbStatementWeek.executeQuery();
						if(dbResult.next()){
							numberOfBinRounds += dbResult.getInt(1);
						}
					}
				
				}else{
					
					numberOfBinDays=1;
					numberOfBinRounds=1;
				}
				String selectCols = null;

				if(postCode.equals("")){
				   selectCols = "SELECT DISTINCT HouseNumber,HouseName,Street,PostCode,binRounds.NewDay,binRounds.NewWeek,url,OldDay,OldWeek,oldUrl from binRounds,collectionCalendars where uprn = ? AND binRounds.NewDay=collectionCalendars.Day AND binRounds.NewWeek=collectionCalendars.Week ORDER BY HouseNumber ASC";
				}else{
					selectCols = "SELECT DISTINCT HouseNumber,HouseName,Street,PostCode,binRounds.NewDay,binRounds.NewWeek,url,OldDay,OldWeek,oldUrl from binRounds,collectionCalendars where Postcode = ? AND binRounds.NewDay=collectionCalendars.Day AND binRounds.NewWeek=collectionCalendars.Week ORDER BY HouseNumber ASC";					
				}
				PreparedStatement dbStatementFields = dbConnection.prepareStatement(selectCols);
				if(postCode.equals("")){
					dbStatementFields.setString(1, uprn);
				}else{
					dbStatementFields.setString(1, postCode);
				}
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
						url=dbResult.getString(7);
						oldDay=dbResult.getString(8);
						oldWeek=dbResult.getInt(9);
						oldUrl=dbResult.getString(10);

						BinCollection collection = new BinCollection();
						collection.day = day;
						collection.week = week;
						collection.address = address;
						
						if(day.equals(oldDay)&&week==oldWeek){
							collection.url = oldUrl;
						}else{
							collection.url = url;
						}
						collection.oldDay = oldDay;
						collection.oldWeek = oldWeek;
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
						url=dbResult.getString(7);
						oldDay=dbResult.getString(8);
						oldWeek=dbResult.getInt(9);
						oldUrl=dbResult.getString(10);

						BinCollection collection = new BinCollection();
						collection.day = day;
						collection.week = week;
						collection.address = address;
						if(day.equals(oldDay)&&week==oldWeek){
							collection.url = oldUrl;
						}else{
							collection.url = url;
						}
						collection.oldDay = oldDay;
						collection.oldWeek = oldWeek;
						
						binCollections.add(collection);

					}
				}
				try {
					if(dbConnection!=null){
						dbConnection.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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

