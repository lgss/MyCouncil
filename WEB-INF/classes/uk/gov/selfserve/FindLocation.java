package uk.gov.selfserve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Polygon;

import javax.mail.MessagingException;

import uk.me.jstott.jcoord.*;
import uk.gov.selfserve.LocationDetails;

public class FindLocation
{
	boolean locationFound;
	int numOfWards;
	double latitude;
	double longitude;
	Connection dbConnection;
	PreparedStatement psQuery1;
	PreparedStatement psQuery2;
	PreparedStatement psQuery3;
	ResultSet dbResult1;
	ResultSet dbResult2;
	ResultSet dbResult3;
	String smtpHost;
	String emailFrom;
	String[] strErrorEmailTo;
	String[] strErrorEmailBCC;
	String dbLocation;
	Integer sectorNumber;

	public FindLocation(double latitude,double longitude,String smtpHost,String emailFrom,String[] strErrorEmailTo,String[] strErrorEmailBCC,String dbLocation) {
		this.latitude=latitude;
		this.longitude=longitude;
		this.smtpHost=smtpHost;
		this.emailFrom=emailFrom;
		this.strErrorEmailTo=strErrorEmailTo;
		this.strErrorEmailBCC=strErrorEmailBCC;
		this.dbLocation=dbLocation;
	}
	
