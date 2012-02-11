package uk.gov.selfserve;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.xpath.*;

public class PollingStationFinder extends HttpServlet
   {

   public void doGet(HttpServletRequest request,
                     HttpServletResponse response) 
                    throws ServletException, IOException
      {
	  String host = getServletContext().getInitParameter("host") + "/" + getServletContext().getServletContextName();
	  String electionsPhoneNumber = getServletConfig().getInitParameter("electionsPhoneNumber");
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
      int numOfPollingStations=0;
		try
		{
			Connection dbConnection = DriverManager.getConnection("jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/mycouncil.db3"));
			Statement dbStatement = dbConnection.createStatement();
			ResultSet dbResult = dbStatement.executeQuery("SELECT COUNT(distinct PollingPlaceAddress1) from pollingStationLookup where PostCode = \"" + postCode + "\";");
            if(dbResult.next()){
            	numOfPollingStations = dbResult.getInt(1);
            }
            dbResult = dbStatement.executeQuery("SELECT PropertyNumber,PropertyName,StreetName,PollingPlaceAddress1,PollingPlaceAddress2,PollingPlaceAddress3,PollingPlaceAddress4,PollingPlaceAddress5,PollingPlaceAddress6,PollingPlaceAddress7,PollingPlaceLat,PollingPlaceLng from pollingStationLookup where PostCode = \"" + postCode + "\"  ORDER BY PropertyName DESC, PropertyNumber ASC;");
            if(numOfPollingStations==1){
            	String pollingStation="";
               	String pollingStationLat="";
            	String pollingStationLng=""; 
                if(dbResult.next()){
                	for(int currentAddressItem=4;currentAddressItem<11;currentAddressItem++){
                		try{
                			if(!dbResult.getString(currentAddressItem).equals("")){
                				if(!pollingStation.equals("")){
                					pollingStation+=", ";
                				}
                				pollingStation+=dbResult.getString(currentAddressItem);
                			}
                		}
                		catch(NullPointerException error){
                		};
                	}
                	pollingStationLat=dbResult.getString(11);
                	pollingStationLng=dbResult.getString(12);            	
                }
               response.sendRedirect(host + "?mode=preElection&search=" + pollingStation + "&lat2=" + pollingStationLat + "&lng2=" + pollingStationLng);
            }else{
          	  webPageOutput.println("<html><head><title>Find Your Polling Station</title><link rel='stylesheet'type='text/css'href='nbc.css'/>");
          	  webPageOutput.println("</head><body><div id='Logo'><p></p><img src='images/logo.gif'><p></p></div><div id='TitleBar'>Find Your Polling Station</div><BR>");
              boolean propertiesFound=false;
           	  while(dbResult.next()){
            	  if(!propertiesFound){
            		  propertiesFound=true;
            		  webPageOutput.println("Please select your property from the list below :<BR><BR>");
            	  }
            	  String pollingStation="";
                  String homeAddress="";
            	  for(int currentAddressItem=1;currentAddressItem<4;currentAddressItem++){
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
            	  for(int currentAddressItem=4;currentAddressItem<11;currentAddressItem++){
            		try{
            			if(!dbResult.getString(currentAddressItem).equals("")){
            				if(!pollingStation.equals("")){
            					pollingStation+=", ";
            				}
            				pollingStation+=dbResult.getString(currentAddressItem);
            			}
            		}
            		catch(NullPointerException error){
            		};
            	}
            	  webPageOutput.println("<a href='" + host + "?mode=preElection&search=" + pollingStation + "'>" + homeAddress + "</a><BR>");
              }
        	  if (!propertiesFound)
        	  {
        		  webPageOutput.println("There were no properties found for postcode " + postCode + ". If you're not sure about your postcode, please <a href='http://postcode.royalmail.com/portal/rm/postcodefinder' target='_blank'>Click Here</a> to find your postcode.<BR><BR>If you are sure the postcode is correct, please ring us on " + electionsPhoneNumber + " to check you are registered.");
        	  }
        	  else
        	  {
        		  webPageOutput.println("<BR>If your address does not appear please ring us on " + electionsPhoneNumber + " to check you are registered.");
        	  }
            }
		}
		catch (SQLException error)
			{
			webPageOutput.print("{\"message\":\"" + error.toString() + "\"}");
			}
	  webPageOutput.println("</body></html>");
	  webPageOutput.close();
   }
   }