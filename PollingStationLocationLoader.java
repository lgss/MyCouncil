package uk.gov.selfserve;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.xpath.*;

public class PollingStationLocationLoader extends HttpServlet
{

	public void doGet(HttpServletRequest request,
					  HttpServletResponse response) 
                    throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter ajaxResponse = response.getWriter();
		ajaxResponse.print("Starting");
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		domFactory.setNamespaceAware(true);
		try
		{
			Class.forName("org.sqlite.JDBC");
		}
		catch (ClassNotFoundException error)
		{
			ajaxResponse.print("{\"name\":\"ClassNotFoundException\"}");
		}
		try
		{
			Connection dbConnection = DriverManager.getConnection("jdbc:sqlite:" + getServletContext().getRealPath("/mycouncil.db3"));
			Statement dbStatement = dbConnection.createStatement();
			//
			DocumentBuilder builder = domFactory.newDocumentBuilder();
			Document doc = builder.parse("webapps\\" + getServletContext().getServletContextName() + "\\data\\PollingStationLocations.xml");
			XPathFactory factory = XPathFactory.newInstance();
			XPath xpath = factory.newXPath();
			XPathExpression expr = xpath.compile("//Polling_Station_Location");
			Object result = expr.evaluate(doc, XPathConstants.NODESET);
			NodeList nodes = (NodeList)result;
			if (nodes.getLength() > 0)
			{
				try
				{
					for (int currentAddress = 0; currentAddress < nodes.getLength(); currentAddress++)
					{
						ajaxResponse.print("CP1");
						String[][] dbFields = { {  "Polling_Station_Name", "Lat", "Lng"}, 
								                { "", "", ""} };
						NodeList addressList = nodes.item(currentAddress).getChildNodes();
						for (int currentAddressItem = 0; currentAddressItem < addressList.getLength(); currentAddressItem++)
						{
							if (!addressList.item(currentAddressItem).getNodeName().equals("#text"))
							{
								for (int currentDBField = 0; currentDBField < dbFields[0].length; currentDBField++)
								{
									if (dbFields[0][currentDBField].equals(addressList.item(currentAddressItem).getNodeName()))
									{
										try
										{
											dbFields[1][currentDBField] = addressList.item(currentAddressItem).getFirstChild().getNodeValue();
										}
										catch (NullPointerException error)
										{
										}
									}
								}
							}
						}
						dbStatement.executeUpdate("UPDATE pollingStationLookup SET PollingPlaceLat=" + dbFields[1][1] + 
								                  ",PollingPlaceLng=" + dbFields[1][2] +
								                  " WHERE PollingPlaceAddress1 = \"" + dbFields[1][0] + "\"");
					}
				}
				catch (NullPointerException error)
				{
					ajaxResponse.println(error.toString());
					error.printStackTrace();
				}
			}
			dbConnection.close();
		}
		catch (SQLException error)
		{
			ajaxResponse.print("{\"message\":\"" + error.toString() + "\"}");
		}
		catch (ParserConfigurationException error)
		{
			ajaxResponse.println("ParserConfigurationException : " + error.toString() + "<BR>");
		}
		catch (SAXException error)
		{
			ajaxResponse.println("SAXException : " + error.toString() + "<BR>");
		}
		catch (XPathExpressionException error)
		{
			ajaxResponse.println("XPathExpressionException : " + error.toString() + "<BR>");
		}
		ajaxResponse.print("Stopping");
		ajaxResponse.close();
	}
}