    public LocationDetails getLocation() {  
    	
    	LocationDetails thisLocation=new LocationDetails();
    	
    	thisLocation.setSuccess(false);
 
    	try
        {
  		Class.forName("org.sqlite.JDBC");
  	    }
  	    catch (ClassNotFoundException error)
  	    {
  		System.out.println("{\"name\":\"ClassNotFoundException\"}");
  	    }
   
  	    try{
    		String sqlQuery = "SELECT COUNT(wardNumber) FROM wards";
    		dbConnection = DriverManager.getConnection(dbLocation);
    			psQuery1 = dbConnection.prepareStatement( sqlQuery );
    			dbResult1 = psQuery1.executeQuery();
    			if(dbResult1.next()){
    				numOfWards=dbResult1.getInt(1);
    			}	    	
  	    }
  	    catch (SQLException error)
    	{
    		System.out.println("{\"message\":\"" + error.toString() + "\"}");
    	}
  	    
        int[] polygonCounts = new int[numOfWards];

        LatLng latLng = new LatLng(latitude,longitude);
        latLng.toOSGB36();
        OSRef northingEasting = latLng.toOSRef();
    	thisLocation.setNorthing(String.valueOf(Math.round(northingEasting.getNorthing())));
    	thisLocation.setEasting(String.valueOf(Math.round(northingEasting.getEasting())));

    	      
    	try{
    		String sqlQuery = "SELECT COUNT(wardNumber) from wardPolygons where wardNumber = ?";
    		dbConnection = DriverManager.getConnection(dbLocation);
    		for(int currentWard=0;currentWard<numOfWards;currentWard++){
    			psQuery1 = dbConnection.prepareStatement( sqlQuery );
    			psQuery1.setString( 1, Integer.toString(currentWard+1)); 
    			dbResult1 = psQuery1.executeQuery();
    			if(dbResult1.next()){
    				polygonCounts[currentWard]=dbResult1.getInt(1);
    			}
    		}
    		sqlQuery = "SELECT northing,easting from wardPolygons WHERE wardNumber = ? ORDER BY vector ASC";
    		String sqlQuery2 = "SELECT wardName,sectorName,"+
    		                   "sectorHashtag,sectorConsumerKey,sectorConsumerSecret,sectorAccessTokenKey,sectorAccessTokenSecret," +
    		                   "wardHashtag,wardConsumerKey,wardConsumerSecret,wardAccessTokenKey,wardAccessTokenSecret," +
    		                    "sectors.SectorNumber " +
    		                   "from wards,sectors where wardNumber = ? AND wards.SectorNumber=sectors.SectorNumber ORDER BY wardNumber";
    		String sqlQuery3 = "SELECT classificationCode,problemDescription,problemEmailDescription " + 
    		                   "FROM classificationCodes,problems " + 
    		                   "WHERE sectorNumber=? AND classificationCodes.problemNumber=problems.problemNumber";
    		String sqlQuery4 = "SELECT COUNT(problemNumber) FROM problems"; 
    		for(int currentWard=0;currentWard<numOfWards;currentWard++){
    			int[] northings=new int[polygonCounts[currentWard]];
    			int[] eastings=new int[polygonCounts[currentWard]];
    			psQuery1 = dbConnection.prepareStatement( sqlQuery );
    			psQuery1.setString( 1, Integer.toString(currentWard+1)); 
    			dbResult1 = psQuery1.executeQuery( );
    			int currentVector=0;
    			while(dbResult1.next()){
    				northings[currentVector]=dbResult1.getInt(1);
    				eastings[currentVector]=dbResult1.getInt(2);					
    				currentVector++;
    			}

    			Polygon authorityMap = new Polygon(eastings,northings,polygonCounts[currentWard]);
    			if(authorityMap.contains(northingEasting.getEasting(),northingEasting.getNorthing())||currentWard==numOfWards-1){
    				psQuery2 = dbConnection.prepareStatement( sqlQuery2 );
    				psQuery2.setString( 1, Integer.toString(currentWard+1));
    				dbResult2 = psQuery2.executeQuery();
    				if(dbResult2.next()){
    					if(!(currentWard==numOfWards-1)){
    					   thisLocation.setSuccess(true);
    					}
    					thisLocation.setWard(dbResult2.getString(1));
    					thisLocation.setSector(dbResult2.getString(2));
    					thisLocation.setSectorHashtag(dbResult2.getString(3));
    					thisLocation.setSectorConsumerKey(dbResult2.getString(4));
    					thisLocation.setSectorConsumerSecret(dbResult2.getString(5));
    					thisLocation.setSectorAccessTokenKey(dbResult2.getString(6));
    					thisLocation.setSectorAccessTokenSecret(dbResult2.getString(7));
    					thisLocation.setWardHashtag(dbResult2.getString(8));
    					thisLocation.setWardConsumerKey(dbResult2.getString(9));
    					thisLocation.setWardConsumerSecret(dbResult2.getString(10));
    					thisLocation.setWardAccessTokenKey(dbResult2.getString(11));
    					thisLocation.setWardAccessTokenSecret(dbResult2.getString(12));
    					sectorNumber=dbResult2.getInt(13);
    				}
    			}
    			if(thisLocation.getSuccess()||(currentWard==numOfWards-1)){
    				psQuery3 = dbConnection.prepareStatement( sqlQuery4 );
    				dbResult3 = psQuery3.executeQuery();
    				int numOfProblems=0;
    				if(dbResult3.next()){
    					numOfProblems=dbResult3.getInt(1)+1;
    				}
    				psQuery3 = dbConnection.prepareStatement( sqlQuery3 );
    				psQuery3.setString( 1, Integer.toString(sectorNumber));
    				dbResult3 = psQuery3.executeQuery();
    				Integer[] classificationCodes=new Integer[numOfProblems];
    				String[] problemDescriptions=new String[numOfProblems];
    				String[] problemEmailDescriptions=new String[numOfProblems];
    				int currentProblem=1;
    				while(dbResult3.next()){
    					classificationCodes[currentProblem]=dbResult3.getInt(1);
    					problemDescriptions[currentProblem]=dbResult3.getString(2);
    					problemEmailDescriptions[currentProblem]=dbResult3.getString(3);
    					currentProblem++;
    				}
    				thisLocation.setClassificationCodes(classificationCodes);
    				thisLocation.setProblemDescriptions(problemDescriptions);
    				thisLocation.setProblemEmailDescriptions(problemEmailDescriptions);
    				currentWard=numOfWards;
    			}
    	     }
    		if(!thisLocation.getSuccess()){
    			String errorLine1 = "";
    			String errorLine2 = "FindLocation Failed";
    			String errorLine3 = "Latitude="+latitude;
    			String errorLine4 = "Longitude="+longitude;
    			System.out.println(errorLine1);
    			System.out.println(errorLine2);
    			System.out.println(errorLine3);
    			System.out.println(errorLine4);
    			String emailContents = errorLine1 + "<BR>" +
    				                   errorLine2 + "<BR>" +
    								   errorLine3 + "<BR>" +
    								   errorLine4;
    			SendMail authenticationErrorEmail = new SendMail();
    			try
    			{
    				authenticationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to find a location", emailContents, emailFrom, smtpHost, true);
    			}
    			catch (MessagingException emailError)
    			{
    				System.out.println("Email error : " + emailError.toString());
    			}
    		}
    	}
    	catch (SQLException error)
    	{
    		System.out.println("{\"message\":\"" + error.toString() + "\"}");
    	}
    	finally {  
            try {  
                dbResult1.close(); 
                dbResult2.close(); 
                dbResult3.close();
                psQuery1.close();  
                psQuery2.close(); 
                psQuery3.close();
                dbConnection.close();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  	
    	return thisLocation;
    }

   }