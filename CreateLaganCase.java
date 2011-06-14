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
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.mail.*;

public class CreateLaganCase extends HttpServlet
   {

   public void doPost(HttpServletRequest request,
                     HttpServletResponse response) 
                    throws ServletException, IOException
      {
      //System.getProperties().put("http.proxyHost", "localhost");
	  //System.getProperties().put("http.proxyPort", "8888");
      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	  DateFormat slaDateFormat = new SimpleDateFormat("EEEEEEEEE, d MMMMMMMMM yyyy 'at' HH:mm:ss");
	  DateFormat voiceSlaDateFormat = new SimpleDateFormat("EEEEEEEEE, d MMMMMMMMM yyyy 'at' h mm a");
	  Date date = new Date();
	  String version = "v0.008";
      String currentDate = dateFormat.format(date);
	  String laganSystem = getServletContext().getInitParameter("laganSystem");
	  String host = getServletContext().getInitParameter("host") + "/" + getServletContext().getServletContextName();
	  String errorEmailTo = getServletContext().getInitParameter("errorEmailTo");
	  String emailFrom = getServletContext().getInitParameter("emailFrom");
	  String smsFrom = getServletContext().getInitParameter("smsFrom");
	  String smtpHost = getServletContext().getInitParameter("smtpHost");
	  String localDialCode = getServletContext().getInitParameter("localDialCode");
	  String textMessageFrom = getServletContext().getInitParameter("textMessageFrom");
	  String twitterTESTConsumerKey = getServletContext().getInitParameter("twitter-TEST-Consumer-Key");
	  String twitterTESTConsumerSecret = getServletContext().getInitParameter("twitter-TEST-Consumer-Secret");
	  String twitterTESTAccessTokenKey = getServletContext().getInitParameter("twitter-TEST-Access-Token-Key");
	  String twitterTESTAccessTokenSecret = getServletContext().getInitParameter("twitter-TEST-Access-Token-Secret");
	  String twitterALLConsumerKey = getServletContext().getInitParameter("twitter-ALL-Consumer-Key");
	  String twitterALLConsumerSecret = getServletContext().getInitParameter("twitter-ALL-Consumer-Secret");
	  String twitterALLAccessTokenKey = getServletContext().getInitParameter("twitter-ALL-Access-Token-Key");
	  String twitterALLAccessTokenSecret = getServletContext().getInitParameter("twitter-ALL-Access-Token-Secret");
      String lat=request.getParameter("lat");
      String lng=request.getParameter("lng");
	  String classificationCode = request.getParameter("classificationCode");
      String problemType=request.getParameter("problemType");
      String details=request.getParameter("problemDetails");
	  String location = request.getParameter("problemLocation");
	  String street = request.getParameter("problemStreet");
	  String descriptionEmail = request.getParameter("descriptionEmail");
	  String eol = System.getProperty("line.separator");
	  String ward = request.getParameter("ward");
	  String sector = request.getParameter("sector");
	  String name = request.getParameter("name");
      String emailAddress=request.getParameter("emailAddress");
	  String phoneNumber = request.getParameter("phoneNumber");
	  String heading = request.getParameter("heading");
	  String pitch = request.getParameter("pitch");
	  String zoom = request.getParameter("zoom");
	  String myCouncilURL = request.getParameter("myCouncilURL");
	  String easting = request.getParameter("easting");
	  String northing = request.getParameter("northing");
	  String laganCaseReference = "";
 	  PrintWriter ajaxResponse = response.getWriter();
	  boolean continueProcessing = true;
	  String[] strErrorEmailTo = { errorEmailTo };
	  String[] strErrorEmailBCC = new String[0];
	  String[] emailBCC = {getServletConfig().getInitParameter("bccEmailAddress")};
	  String slaDate="";
	  String voiceSlaDate = "";

	  if(phoneNumber.length()>3&&phoneNumber.substring(1,3).equals("44"))
	  {
      phoneNumber="0" + phoneNumber.substring(3,phoneNumber.length());
	  }

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
		String errorLine2 = "CreateLaganCase " + version + " - Failed - Authenticating to Lagan";
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
			authenticationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to authenticate to Lagan", emailContents, emailFrom, smtpHost, true);
		}
		catch (MessagingException emailError)
		{
			System.out.println("Email error : " + emailError.toString());
		}
	  }

	  //Create case on Lagan.
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
			  lagan.api.main.FWTCaseCreate caseCreate = new lagan.api.main.FWTCaseCreate();
			  caseCreate.setClassificationEventCode(Integer.parseInt(classificationCode));
			  caseCreate.setTitle("Reported via MyCouncil");
			  caseCreate.setDescription("Enquiry sent from IP: <" + request.getRemoteHost() + ">");
			  laganCaseReference = webInterface.createCase(caseCreate);
			  lagan.api.main.FWTCaseEformNew eForm = new lagan.api.main.FWTCaseEformNew(laganCaseReference, "EnvironmentalServices", "");
			  webInterface.addCaseEform(eForm);
			  lagan.api.main.FWTCaseEformInstance eFormInstance = new lagan.api.main.FWTCaseEformInstance(laganCaseReference, "EnvironmentalServices","");
			  lagan.api.main.FWTEformField eFormFields[] = new lagan.api.main.FWTEformField[20];
			  eFormFields[0] = new lagan.api.main.FWTEformField("cboType", problemType);
			  eFormFields[1] = new lagan.api.main.FWTEformField("txtDetails", details);
			  eFormFields[2] = new lagan.api.main.FWTEformField("txtLocation", location);
			  eFormFields[3] = new lagan.api.main.FWTEformField("txtStreet", street);
			  eFormFields[4] = new lagan.api.main.FWTEformField("txtWard", ward);
			  eFormFields[5] = new lagan.api.main.FWTEformField("txtSector", sector);
			  eFormFields[6] = new lagan.api.main.FWTEformField("txtCustomerName", name);
			  eFormFields[7] = new lagan.api.main.FWTEformField("txtEmail", emailAddress);
			  eFormFields[8] = new lagan.api.main.FWTEformField("txtCustomerTelephone", phoneNumber);
			  eFormFields[9] = new lagan.api.main.FWTEformField("txtLatitude", lat);
			  eFormFields[10] = new lagan.api.main.FWTEformField("txtLongtitude", lng);
			  eFormFields[11] = new lagan.api.main.FWTEformField("txtNotifiedBy", "SelfServe");
			  eFormFields[12] = new lagan.api.main.FWTEformField("txtFormCompletedBy", "MyCouncil");
			  eFormFields[13] = new lagan.api.main.FWTEformField("txtHeading", heading);
			  eFormFields[14] = new lagan.api.main.FWTEformField("txtPitch", pitch);
			  eFormFields[15] = new lagan.api.main.FWTEformField("txtZoom", zoom);
			  eFormFields[16] = new lagan.api.main.FWTEformField("txtDescription", descriptionEmail);
			  eFormFields[17] = new lagan.api.main.FWTEformField("txtEasting", easting);
			  eFormFields[18] = new lagan.api.main.FWTEformField("txtNorthing", northing);
			  eFormFields[19] = new lagan.api.main.FWTEformField("txtCaseID", laganCaseReference);
			  lagan.api.main.FWTCaseEformData eFormData = new lagan.api.main.FWTCaseEformData(eFormInstance, eFormFields);
			  webInterface.writeCaseEformData(eFormData);
			  String[] options = { "all" };
			  lagan.api.main.FWTCaseFullDetailsRequest caseRequest = new lagan.api.main.FWTCaseFullDetailsRequest(laganCaseReference, options);
			  lagan.api.main.FWTCaseFullDetails caseDetails = webInterface.retrieveCaseDetails(caseRequest);
			  lagan.api.main.FWTCaseCoreDetails coreDetails = caseDetails.getCoreDetails();
			  try
			  {
				  slaDate = slaDateFormat.format(coreDetails.getDueDate().getTime());
				  voiceSlaDate = voiceSlaDateFormat.format(coreDetails.getDueDate().getTime());
			  }
			  catch (NullPointerException exceptionError)
			  {
				  slaDate = "not available";
			  }
			  laganCaseReference = laganCaseReference.substring(laganCaseReference.length() - 6);
			  ajaxResponse.println("{\"result\":\"success\",\"callNumber\":\"" + laganCaseReference + "\",\"slaDate\":\"" + slaDate + "\"}");
			  System.out.println("CreateLaganCase " + version + " - " + currentDate + " - Success - " + laganCaseReference);
		  }
		  catch (Exception createCaseError)
		  {
			  ajaxResponse.println("{\"result\":\"failed\",\"reason\":\"Creating case on Lagan\"}");
			  continueProcessing = false;
			  String errorLine1 = "";
			  String errorLine2 = "CreateLaganCase " + version + " - Failed - Creating case on Lagan";
			  String errorLine3 = "Date        : " + currentDate;
			  String errorLine4 = "LaganSystem : " + laganSystem;
			  String errorLine5 = "Error       : " + createCaseError.toString();
			  String errorLine6 = "";
			  System.out.println(errorLine1);
			  System.out.println(errorLine2);
			  System.out.println(errorLine3);
			  System.out.println(errorLine4);
			  System.out.println(errorLine5);
			  System.out.println(errorLine6);
			  createCaseError.printStackTrace();
			  String emailContents = errorLine1 + "<BR>" +
									 errorLine2 + "<BR>" +
									 errorLine3 + "<BR>" +
									 errorLine4 + "<BR>" +
									 errorLine5 + "<BR>" +
									 errorLine6;
			  SendMail caseCreationErrorEmail = new SendMail();
			  try
			  {
				  caseCreationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to create a case on Lagan", emailContents, emailFrom, smtpHost, true);
			  }
			  catch (MessagingException emailError)
			  {
				  System.out.println("Email error : " + emailError.toString());
			  }
		  }
	  }

      //Post Entry to 'All' twitter stream.
	  if (continueProcessing && laganSystem.equals("test") && !twitterTESTConsumerKey.equals("")){
		  TwitterEntry caseTwitterEntry = new TwitterEntry();
		  caseTwitterEntry.createTwitterEntry(
				  host,
				  descriptionEmail, 
				  laganCaseReference,
				  twitterTESTConsumerKey,
				  twitterTESTConsumerSecret,
				  twitterTESTAccessTokenKey,
				  twitterTESTAccessTokenSecret);		  
	  }
	  else{
		  if (continueProcessing && !twitterALLConsumerKey.equals(""))
		  {
			  TwitterEntry caseTwitterEntry = new TwitterEntry();
			  caseTwitterEntry.createTwitterEntry( 
					  host,
					  descriptionEmail, 
					  laganCaseReference,
					  twitterALLConsumerKey,
					  twitterALLConsumerSecret,
					  twitterALLAccessTokenKey,
					  twitterALLAccessTokenSecret);
		  }
		  //Post Entry to Sector twitter stream.
		  if(continueProcessing && !laganSystem.equals("test")){
		     try
		      {
			     TwitterEntry caseTwitterEntry = new TwitterEntry();
			     caseTwitterEntry.createTwitterEntry(
					  host,
					  descriptionEmail,
					  laganCaseReference,
					  getServletContext().getInitParameter("twitter-sector-" + sector + "-Consumer-Key"),
					  getServletContext().getInitParameter("twitter-sector-" + sector + "-Consumer-Secret"),
					  getServletContext().getInitParameter("twitter-sector-" + sector + "-Access-Token-Key"),
					  getServletContext().getInitParameter("twitter-sector-" + sector + "-Access-Token-Secret"));
		     }
		     catch(NullPointerException error){
			     System.out.println("Null Pointer Exception error sending twitter message");
		     }
		  }
	  }

	  //Send the confirmation email.
	  if (continueProcessing)
	  {
		  if (emailAddress.length() > 0)
		  {
			  BufferedReader emailTemplate = new BufferedReader(new FileReader(getServletContext().getRealPath("/email-templates/report-it-confirmation.txt")));
			  String nextLine = "";
			  StringBuffer emailTextBuffer = new StringBuffer();
			  while ((nextLine = emailTemplate.readLine()) != null)
			  {
				  emailTextBuffer.append(nextLine);
			  }
			  emailTemplate.close();
			  String emailTextString = emailTextBuffer.toString();
			  String slaText;
			  if(slaDate.equals("not available")){
			     slaText="This type of problem currently has no target resolution date";
			  }else{
				 slaText="Our target resolution date is " + slaDate;
			  }
			  String amendedEmailTextString = emailTextString.replace("AAA", laganCaseReference);
			  amendedEmailTextString = amendedEmailTextString.replace("BBB", slaText);
			  amendedEmailTextString = amendedEmailTextString.replace("CCC", descriptionEmail);
			  amendedEmailTextString = amendedEmailTextString.replace("DDD", myCouncilURL + "?search=");

			  SendMail email = new SendMail();
			  String[] strEmailTo = { emailAddress };
			  try
			  {
				  email.postMail(strEmailTo, emailBCC, "MyCouncil : Your Call Number is " + laganCaseReference, amendedEmailTextString, emailFrom, smtpHost, true);
			  }
			  catch (MessagingException confirmationError)
			  {
				  continueProcessing = false;
				  String errorLine1 = "";
				  String errorLine2 = "CreateLaganCase " + version + " - Failed - Sending confirmation email";
				  String errorLine3 = "Date        : " + currentDate;
				  String errorLine4 = "LaganSystem : " + laganSystem;
				  String errorLine5 = "Error       : " + confirmationError.toString();
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
				  SendMail confirmationEmailError = new SendMail();
				  try
				  {
					  confirmationEmailError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a confirmation email", emailContents, emailFrom, smtpHost, true);
				  }
				  catch (MessagingException emailError)
				  {
					  System.out.println("Email error : " + emailError.toString());
				  }
			  }
		  }
	  }

	  if (continueProcessing)
	  {
		  phoneNumber = phoneNumber.replaceAll(" ", "");
		  if (phoneNumber.length() == 5 || phoneNumber.length() == 6)
		  {
			  phoneNumber = localDialCode + phoneNumber;
		  }
		  if (phoneNumber.length() > 7 && phoneNumber.length() < 13)
		  {
			  String phoneText = "";
			  String voiceMessagePart1 = "This is a message from " + textMessageFrom + " regarding call number  ";
			  String voiceMessagePart2;
			  if (slaDate.equals("not available"))
			  {
				  voiceMessagePart2 = ". We will notify you when your call has been resolved.";
			  }
			  else
			  {
				  voiceMessagePart2 = ". Your call should be resolved by ";
			  }
			  String voiceCaseReference = "";
			  String tempVoiceSlaDate = "";
			  if (phoneNumber.startsWith("07"))
			  {
				  voiceCaseReference = laganCaseReference;
				  tempVoiceSlaDate = slaDate;
			  }
			  else
			  {
				  for (int currentCharacter = 0; currentCharacter < laganCaseReference.length(); currentCharacter++)
				  {
					  voiceCaseReference = voiceCaseReference + laganCaseReference.substring(currentCharacter, currentCharacter + 1);
					  if (currentCharacter != laganCaseReference.length() - 1)
					  {
						  voiceCaseReference = voiceCaseReference + " ";
					  }
				  }
				  tempVoiceSlaDate = voiceSlaDate;
			  }
			  if (slaDate.equals("not available"))
			  {
				  phoneText = voiceMessagePart1 + voiceCaseReference + voiceMessagePart2;
			  }
			  else
			  {
				  phoneText = voiceMessagePart1 + voiceCaseReference + voiceMessagePart2 + tempVoiceSlaDate + ".";
			  }
			  if (phoneText.length() > 160)
			  {
				  String errorLine1 = "";
				  String errorLine2 = "CreateLaganCase " + version + " - Failed - Sending text message";
				  String errorLine3 = "Date        : " + currentDate;
				  String errorLine4 = "LaganSystem : " + laganSystem;
				  String errorLine5 = "Error       : Text Message Too Long = '" + phoneText + "'";
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
				  SendMail textMessageLengthError = new SendMail();
				  try
				  {
					  textMessageLengthError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a text message", emailContents, emailFrom, smtpHost, true);
				  }
				  catch (MessagingException emailError)
				  {
					  System.out.println("Email error : " + emailError.toString());
				  }
			  }
			  SendMail textMessage = new SendMail();
			  String[] strEmailTo = { phoneNumber + "@smsmaker.com" };
			  try
			  {
				  textMessage.postMail(strEmailTo, emailBCC, "", phoneText, smsFrom, smtpHost, false);
			  }
			  catch (MessagingException textMessageError)
			  {
				  String errorLine1 = "";
				  String errorLine2 = "CreateLaganCase " + version + " - Failed - Sending text message";
				  String errorLine3 = "Date        : " + currentDate;
				  String errorLine4 = "LaganSystem : " + laganSystem;
				  String errorLine5 = "Error       : " + textMessageError.toString();
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
				  SendMail textMessageEmailError = new SendMail();
				  try
				  {
					  textMessageEmailError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a text message", emailContents, emailFrom, smtpHost, true);
				  }
				  catch (MessagingException emailError)
				  {
					  System.out.println("Email error : " + emailError.toString());
				  }
			  }
		  }
	  }
    }
   }