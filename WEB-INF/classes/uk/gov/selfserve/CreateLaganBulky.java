package uk.gov.selfserve;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;

import com.google.gson.JsonObject;

import lagan.api.main.*;


public class CreateLaganBulky extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

		//config
		String laganSystem = getServletContext().getInitParameter("laganSystem");
		String errorEmailTo = getServletContext().getInitParameter("errorEmailTo");
		String emailFrom = getServletContext().getInitParameter("emailFrom");
		String smtpHost = getServletContext().getInitParameter("smtpHost");
		String[] strErrorEmailTo = { errorEmailTo };
		String[] strErrorEmailBCC = new String[0];
		String caseReference = ""; 
		String objRefKey = "objRef";
		String objRef;
		String objType = "D3";
		String bulkyEventCode = getServletConfig().getInitParameter("bulkyEventCode-test");
		String eformName = getServletConfig().getInitParameter("bulkyEformName-test");;
		
		if(laganSystem.equalsIgnoreCase("live")){
			bulkyEventCode = getServletConfig().getInitParameter("bulkyEventCode");
			eformName = getServletConfig().getInitParameter("bulkyEformName");
		}
		
		int classification = Integer.parseInt(bulkyEventCode);
		boolean casecreated = false;
		PrintWriter writer = response.getWriter();
		response.setContentType("application/json");

		//all parameters (field names)
		Map<String, String[]> qstring = request.getParameterMap();
		Map<String, String[]> params = new HashMap<String, String[]>();
		params.putAll(qstring);
		
		JsonObject results = new JsonObject();


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
				for (int i = 0; i < respHdrs.length; i++){
					webStub.setHeader(respHdrs[i]);
				}
				//create case then add eform
				if(params.containsKey(objRefKey)){
					//set up assoc object details
					FWTObjectBriefDetails property = new FWTObjectBriefDetails();
					FWTObjectID propObj = new FWTObjectID();

					//set object reference and type
					objRef = params.get(objRefKey)[0];
					params.remove(objRefKey);
					String[] propID = {objRef};
					propObj.setObjectReference(propID);
					propObj.setObjectType(objType);
					
					//set assoc object
					property.setObjectDescription("");
					property.setObjectID(propObj);

					FWTCaseCreate createCase = new FWTCaseCreate();
					createCase.setClassificationEventCode(classification);
					createCase.setAssociatedObject(property);
					caseReference = webInterface.createCase(createCase);
					
					if(!caseReference.isEmpty()){
						casecreated = true;
						//initialise the eform instance
						FWTCaseEformNew eform = new FWTCaseEformNew(caseReference,eformName,"");
						webInterface.addCaseEform(eform);
						
						FWTCaseEformInstance eformInstance = new FWTCaseEformInstance(caseReference,eformName,"");
						FWTEformField eFormFields[] = getEformFields(params);
						FWTCaseEformData eformData = new FWTCaseEformData(eformInstance,eFormFields);
						
						//write the eform data to the case
						webInterface.writeCaseEformData(eformData);
					}
				}
			}catch (Exception e)
			{
				e.printStackTrace();
			}	
			
			results.addProperty("success", casecreated);
			if(casecreated){
				results.addProperty("caseref", caseReference);
			}
			writer.write(results.toString());
			writer.flush();
			writer.close();
		}
		
		
		
	}

	public FWTEformField[] getEformFields(Map<String, String[]> params){

		//initialise the array with the new parameter map size
		FWTEformField eFormFields[] = new FWTEformField[params.size()];
		String key;
		String value;

		//create a set of the key values to loop through
		Set set= params.keySet(); 	     
		Iterator itr = set.iterator();
		int index = 0;

		while(itr.hasNext()){
			key = (String) itr.next();
			value = ((String[])params.get(key))[ 0 ];
			eFormFields[index] = new FWTEformField(key,value);
			index++;
		}

		if(eFormFields.length > 0){
			return eFormFields;
		} else{
			return null;
		}
	}
} 
