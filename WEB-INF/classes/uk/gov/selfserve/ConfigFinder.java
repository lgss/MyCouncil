package uk.gov.selfserve;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ConfigFinder extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,
					  HttpServletResponse response) 
                    throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter ajaxResponse = response.getWriter();
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
			ResultSet dbResultSet = dbStatement.executeQuery("SELECT * FROM params");
			while (dbResultSet.next())
			{
				ajaxResponse.print("{\"name\":\"" + dbResultSet.getString("name") + "\"}");
			}
			dbResultSet.close();
			dbConnection.close();
		}
		catch (SQLException error)
		{
			ajaxResponse.print("{\"message\":\"" + error.toString() + "\"}");
		}
		ajaxResponse.close();
	}
}