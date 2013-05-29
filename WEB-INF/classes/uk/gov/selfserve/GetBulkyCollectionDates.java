package uk.gov.selfserve;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

import javax.servlet.*;
import javax.servlet.http.*;
import lagan.api.main.*;

import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;

import com.google.gson.*;


public class GetBulkyCollectionDates extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String laganSystem = getServletContext().getInitParameter("laganSystem");
		String errorEmailTo = getServletContext().getInitParameter("errorEmailTo");
		String emailFrom = getServletContext().getInitParameter("emailFrom");
		String smtpHost = getServletContext().getInitParameter("smtpHost");
		String[] strErrorEmailTo = { errorEmailTo };
		String[] strErrorEmailBCC = new String[0];
		DateFormat caseDate = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		PrintWriter output = response.getWriter();
		response.setContentType("application/json");

		String postcode = request.getParameter("postCode");
		String callback = request.getParameter("callback");
		String eventId = getServletConfig().getInitParameter("eventId-test");
		
		if(laganSystem.equalsIgnoreCase("live")){
			eventId = getServletConfig().getInitParameter("eventId");
		}
		
		int evtId = Integer.parseInt(eventId);
		
		JsonObject results = new JsonObject();
		JsonArray resultsArray = new JsonArray();
		boolean cbBool = false;
		String strCollectionDate = "";
		String allowedCollectionDay = "";
		Date today = new Date();
		ArrayList<Bulky> bulkyList = new ArrayList<Bulky>();
		String[] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		boolean cont = false;
		
		if(postcode == null || postcode.length() < 6){
			postcode = "";
		} else{
			cont = true;
			postcode = postcode.trim();
			allowedCollectionDay = getAllowedDay(postcode);
		}
		
		if (callback != null){
			callback = callback + "(";
			cbBool = true;
		}
		
		if(cont){
		//Authenticate to Lagan
		  LaganLogIn laganLogIn = new LaganLogIn();
		  LogIn objLogIn = laganLogIn.logIn(laganSystem,
			                                getServletContext().getRealPath("/WEB-INF/mycouncil.wsdd"),
											strErrorEmailTo,
											strErrorEmailBCC,
											emailFrom,
											smtpHost);
		  if (objLogIn.getSuccess())
		  {
			  lagan.api.main.FLWebService webService = new lagan.api.main.FLWebServiceLocator(objLogIn.getConfig());
			  org.apache.axis.client.Stub webStub = null;
			  try
			    {
				  lagan.api.main.FLWebInterface webInterface = webService.getFL();
				  webStub = (Stub)webInterface;
				  SOAPHeaderElement[] respHdrs = objLogIn.getStub().getResponseHeaders();
				  
				  for (int i = 0; i < respHdrs.length; i++)
				  {
					  webStub.setHeader(respHdrs[i]);
				  }
				  
				  try
				  	{
					  //property search
					  lagan.api.main.FWTCaseSearch caseRequest = new lagan.api.main.FWTCaseSearch();
					  caseRequest.setQueue("bpm");
					  caseRequest.setStatus("open");
					  caseRequest.setClassificationEventCode(evtId);
					  lagan.api.main.FWTCaseBriefDetails[] searchResponse = webInterface.searchForCases(caseRequest);

					  //loop over all cases and retrieve the eform
					  for(int x = 0; x < searchResponse.length; x++){
						  String[] options = {"eform-data"};
						  String caseRef = searchResponse[x].getCaseReference().toString();
						 //System.out.println("Record: " + x + " / " + caseRef);
						  try{
						  lagan.api.main.FWTCaseFullDetailsRequest laganCaseRq = new FWTCaseFullDetailsRequest(caseRef,options);
						  lagan.api.main.FWTCaseFullDetails laganCaseRsp = webInterface.retrieveCaseDetails(laganCaseRq);
						  lagan.api.main.FWTCaseEformData[] eformDetails = laganCaseRsp.getEformData();
						  lagan.api.main.FWTEformField[] fields = eformDetails[0].getEformData();
						  
						  //find the date field for each eform
						  for(int n = 0; n < fields.length; n++){
							  if(fields[n].getFieldName().equalsIgnoreCase("dtecollectiondate")){
								  Bulky bc = new Bulky();
								  strCollectionDate = fields[n].getFieldValue().toString();
								  //System.out.println("	Collection date: " + strCollectionDate);
								  Date dtCollectionDate = caseDate.parse(strCollectionDate);
								  bc.collectionDate = dtCollectionDate;
								  if(bc.getDay().equalsIgnoreCase(allowedCollectionDay) && (bc.collectionDate.after(today))){
									  bc.collectionCount = 1;
									  if(bulkyList.isEmpty()){
										  bulkyList.add(bc);
									  } else{
										//check if the date exists in the list
										  Boolean exists = false;
										  for(int c = 0; c < bulkyList.size(); c++){
											  String compare = bulkyList.get(c).getLaganDate();
											  if(compare.equals(strCollectionDate)){
												  //increase count by one
												  bulkyList.get(c).collectionCount++;
												  exists = true;
											  }
										  }
										  if(!exists){
											  //add the collection to the list
											  bulkyList.add(bc);
										  }
									  }
								  }
							  } 
						  }
						  }catch(NullPointerException e){
							 
						  }
						  
					  }
			    }
				catch (Exception e){
					
				}
			}catch(Exception e){
				
			}
		}
		  
		  for(int n = 0; n < bulkyList.size(); n++){
			  Calendar tomorrow = Calendar.getInstance();
			  tomorrow.setTime(today);
			  tomorrow.add(Calendar.DATE, 2);
			  if(bulkyList.get(n).collectionDate.before(tomorrow.getTime()) || bulkyList.get(n).collectionCount > 14){
				  bulkyList.remove(n);
			  }
		  }
		  
			if(bulkyList.size() < 4){
				int index = 0;
				Calendar now = Calendar.getInstance();
				now.setTime(today);
				
				//reset time as lagan uses 00:00:00
				now.set(Calendar.HOUR_OF_DAY, 0);
				now.set(Calendar.MINUTE, 0);
				now.set(Calendar.SECOND, 0);
				now.set(Calendar.MILLISECOND, 0);
				
				//christmas break dates
				Calendar xmasSt = Calendar.getInstance();
				Calendar xmasEnd = Calendar.getInstance();
				xmasSt.set(2013, 2, 28, 0, 0, 0);
				xmasEnd.set(2013, 3, 1, 0, 0, 0);
				
				//avoid bookings for the next x number of days
				now.add(Calendar.DATE, 5);
				
				while(bulkyList.size() < 4){
					index = (now.get(Calendar.DAY_OF_WEEK))-1;
					if(now.getTime().before(xmasSt.getTime()) || now.getTime().after(xmasEnd.getTime())){
						if(days[index].equalsIgnoreCase(allowedCollectionDay)){
							boolean exists = false;
							if(!bulkyList.isEmpty()){
								for(int r = 0; r < bulkyList.size(); r++){
									if(now.getTime().compareTo(bulkyList.get(r).collectionDate) == 0){
										exists = true;
									}
								}
							} 
							if(!exists){
								Bulky col = new Bulky();
								col.collectionDate = now.getTime();
								bulkyList.add(col);
							}
						}
					}
					now.add(Calendar.DATE, 1);
				}
			}
		}
			Collections.sort(bulkyList);
			resultsArray = getJsonFromCollections(bulkyList);
			
			//add key properties to response
			if(resultsArray.size() > 0){
				results.addProperty("success", "true");
			} else{
				results.addProperty("success", "false");
				results.addProperty("error", "invalid postcode");
			}
			
			//add the available dates array
			results.add("dates", resultsArray);
			if(cbBool){
				output.write(callback + results.toString() + ")");
			}else{
				output.write(results.toString());
			}
			output.flush();
	}
	
	public JsonArray getJsonFromCollections(ArrayList<Bulky> bulkyList){
		JsonArray resultsArray = new JsonArray();
		String textDate = "";
		String valueDate = "";
		
		for(int z = 0; z < bulkyList.size(); z++){
			if(bulkyList.get(z).collectionCount < 15){
				textDate = bulkyList.get(z).getReadableDate();
				valueDate = bulkyList.get(z).getLaganDate();
				JsonObject collection = new JsonObject();
				collection.addProperty("textDate", textDate);
				collection.addProperty("valueDate", valueDate);
				resultsArray.add(collection);
			}
		}
		
		return resultsArray;
	}
	
	public String getAllowedDay(String postCode){
		
		String day = null;
		if(postCode.length() >= 6){
			int area = Integer.parseInt(postCode.substring(2, 3));
			switch (area){
				case 1:
					day = "Thursday";
					break;
				case 2:
					day = "Thursday";
					break;
				case 3:
					day = "Tuesday";
					break;
				case 4:
					day = "Monday";
					break;
				case 5:
					day = "Monday";
					break;
			}	
		}
		return day;		
	}
	
}

