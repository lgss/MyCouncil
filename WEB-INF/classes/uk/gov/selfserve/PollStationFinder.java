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

import uk.me.jstott.jcoord.LatLng;
import uk.me.jstott.jcoord.OSRef;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class PollStationFinder extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private Connection dbConnection;

	public void doGet(HttpServletRequest request,
			HttpServletResponse response) 
	throws ServletException, IOException
	{
		String uprn = request.getParameter("uprn");
		response.setContentType("text/json");
		PrintWriter output = response.getWriter();
		JsonArray pollStations = new JsonArray();
		JsonObject results = new JsonObject();

		//get search results
		List<PollStation> stations = getPollingStations(uprn);

		//loop through and create JSON output
		for(int x = 0; x < stations.size(); x++){
			JsonObject station = new JsonObject();
			station.addProperty("type", stations.get(x).getType());
			station.addProperty("name", stations.get(x).getName());
			station.addProperty("address", stations.get(x).getAddress());
			station.addProperty("fullAddress", stations.get(x).getFullAddress());
			station.addProperty("lat", Double.toString(stations.get(x).getLat()));
			station.addProperty("lng", Double.toString(stations.get(x).getLng()));
			pollStations.add(station);
		}

		if(pollStations.size() > 0){
			results.addProperty("success", "true");
		}else{
			results.addProperty("success", "false");
		}
		results.add("pollStations", pollStations);
		//System.out.println(results.toString());
		output.write(results.toString());
		output.flush();
	}

	public List<PollStation> getPollingStations(String uprn){
		List<PollStation> stations = new ArrayList<PollStation>();

		try{
			Class.forName("org.sqlite.JDBC");
		}catch (ClassNotFoundException error){
			System.out.println("SQL Class not found exception.");
		}

		try{

			dbConnection = DriverManager.getConnection("jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/mycouncil.db3"));
			String selectProp = "SELECT * from properties where UPRN = ?";
			PreparedStatement dbStatement1 = dbConnection.prepareStatement(selectProp);
			dbStatement1.setString(1, uprn);
			ResultSet dbResult = dbStatement1.executeQuery();;

			if(dbResult.next()){
				//found property

				//get district
				String district = dbResult.getString(15).toUpperCase();

				//get poll station for district
				dbConnection = DriverManager.getConnection("jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/mycouncil.db3"));
				String selectDistrict = "SELECT * from pollingStations where District= ?";
				PreparedStatement dbStatement2 = dbConnection.prepareStatement(selectDistrict);
				dbStatement2.setString(1, district);
				ResultSet dbPollStation = dbStatement2.executeQuery();
				if(dbPollStation.next()){
					//district found
					PollStation districtStation = new PollStation();
					districtStation.setType("district");
					districtStation.setName(dbPollStation.getString(2));
					districtStation.setAddress(dbPollStation.getString(3));
					districtStation.setDistrict(dbPollStation.getString(1));
					districtStation.setEasting(dbPollStation.getDouble("Easting"));
					districtStation.setNorthing(dbPollStation.getDouble("Northing"));
					stations.add(districtStation);
				}else{
					//district not found
				}

				//get poll station for advisory poll
				String selectParishDistrict = "SELECT * from parishPollingRel where District= ?";
				PreparedStatement dbStatement3 = dbConnection.prepareStatement(selectParishDistrict);
				dbStatement3.setString(1, district);
				ResultSet dbPollStationParish = dbStatement3.executeQuery();
				if(dbPollStationParish.next()){
					int parishStation = dbPollStationParish.getInt(2);
					dbConnection = DriverManager.getConnection("jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/mycouncil.db3"));
					String selectParishStation = "SELECT * from parishPollingStations where station_id = ?";
					PreparedStatement dbStatement4 = dbConnection.prepareStatement(selectParishStation);
					dbStatement4.setInt(1, parishStation);
					ResultSet dbParishStation = dbStatement4.executeQuery();
					if(dbParishStation.next()){
						PollStation advisoryStation = new PollStation();
						advisoryStation.setType("advisory");
						advisoryStation.setName(dbParishStation.getString("venue"));
						advisoryStation.setAddress(dbParishStation.getString("address"));
						advisoryStation.setDistrict(district);
						advisoryStation.setEasting(dbParishStation.getDouble("easting"));
						advisoryStation.setNorthing(dbParishStation.getDouble("northing"));
						stations.add(advisoryStation);
					}
				}
			}
			dbStatement1.close();       
		}
		catch (SQLException error){
			error.printStackTrace();
			System.out.println("Sql Exception.");
		}
		try {
			dbConnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stations;
	}	
}

