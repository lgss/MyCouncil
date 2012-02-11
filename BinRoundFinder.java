package uk.gov.selfserve;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.*;
import javax.servlet.http.*;

public class BinRoundFinder extends HttpServlet
   {
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request,
                     HttpServletResponse response) 
                    throws ServletException, IOException
      {
	  String host = getServletContext().getInitParameter("host") + "/" + getServletContext().getServletContextName();
	  String phoneNumber = getServletContext().getInitParameter("contactNumber");
	  String postCodeFinderURL = getServletConfig().getInitParameter("postCodeFinderURL");
      response.setContentType("text/html");
      PrintWriter webPageOutput=null;
      webPageOutput=response.getWriter();
	  try
		{
			Class.forName("org.sqlite.JDBC");
		}
		catch (ClassNotFoundException error)
		{
			webPageOutput.print("{\"name\":\"ClassNotFoundException\"}");
		}
      String postCode = request.getParameter("postcode").toUpperCase();
      if (postCode.length() < 7){
    	  postCode = new StringBuffer(postCode).insert(3," ").toString();
      }
      int numOfBinDays=0;
      int numOfBinRounds=0;
      String binDay="";
      String homeAddress="";
      String week="";
		try
		{
			Connection dbConnection = DriverManager.getConnection("jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/mycouncil.db3"));
			Statement dbStatement = dbConnection.createStatement();
			ResultSet dbResult = dbStatement.executeQuery("SELECT COUNT(distinct Day) from binRoundLookup where PostCode = \"" + postCode + "\";");
			if(dbResult.next()){
				numOfBinDays = dbResult.getInt(1);
				dbResult = dbStatement.executeQuery("SELECT COUNT(distinct Week) from binRoundLookup where PostCode = \"" + postCode + "\";");
				if(dbResult.next()){
					numOfBinRounds += dbResult.getInt(1);
				}
            }
            dbResult = dbStatement.executeQuery("SELECT DISTINCT HouseNumber,HouseName,Street,PostCode,Day,Week from binRoundLookup where PostCode = \"" + postCode + "\"  ORDER BY HouseNumber ASC;");
            if(numOfBinDays==1 && numOfBinRounds ==1){
                if(dbResult.next()){
                	for(int currentAddressItem=3;currentAddressItem<5;currentAddressItem++){
                		try{
                			if(!dbResult.getString(currentAddressItem).equals("")){
                				if(!homeAddress.equals("")){
                					homeAddress+=", ";
                				}
                				homeAddress+=dbResult.getString(currentAddressItem);
                				postCode = dbResult.getString(4);
                				binDay=dbResult.getString(5);
                				week=dbResult.getString(6);
                			}
                		}
                		catch(NullPointerException error){
                		};
                	}
                response.sendRedirect(host + "?mode=collectionDay&search=" + postCode + "&day=" + binDay + "&week=" + week);
                }
            }else{
          	  webPageOutput.println("<html><head><title>Check Your Collection Day</title><link rel='stylesheet'type='text/css'href='nbc.css'/>");
          	  webPageOutput.println("</head><body><div id='Logo'><p></p><img src='images/logo.gif'><p></p></div><div id='TitleBar'>Check Your Collection Day</div><BR>");
          	  boolean propertiesFound=false;
           	  while(dbResult.next()){
            	  if(!propertiesFound){
            		  propertiesFound=true;
            		  webPageOutput.println("Please select your property from the list below :<BR><BR>");
            	  }
            	  homeAddress = "";
            	  for(int currentAddressItem=1;currentAddressItem<5;currentAddressItem++){
              		try{
              			if(!dbResult.getString(currentAddressItem).equals("")&&!dbResult.getString(currentAddressItem).equals("0")){
             				homeAddress+=dbResult.getString(currentAddressItem);
              				if(!homeAddress.equals("")){
              					homeAddress+=" ";
              					
              				}
               			}
              		}
              		catch(NullPointerException error){
              		};
            	  }
            	  postCode=dbResult.getString(4);
            	  binDay=dbResult.getString(5);
            	  week=dbResult.getString(6);
            	  webPageOutput.println("<a href='" + host + "?mode=collectionDay&search=" + postCode + "&day=" + binDay + "&week=" + week + "'>" + homeAddress + "</a><BR>");
              }
        	  if (!propertiesFound)
        	  {
        		  webPageOutput.println("There were no properties found for postcode " + postCode + ". If you're not sure about your postcode, please <a href='" + postCodeFinderURL + "' target='_blank'>Click Here</a> to find your postcode.<BR><BR>If you are sure the postcode is correct, please ring us on " + phoneNumber + " to check you are registered.");
        	  }
        	  else
        	  {
        		  webPageOutput.println("<BR>If your address does not appear please ring us on " + phoneNumber + " to check you are registered.");
        	  }
        	}
           
        }
		catch (SQLException error)
			{
			webPageOutput.print("{\"message\":\"" + error.toString() + "\"}");
			}
	  webPageOutput.println("</body>");
	  webPageOutput.println("</html>");
	  webPageOutput.close();
		}
   }
   
