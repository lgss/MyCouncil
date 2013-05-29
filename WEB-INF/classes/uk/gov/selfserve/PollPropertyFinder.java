package uk.gov.selfserve;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
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

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class PollPropertyFinder extends HttpServlet
   {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,
                     HttpServletResponse response) 
                    throws ServletException, IOException
      {
		String postCode = request.getParameter("postcode").toUpperCase();
		response.setContentType("text/json");
		PrintWriter output = response.getWriter();
		JsonObject results = new JsonObject();
		JsonArray props = new JsonArray();
		//get search results
		List<PollProperty> properties = getProperties(postCode);
		
		//sorting and reversing sets the list in ascending property number order
		Collections.sort(properties);
		Collections.reverse(properties);
		
		//loop through and create JSON output
		for(int x = 0; x < properties.size(); x++){
			JsonObject property = new JsonObject();
			property.addProperty("uprn", properties.get(x).getUprn());
			property.addProperty("address", properties.get(x).getFullAddress());
			props.add(property);
		}
		
		if(props.size() > 0){
			results.addProperty("success", "true");
		}else{
			results.addProperty("success", "false");
		}
		results.add("properties", props);
		//System.out.println(results);
		output.write(results.toString());
		output.flush();
      }
	
	public List<PollProperty> getProperties(String postCode){
		List<PollProperty> properties = new ArrayList<PollProperty>();
		String postCodePattern = "^[Nn]{1,2}[0-9].+";
		
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
				String selectProp = "SELECT * from properties where PostCode = ?";
				PreparedStatement dbStatement = dbConnection.prepareStatement(selectProp);
				dbStatement.setString(1, postCode);
				ResultSet dbResult = dbStatement.executeQuery();
				
				while(dbResult.next()){
					PollProperty prop = new PollProperty();
					prop.setUprn(dbResult.getString(1));
					prop.setEasting(dbResult.getInt(2));
					prop.setNorthing(dbResult.getInt(3));
					prop.setPropName(dbResult.getString(5));
					prop.setPropNumber(dbResult.getString(6));
					prop.setFullAddress(dbResult.getString(8));
					prop.setDistrict(dbResult.getString(15));
					properties.add(prop);
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
			}
		}
		return properties;
	}
 }
   
