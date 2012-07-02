package uk.gov.selfserve;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.xpath.*;

public class PollingStationLoader extends HttpServlet
{

	public void doGet(HttpServletRequest request,
					  HttpServletResponse response) 
                    throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter ajaxResponse = response.getWriter();
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
			Connection dbConnection = DriverManager.getConnection("jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/mycouncil.db3"));
			Statement dbStatement = dbConnection.createStatement();
			//
			DocumentBuilder builder = domFactory.newDocumentBuilder();
			Document doc = builder.parse("webapps\\" + getServletContext().getServletContextName() + "\\data\\PropertyNamesPollingStations.xml");
			XPathFactory factory = XPathFactory.newInstance();
			XPath xpath = factory.newXPath();
			XPathExpression expr = xpath.compile("//PollingStation");
			Object result = expr.evaluate(doc, XPathConstants.NODESET);
			NodeList nodes = (NodeList)result;
			if (nodes.getLength() > 0)
			{
				try
				{
					for (int currentAddress = 0; currentAddress < nodes.getLength(); currentAddress++)
					{
						String[][] dbFields = { { "PropertyName", "PostCode", 
							                       "PollingPlaceAddress1", "PollingPlaceAddress2", "PollingPlaceAddress3",
							                       "PollingPlaceAddress4", "PollingPlaceAddress5", "PollingPlaceAddress6", 
							                       }, { "", "", "", "", "", "", "", "" } };
						NodeList addressList = nodes.item(currentAddress).getChildNodes();
						for (int currentAddressItem = 0; currentAddressItem < addressList.getLength(); currentAddressItem++)
						{
							if (!addressList.item(currentAddressItem).getNodeName().equals("#text"))
							{
								for (int currentDBField = 0; currentDBField < 8; currentDBField++)
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
						dbStatement.executeUpdate("INSERT INTO pollingStationLookup VALUES (0,\"\",\"" + dbFields[1][1] + "\",\"" +
																						   dbFields[1][2] + "\",\"" +
																						   dbFields[1][3] + "\",\"" +
																						   dbFields[1][4] + "\",\"" +
																						   dbFields[1][5] + "\",\"" +
																						   dbFields[1][6] + "\",\"" +
																						   dbFields[1][7] + "\",\"\",\"" +
																						   dbFields[1][0] + "\")");
					}
				}
				catch (NullPointerException error)
				{
					ajaxResponse.println(error.toString());
					error.printStackTrace();
				}
			}
			//dbStatement.executeUpdate("INSERT INTO pollingStationLookup VALUES ()");
			//ResultSet dbResultSet = dbStatement.executeQuery("SELECT * FROM params");
			//while (dbResultSet.next())
			//{
			//    ajaxResponse.print("{\"name\":\"" + dbResultSet.getString("name") + "\"}");
			//}
			//dbResultSet.close();
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
		ajaxResponse.close();
	}
}