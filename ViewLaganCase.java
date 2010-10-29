package uk.gov.selfserve;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import lagan.api.auth.*;
import lagan.api.main.*;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;
import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.mail.*;

public class ViewLaganCase extends HttpServlet
   {

   public void doPost(HttpServletRequest request,
                     HttpServletResponse response) 
                    throws ServletException, IOException
      {
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
      Date date = new Date();
	  Calendar today = Calendar.getInstance();
	  String version = "v1.00";
      String currentDate = dateFormat.format(date);
	  String laganSystem = getServletContext().getInitParameter("laganSystem");
	  String errorEmailTo = getServletContext().getInitParameter("errorEmailTo");
	  String errorEmailFrom = getServletContext().getInitParameter("emailFrom");
	  String smtpHost = getServletContext().getInitParameter("smtpHost");
	  String laganCaseReference = "101000" + request.getParameter("caseRef");
 	  PrintWriter ajaxResponse = response.getWriter();
	  boolean continueProcessing = true;
	  String[] strErrorEmailTo = { errorEmailTo };
	  String[] strErrorEmailBCC = new String[0];
	  boolean dueFound = false;

	  //Authenticate to Lagan.
	  EngineConfiguration config = new FileProvider(getServletContext().getRealPath("/WEB-INF/mycouncil.wsdd"));
	  PWCallback pwCallback = new PWCallback();
	  lagan.api.auth.FLAuthService authService = new lagan.api.auth.FLAuthServiceLocator(config);
	  org.apache.axis.client.Stub authStub = null;
	  try
	  {
		  lagan.api.auth.FLAuthWebInterface authInterface = authService.getFLAuth();
 		  authInterface.authenticate();
		  authStub = (Stub)authInterface;            
	  } 
	  catch (Exception authenticationError)
	  {
   	    continueProcessing = false;
		String errorLine1 = "";
		String errorLine2 = "ViewLaganCase " + version + " - Failed - Authenticating to Lagan";
		String errorLine3 = "Date        : " + currentDate;
		String errorLine4 = "LaganSystem : " + laganSystem;
		String errorLine5 = "Error       : " + authenticationError.toString();
		String errorLine6 = "";
		System.out.println(errorLine1);
		System.out.println(errorLine2);
		System.out.println(errorLine3);
		System.out.println(errorLine4);
		System.out.println(errorLine5);
		System.out.println(errorLine6);
		String emailContents = errorLine1 + "<BR>" +
			                   errorLine2 + "<BR>" +
							   errorLine3 + "<BR>" +
							   errorLine4 + "<BR>" +
							   errorLine5 + "<BR>" +
							   errorLine6;
		SendMail authenticationErrorEmail = new SendMail();
		try
		{
			authenticationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to authenticate to Lagan", emailContents, errorEmailFrom, smtpHost, false);
		}
		catch (MessagingException emailError)
		{
			System.out.println("Email error : " + emailError.toString());
		}
	  }

	  //View case on Lagan.
	  if (continueProcessing)
	  {
		  lagan.api.main.FLWebService webService = new lagan.api.main.FLWebServiceLocator(config);
		  org.apache.axis.client.Stub webStub = null;
		  try
		  {
			  lagan.api.main.FLWebInterface webInterface = webService.getFL();
			  webStub = (Stub)webInterface;
			  SOAPHeaderElement[] respHdrs = authStub.getResponseHeaders();
			  for (int i = 0; i < respHdrs.length; i++)
			  {
				  webStub.setHeader(respHdrs[i]);
			  }
			  String[] options = { "all" };
			  lagan.api.main.FWTCaseFullDetailsRequest caseRequest = new lagan.api.main.FWTCaseFullDetailsRequest(laganCaseReference, options);
			  lagan.api.main.FWTCaseFullDetails caseDetails = webInterface.retrieveCaseDetails(caseRequest);
			  lagan.api.main.FWTCaseCoreDetails coreDetails;
			  try
			  {
			  coreDetails = caseDetails.getCoreDetails();
			  }
			  catch (NullPointerException exceptionError)
			  {
				  ajaxResponse.print("{\"result\":\"success\",\"status\":\"not found\"}");
				  return;
			  }
			  ajaxResponse.print("{\"result\":\"success\",\"status\":\"" + coreDetails.getStatus() + "\"");
			  ajaxResponse.print(",\"created\":\"" + dateFormat.format(coreDetails.getOpened().getTime())+"\"");
			  try
			  {
				  ajaxResponse.print(",\"dueDate\":\"" + dateFormat.format(coreDetails.getDueDate().getTime()) + "\"");
				  dueFound = true;
			  }
			  catch (NullPointerException exceptionError)
			  {
			  }
			 String slaColour = "";
   		     if(coreDetails.getStatus().equals("closed")){
                ajaxResponse.print(",\"closed\":\"" + dateFormat.format(coreDetails.getClosed().getTime())+"\"");
				if (dueFound)
				{
					if (coreDetails.getClosed().after(coreDetails.getDueDate()))
					{
						slaColour = "red";
					}
					else
					{
						slaColour = "green";
					}
				}
        	  }
			  if (coreDetails.getStatus().equals("open"))
			  {
				  if (dueFound)
				  {
					  if (today.after(coreDetails.getDueDate()))
					  {
						  slaColour = "red";
					  }
					  else
					  {
						  slaColour = "green";
					  }
				  }
			  }
			  ajaxResponse.print(",\"slaColour\":\"" + slaColour + "\"");
			  try
			  {
			  lagan.api.main.FWTCaseEformData[] eFormData = caseDetails.getEformData();
			  lagan.api.main.FWTEformField[] eFormsFields = eFormData[0].getEformData();
			  for (int currentField = 0; currentField < eFormsFields.length; currentField++)
			  {
				  if (eFormsFields[currentField].getFieldName().equals("cbotype") ||
					  eFormsFields[currentField].getFieldName().equals("txtlongtitude") ||
					  eFormsFields[currentField].getFieldName().equals("txtlatitude") ||
					  eFormsFields[currentField].getFieldName().equals("txtheading") ||
					  eFormsFields[currentField].getFieldName().equals("txtpitch") ||
					  eFormsFields[currentField].getFieldName().equals("txtzoom") ||
					  eFormsFields[currentField].getFieldName().equals("txtstreet") ||
					  eFormsFields[currentField].getFieldName().equals("txtward"))
				  {
					  ajaxResponse.print(",\"" + eFormsFields[currentField].getFieldName() + "\"");
					  ajaxResponse.print(":\"" + eFormsFields[currentField].getFieldValue() + "\"");
				  }
			  }
			  }
			  catch (NullPointerException exceptionError)
			  {
				  ajaxResponse.print(",\"eForm\":\"not available\"");
			  }
			  ajaxResponse.println("}");
		  }
		  catch (Exception viewCaseError)
		  {
			  ajaxResponse.print("{\"result\":\"failed\",\"reason\":\"Viewing case on Lagan\"}");
			  continueProcessing = false;
			  String errorLine1 = "";
			  String errorLine2 = "CreateLaganCase " + version + " - Failed - Viewing case on Lagan";
			  String errorLine3 = "Date        : " + currentDate;
			  String errorLine4 = "LaganSystem : " + laganSystem;
			  String errorLine5 = "Error       : " + viewCaseError.toString();
			  String errorLine6 = "";
			  System.out.println(errorLine1);
			  System.out.println(errorLine2);
			  System.out.println(errorLine3);
			  System.out.println(errorLine4);
			  System.out.println(errorLine5);
			  System.out.println(errorLine6);
			  viewCaseError.printStackTrace();
			  String emailContents = errorLine1 + "<BR>" +
									 errorLine2 + "<BR>" +
									 errorLine3 + "<BR>" +
									 errorLine4 + "<BR>" +
									 errorLine5 + "<BR>" +
									 errorLine6;
			  SendMail caseCreationErrorEmail = new SendMail();
			  try
			  {
				  caseCreationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to view a case on Lagan", emailContents, errorEmailFrom, smtpHost, false);
			  }
			  catch (MessagingException emailError)
			  {
				  System.out.println("Email error : " + emailError.toString());
			  }
		  }
	  }
     }
   }