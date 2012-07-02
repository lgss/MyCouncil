package uk.gov.selfserve;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.xpath.*;

public class WardLoader extends HttpServlet
{

	public void doGet(HttpServletRequest request,
					  HttpServletResponse response) 
                    throws ServletException, IOException
	{
		System.out.println("WardLoader Starting");
		response.setContentType("text/html");
		PrintWriter ajaxResponse = response.getWriter();
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		domFactory.setNamespaceAware(true);
		int currentVector=0;
		int currentWard=0;
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
			Connection dbConnection = DriverManager.getConnection("jdbc:sqlite:/Users/kevinwhite/Dropbox/mycouncil.db3");
			Statement dbStatement = dbConnection.createStatement();
			
			try {
				int wardNumber=33;
			    BufferedReader in = new BufferedReader(new FileReader(getServletContext().getRealPath("/data/Wards/Westone.txt")));
			    String str;
			    while ((str = in.readLine()) != null) {
			        System.out.println(">>>"+str+"<<<");
			        Integer eastingIndex=str.indexOf(',');
			        Integer northingIndex=str.indexOf(',',eastingIndex+1);
			        double easting = Double.parseDouble(str.substring(0,eastingIndex));
			        double northing = Double.parseDouble(str.substring(eastingIndex+1,northingIndex));
					if(currentWard!=wardNumber){
						currentVector=0;
						currentWard=wardNumber;
					}
					else{
						currentVector++;
					}
					dbStatement.executeUpdate("INSERT INTO wardPolygons VALUES (" + wardNumber + "," + currentVector + "," + (int)northing + "," + (int)easting + ")");
			    }
			    in.close();
			} catch (IOException error) {
				ajaxResponse.print("{\"message\":\"" + error.toString() + "\"}");
			}
			dbConnection.close();
		}
		catch (SQLException error)
		{
			ajaxResponse.print("{\"message\":\"" + error.toString() + "\"}");
		}
		ajaxResponse.close();
		System.out.println(">>>Done<<<");
	}
}