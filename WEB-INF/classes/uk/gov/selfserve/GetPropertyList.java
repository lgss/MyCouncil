package uk.gov.selfserve;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import lagan.api.main.*;

import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;

import com.google.gson.*;


public class GetPropertyList extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String laganSystem = getServletContext().getInitParameter("laganSystem");
		String errorEmailTo = getServletContext().getInitParameter("errorEmailTo");
		String emailFrom = getServletContext().getInitParameter("emailFrom");
		String smtpHost = getServletContext().getInitParameter("smtpHost");
		String[] strErrorEmailTo = { errorEmailTo };
		String[] strErrorEmailBCC = new String[0];
		PrintWriter output = response.getWriter();
		response.setContentType("application/json");
		JsonObject results = new JsonObject();
		JsonArray resultsArray = new JsonArray();

		String postcode = request.getParameter("postCode");
		String callback = request.getParameter("callback");
		boolean cbBool = false;
		
		if(postcode == null || postcode.length() < 6){
			postcode = "";
		} else{
			postcode = postcode.trim();
		}
		
		if (callback != null){
			callback = callback + "(";
			cbBool = true;
		}

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
					  lagan.api.main.FWTPropertySearch propertyRequest = new lagan.api.main.FWTPropertySearch();
					  propertyRequest.setSearchMatch("like_ignore_case");
					  propertyRequest.setPostcode(postcode);
					  lagan.api.main.FWTObjectBriefDetails[] searchResponse = webInterface.searchForProperty(propertyRequest);
					  
					  for(int x = 0; x < searchResponse.length; x++){
						  String objRef = searchResponse[x].getObjectID().getObjectReference(0);
						  String[] objRefList = {objRef};
						  lagan.api.main.FWTObjectID getProperty = new lagan.api.main.FWTObjectID("D3",objRefList);
						  FWTProperty propertyDetails = webInterface.retrieveProperty(getProperty);  
						  String propertyNumber = propertyDetails.getAddressNumber().trim();
						  String propertyAddress = propertyDetails.getBriefDetails().getObjectDescription().trim();
						  JsonObject element = new JsonObject();
						  element.addProperty("addressNumber", propertyNumber);
						  element.addProperty("objectId", objRef);
						  element.addProperty("fullAddress", propertyAddress);
						  resultsArray.add(element);
					  }
			    }
				catch (Exception e){
					
				}
			}catch(Exception e){
				
			}
		}
			if(resultsArray.size() > 0){
				results.addProperty("success", "true");
			} else{
				results.addProperty("success", "false");
				results.addProperty("error", "invalid postcode");
			}
			results.add("results", resultsArray);  
			if(cbBool){
				output.write(callback + results.toString() + ")");
			}else{
				output.write(results.toString());
			}
			output.flush();
		  
	}
	
}

