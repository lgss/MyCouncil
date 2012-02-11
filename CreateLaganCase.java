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

import java.util.Calendar;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.mail.*;

public class CreateLaganCase extends HttpServlet
   {
	private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request,
                     HttpServletResponse response) 
                    throws ServletException, IOException
      {
      //System.getProperties().put("http.proxyHost", "localhost");
	  //System.getProperties().put("http.proxyPort", "80");
      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	  DateFormat slaDateFormat = new SimpleDateFormat("EEEEEEEEE, d MMMMMMMMM yyyy 'at' HH:mm:ss");
	  DateFormat voiceSlaDateFormat = new SimpleDateFormat("EEEEEEEEE, d MMMMMMMMM yyyy 'at' h mm a");
	  DateFormat tweetMonth = new SimpleDateFormat("MMM");
	  Date date = new Date();
	  String version = "v1.001";
      String currentDate = dateFormat.format(date);
	  String laganSystem = getServletContext().getInitParameter("laganSystem");
	  String host = getServletContext().getInitParameter("host") + "/" + getServletContext().getServletContextName();
	  String errorEmailTo = getServletContext().getInitParameter("errorEmailTo");
	  String emailFrom = getServletContext().getInitParameter("emailFrom");
	  String smsFrom = getServletContext().getInitParameter("smsFrom");
	  String smtpHost = getServletContext().getInitParameter("smtpHost");
	  String contactNumber = getServletContext().getInitParameter("contactNumber");
	  String localDialCode = getServletContext().getInitParameter("localDialCode");
	  String textMessageFrom = getServletContext().getInitParameter("textMessageFrom");
	  String googleURLAPIKey = getServletContext().getInitParameter("googleURLAPIKey");
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
	  String ward = request.getParameter("ward");
	  String sector = request.getParameter("sector");
	  String name = request.getParameter("name");
      String emailAddress=request.getParameter("emailAddress");
	  String phoneNumber = request.getParameter("phoneNumber");
	  String heading = request.getParameter("heading");
	  String pitch = request.getParameter("pitch");
	  String zoom = request.getParameter("zoom");
	  String easting = request.getParameter("easting");
	  String northing = request.getParameter("northing");
	  String laganCaseReference = "";
	  String laganFullCaseReference = "";
 	  PrintWriter ajaxResponse = response.getWriter();
	  boolean continueProcessing = true;
	  String[] strErrorEmailTo = { errorEmailTo };
	  String[] strErrorEmailBCC = new String[0];
	  String[] emailBCC = {getServletConfig().getInitParameter("bccEmailAddress")};
	  String twitterAllHashTag = getServletConfig().getInitParameter("twitterAllHashTag");
	  String twitterSectorHashTag = getServletConfig().getInitParameter("twitterSectorHashTag");
	  String slaDate="";
	  String voiceSlaDate = "";
	  String slaDay = "";
	  String shortenedURLforEmail="";
	  String shortenedURLforTwitter="";
	  String shortenedURLforFacebook="";

	  if(phoneNumber.length()>3&&phoneNumber.substring(1,3).equals("44"))
	  {
      phoneNumber="0" + phoneNumber.substring(3,phoneNumber.length());
	  }

	  //Authenticate to Lagan.
	  EngineConfiguration config = new FileProvider(getServletContext().getRealPath("/WEB-INF/mycouncil.wsdd"));
	  FLAuthService authService = new FLAuthServiceLocator(config);
	  org.apache.axis.client.Stub authStub = null;
	  try
	  {
		  FLAuthWebInterface authInterface = authService.getFLAuth();
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
		  FLWebService webService = new FLWebServiceLocator(config);
		  org.apache.axis.client.Stub webStub = null;
		  try
		  {
			  FLWebInterface webInterface = webService.getFL();
			  webStub = (Stub)webInterface;
			  SOAPHeaderElement[] respHdrs = authStub.getResponseHeaders();
			  for (int i = 0; i < respHdrs.length; i++)
			  {
				  webStub.setHeader(respHdrs[i]);
			  }
			  FWTCaseCreate caseCreate = new FWTCaseCreate();
			  caseCreate.setClassificationEventCode(Integer.parseInt(classificationCode));
			  caseCreate.setTitle("Reported via MyCouncil");
			  caseCreate.setDescription("Enquiry sent from IP: <" + request.getRemoteHost() + ">");
			  laganFullCaseReference = webInterface.createCase(caseCreate);
			  laganCaseReference = laganFullCaseReference.substring(laganFullCaseReference.length() - 6);;
			  
			  //Get shortened URLs
			  URLShortener urlShortener = new URLShortener();
			  shortenedURLforEmail = urlShortener.shortenURL(host + "/?search=" + laganCaseReference + "&url=1",googleURLAPIKey);
			  shortenedURLforTwitter = urlShortener.shortenURL(host + "/?search=" + laganCaseReference + "&url=2",googleURLAPIKey);
			  shortenedURLforFacebook = urlShortener.shortenURL(host + "/?search=" + laganCaseReference + "&url=3",googleURLAPIKey);

			  FWTCaseEformNew eForm = new FWTCaseEformNew(laganFullCaseReference, "EnvironmentalServices", "");
			  webInterface.addCaseEform(eForm);
			  FWTCaseEformInstance eFormInstance = new FWTCaseEformInstance(laganFullCaseReference, "EnvironmentalServices","");
			  FWTEformField eFormFields[] = new FWTEformField[23];
			  eFormFields[0] = new FWTEformField("cboType", problemType);
			  eFormFields[1] = new FWTEformField("txtDetails", details);
			  eFormFields[2] = new FWTEformField("txtLocation", location);
			  eFormFields[3] = new FWTEformField("txtStreet", street);
			  eFormFields[4] = new FWTEformField("txtWard", ward);
			  eFormFields[5] = new FWTEformField("txtSector", sector);
			  eFormFields[6] = new FWTEformField("txtCustomerName", name);
			  eFormFields[7] = new FWTEformField("txtEmail", emailAddress);
			  eFormFields[8] = new FWTEformField("txtCustomerTelephone", phoneNumber);
			  eFormFields[9] = new FWTEformField("txtLatitude", lat);
			  eFormFields[10] = new FWTEformField("txtLongtitude", lng);
			  eFormFields[11] = new FWTEformField("txtNotifiedBy", "SelfServe");
			  eFormFields[12] = new FWTEformField("txtFormCompletedBy", "MyCouncil");
			  eFormFields[13] = new FWTEformField("txtHeading", heading);
			  eFormFields[14] = new FWTEformField("txtPitch", pitch);
			  eFormFields[15] = new FWTEformField("txtZoom", zoom);
			  eFormFields[16] = new FWTEformField("txtHumanDescription", descriptionEmail);
			  eFormFields[17] = new FWTEformField("txtEasting", easting);
			  eFormFields[18] = new FWTEformField("txtNorthing", northing);
			  eFormFields[19] = new FWTEformField("txtCaseID", laganFullCaseReference);
			  eFormFields[20] = new FWTEformField("txtShortUrlTwitter", shortenedURLforTwitter);
			  eFormFields[21] = new FWTEformField("txtShortUrlFacebook", shortenedURLforFacebook);
			  eFormFields[22] = new FWTEformField("txtShortUrlEmail", shortenedURLforEmail);
			  FWTCaseEformData eFormData = new FWTCaseEformData(eFormInstance, eFormFields);
			  webInterface.writeCaseEformData(eFormData);
			  String[] options = { "all" };
			  FWTCaseFullDetailsRequest caseRequest = new FWTCaseFullDetailsRequest(laganFullCaseReference, options);
			  FWTCaseFullDetails caseDetails = webInterface.retrieveCaseDetails(caseRequest);
			  FWTCaseCoreDetails coreDetails = caseDetails.getCoreDetails();
			  try
			  {
				  slaDate = slaDateFormat.format(coreDetails.getDueDate().getTime());
				  voiceSlaDate = voiceSlaDateFormat.format(coreDetails.getDueDate().getTime());
				  
				  Calendar weekFromToday = Calendar.getInstance();
				  weekFromToday.setTime(date);
				  weekFromToday.add(Calendar.DATE, 7);
				  
				  if(coreDetails.getDueDate().after(weekFromToday)){
					 slaDay="by " + String.valueOf(coreDetails.getDueDate().get(Calendar.DAY_OF_MONTH));
					 
					 if(coreDetails.getDueDate().get(Calendar.DAY_OF_MONTH) % 100 - coreDetails.getDueDate().get(Calendar.DAY_OF_MONTH) % 10 == 10) {
						 slaDay+="th";
					 }
					 else{
					  switch (coreDetails.getDueDate().get(Calendar.DAY_OF_MONTH) % 10) {
					  case 1:
						  slaDay+="st";
					  case 2:
						  slaDay+="nd";
					  case 3:
						  slaDay+="rd";
					  default:
						  slaDay+="th";
					  }
					 }
					 
					 slaDay+= " " + tweetMonth.format(coreDetails.getDueDate().getTime());
				  }
				  else{
				  switch (coreDetails.getDueDate().get(Calendar.DAY_OF_WEEK)) {
		            case 1:  slaDay = "by Sunday"; break;
		            case 2:  slaDay = "by Monday"; break;
		            case 3:  slaDay = "by Tuesday"; break;
		            case 4:  slaDay = "by Wednesday"; break;
		            case 5:  slaDay = "by Thursday"; break;
		            case 6:  slaDay = "by Friday"; break;
		            case 7:  slaDay = "by Saturday"; break;
		            default: slaDay = "asap"; break;
				  } 
		        }
				  
			  }
			  catch (NullPointerException exceptionError)
			  {
				  slaDate = "not available";
				  slaDay = "asap";
			  }
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
	  String xmlWard=ward.replace(" ","");
	  xmlWard=xmlWard.replace("&","");
      //Post twitter messages.
	  String twitterMessage="We'll be cleaning up " + descriptionEmail + " " + slaDay + ". More details " + shortenedURLforTwitter;
	  if (continueProcessing && laganSystem.equals("test") && !twitterTESTConsumerKey.equals("")){
		  //All stream TEST
		  TwitterEntry caseTwitterEntry = new TwitterEntry();
		  try
	      {
  		    caseTwitterEntry.createTwitterEntry(
				  ward + " : " + twitterMessage,
                  currentDate,
                  strErrorEmailTo,
                  strErrorEmailBCC,
                  emailFrom,
                  smtpHost,
				  twitterTESTConsumerKey,
				  twitterTESTConsumerSecret,
				  twitterTESTAccessTokenKey,
				  twitterTESTAccessTokenSecret);
		     }
		     catch(NullPointerException error){
			     System.out.println("Null Pointer Exception error sending ALL twitter message (TEST)");
		     }		
		  //Sector stream TEST
		  caseTwitterEntry = new TwitterEntry();
		  try
	      {
		    caseTwitterEntry.createTwitterEntry(
		    	  getServletContext().getInitParameter("twitter-sector-" + sector + "-Hashtag").substring(1) + " : " + twitterMessage,
		    	  currentDate,
                  strErrorEmailTo,
                  strErrorEmailBCC,
                  emailFrom,
                  smtpHost,
                  twitterTESTConsumerKey,
                  twitterTESTConsumerSecret,
                  twitterTESTAccessTokenKey,
                  twitterTESTAccessTokenSecret);
		     }
		     catch(NullPointerException error){
			     System.out.println("Null Pointer Exception error sending Sector twitter message (TEST)");
		     }		  
		  //Ward stream TEST  
		  caseTwitterEntry = new TwitterEntry();
		  try
		      {
			    caseTwitterEntry.createTwitterEntry(
			    	  getServletContext().getInitParameter("twitter-ward-" + xmlWard + "-Hashtag").substring(1) + " : " + twitterMessage,
			    	  currentDate,
	                  strErrorEmailTo,
	                  strErrorEmailBCC,
	                  emailFrom,
	                  smtpHost,
                      twitterTESTConsumerKey,
                      twitterTESTConsumerSecret,
                      twitterTESTAccessTokenKey,
                      twitterTESTAccessTokenSecret);
		     }
		     catch(NullPointerException error){
			     System.out.println("Null Pointer Exception error sending Ward twitter message (TEST)");
		     }
		     try
		      {
		    	 //TwitterEntry caseTwitterEntry = new TwitterEntry();
		    	 caseTwitterEntry = new TwitterEntry();
			     caseTwitterEntry.createTwitterEntry(
			    	  getServletContext().getInitParameter("twitter-ward-" + xmlWard + "-Hashtag").substring(1) + " : " + twitterMessage,
			    	  currentDate,
	                  strErrorEmailTo,
	                  strErrorEmailBCC,
	                  emailFrom,
	                  smtpHost,
					  getServletContext().getInitParameter("twitter-ward-" + xmlWard + "-Consumer-Key"),
					  getServletContext().getInitParameter("twitter-ward-" + xmlWard + "-Consumer-Secret"),
					  getServletContext().getInitParameter("twitter-ward-" + xmlWard + "-Access-Token-Key"),
					  getServletContext().getInitParameter("twitter-ward-" + xmlWard + "-Access-Token-Secret"));
		     }
		     catch(NullPointerException error){
			     System.out.println("Null Pointer Exception error sending WARD twitter message");
		     }		  
	  }
	  else{
		  if (continueProcessing && !twitterALLConsumerKey.equals(""))
		  {		     
		  try
	         {
			  TwitterEntry caseTwitterEntry = new TwitterEntry();
			  caseTwitterEntry.createTwitterEntry( 
					  ward + " : " + twitterMessage + " " + twitterAllHashTag,
	                  currentDate,
	                  strErrorEmailTo,
	                  strErrorEmailBCC,
	                  emailFrom,
	                  smtpHost,
					  twitterALLConsumerKey,
					  twitterALLConsumerSecret,
					  twitterALLAccessTokenKey,
					  twitterALLAccessTokenSecret);
		     }
		     catch(NullPointerException error){
			     System.out.println("Null Pointer Exception error sending ALL twitter message");
		     }
	      }
		  //Post Entry to Sector twitter stream.
		  if(continueProcessing && !laganSystem.equals("test")){
		     try
		      {
			     TwitterEntry caseTwitterEntry = new TwitterEntry();
			     caseTwitterEntry.createTwitterEntry(
			    	  getServletContext().getInitParameter("twitter-sector-" + sector + "-Hashtag") + " : " + twitterMessage + " " + twitterSectorHashTag,
			    	  currentDate,
	                  strErrorEmailTo,
	                  strErrorEmailBCC,
	                  emailFrom,
	                  smtpHost,
					  getServletContext().getInitParameter("twitter-sector-" + sector + "-Consumer-Key"),
					  getServletContext().getInitParameter("twitter-sector-" + sector + "-Consumer-Secret"),
					  getServletContext().getInitParameter("twitter-sector-" + sector + "-Access-Token-Key"),
					  getServletContext().getInitParameter("twitter-sector-" + sector + "-Access-Token-Secret"));
		     }
		     catch(NullPointerException error){
			     System.out.println("Null Pointer Exception error sending SECTOR twitter message");
		     }
		  }
		  //Post Entry to Ward twitter stream.
//		  if(continueProcessing && !laganSystem.equals("test")){
//		  }
	  }
	  
	  //Write case reference to database, so it can be monitored until it is closed.
	  if(continueProcessing){
		  try
			{
				Class.forName("org.sqlite.JDBC");
			}
			catch (ClassNotFoundException error)
			{
				ajaxResponse.print("{\"name1\":\"ClassNotFoundException\"}");
			}
			try
			{
				Connection dbConnection = DriverManager.getConnection("jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/mycouncil.db3"));
				Statement dbStatement = dbConnection.createStatement();
				dbStatement.executeUpdate("INSERT INTO openCases VALUES (\"" + laganFullCaseReference + "\")");
				dbConnection.close();
			}
			catch (SQLException error)
			{
				try{
				   Connection dbConnection = DriverManager.getConnection("jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/mycouncil.db3"));
				   dbConnection.close();
				}
				catch (SQLException error2){};
				continueProcessing = false;
				String errorLine1 = "";
				String errorLine2 = "CreateLaganCase " + version + " - Failed - Writing to OpenCases Table";
				String errorLine3 = "Date        : " + currentDate;
				String errorLine4 = "LaganSystem : " + laganSystem;
				String errorLine5 = "Error       : " + error.toString();
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
					  confirmationEmailError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to update OpenCases table", emailContents, emailFrom, smtpHost, true);
				  }
				  catch (MessagingException emailError)
				  {
					  System.out.println("Email error : " + emailError.toString());
				  }
			}
			finally{
				try{
					Connection dbConnection = DriverManager.getConnection("jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/mycouncil.db3"));
					dbConnection.close();
				}
				catch(SQLException error){
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
			  amendedEmailTextString = amendedEmailTextString.replace("DDD", shortenedURLforEmail);
			  amendedEmailTextString = amendedEmailTextString.replace("EEE", contactNumber);
			  
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