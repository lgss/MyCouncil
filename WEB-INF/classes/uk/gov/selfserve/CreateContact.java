package uk.gov.selfserve;

import java.io.*;
import java.net.URLDecoder;

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
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.mail.*;

public class CreateContact extends HttpServlet
   {
	private static final long serialVersionUID = 1L;
	
public void doPost(HttpServletRequest request,
                     HttpServletResponse response) 
                    throws ServletException, IOException
      {
      //System.getProperties().put("http.proxyHost", "localhost");
	  //System.getProperties().put("http.proxyPort", "80");
	  System.out.println("creating Contact");
	  DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	  DateFormat slaDateFormat = new SimpleDateFormat("EEEEEEEEE, d MMMMMMMMM yyyy 'at' HH:mm:ss");
	  DateFormat voiceSlaDateFormat = new SimpleDateFormat("EEEEEEEEE, d MMMMMMMMM yyyy 'at' h mm a");
	  DateFormat tweetMonth = new SimpleDateFormat("MMM");
	  Date date = new Date();
	  String version = "v1.001";
      String currentDate = dateFormat.format(date);
	  String laganSystem = getServletContext().getInitParameter("laganSystem");
	  String errorEmailTo = getServletContext().getInitParameter("errorEmailTo");
	  String emailFrom = getServletContext().getInitParameter("emailFrom");
	  String smsFrom = getServletContext().getInitParameter("smsFrom");
	  String smtpHost = getServletContext().getInitParameter("smtpHost");
	  String localDialCode = getServletContext().getInitParameter("localDialCode");
	  String textMessageFrom = getServletContext().getInitParameter("textMessageFrom");
	  
      String sourceOfContact=request.getHeader("dataSource");
	  String classificationCode = getServletConfig().getInitParameter("classificationCode-" + sourceOfContact + "-" + laganSystem);
	  System.out.println("classificationCode=" + sourceOfContact + "-" + laganSystem);
	  String deviceID=request.getHeader("deviceID");
	  String emailAddress=request.getHeader("emailAddress");
	  String phoneNumber=request.getHeader("phoneNumber");
	  String service=request.getHeader("service");
	  String team=request.getHeader("team");
	  String reason=request.getHeader("reason");
	  String address=request.getHeader("Postcode");
	  String name=request.getHeader("name");
	  String details=request.getHeader("details");
	  String laganCaseReference = "";
	  String laganFullCaseReference = "";
 	  PrintWriter ajaxResponse = response.getWriter();
	  boolean continueProcessing = true;
	  String[] strErrorEmailTo = { errorEmailTo };
	  String[] strErrorEmailBCC = new String[0];
	  String[] emailBCC = {getServletConfig().getInitParameter("bccEmailAddress")};
	  String slaDate="";
	  String voiceSlaDate = "";
	  String slaDay = "";
	  String shortenedURLforEmail="";

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
			authenticationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil(CreateContact) has failed to authenticate to Lagan", emailContents, emailFrom, smtpHost, true);
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
			  
			  details = URLDecoder.decode(details, "UTF-8");
			  
			  FWTCaseCreate caseCreate = new FWTCaseCreate();
			  caseCreate.setClassificationEventCode(Integer.parseInt(classificationCode));
			  caseCreate.setTitle("Reported via " + sourceOfContact);
			  caseCreate.setDescription("Enquiry sent from IP: <" + request.getRemoteHost() + ">");
			  laganFullCaseReference = webInterface.createCase(caseCreate);
			  laganCaseReference = laganFullCaseReference.substring(laganFullCaseReference.length() - 6);;

			  FWTCaseEformNew eForm = new FWTCaseEformNew(laganFullCaseReference, "ContactForm", "");
			  webInterface.addCaseEform(eForm);
			  FWTCaseEformInstance eFormInstance = new FWTCaseEformInstance(laganFullCaseReference, "ContactForm","");
			  FWTEformField eFormFields[] = new FWTEformField[8];
			  eFormFields[0] = new FWTEformField("cboService", service);
			  eFormFields[1] = new FWTEformField("cboTeam", team);
			  eFormFields[2] = new FWTEformField("cboReason", reason);
			  eFormFields[3] = new FWTEformField("txtName", name);
			  eFormFields[4] = new FWTEformField("txtAddress", address);
			  eFormFields[5] = new FWTEformField("txtEmail", emailAddress);
			  eFormFields[6] = new FWTEformField("txtTelephone", phoneNumber);
			  eFormFields[7] = new FWTEformField("txtDetails", details);
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
						  break;
					  case 2:
						  slaDay+="nd";
						  break;
					  case 3:
						  slaDay+="rd";
						  break;
					  default:
						  slaDay+="th";
						  break;
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
			  if(slaDay.equals("asap")){
				  ajaxResponse.println("<response><result>"+"success"+"</result>"+"<callNumber>"+ laganCaseReference +"</callNumber>"+"<slaDate>"+ slaDay +"</slaDate></response>");  
			  }else{
				  ajaxResponse.println("<response><result>"+"success"+"</result>"+"<callNumber>"+ laganCaseReference +"</callNumber>"+"<slaDate>"+ slaDay.substring(3) +"</slaDate></response>");  
			  }System.out.println("CreateLaganCase " + version + " - " + currentDate + " - Success - " + laganCaseReference);
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
	  
	  //Send the confirmation email.
//	  if (continueProcessing)
//	  {
//		  if (emailAddress.length() > 0)
//		  {
//			  BufferedReader emailTemplate = new BufferedReader(new FileReader(getServletContext().getRealPath("/email-templates/report-it-confirmation.txt")));
//			  String nextLine = "";
//			  StringBuffer emailTextBuffer = new StringBuffer();
//			  while ((nextLine = emailTemplate.readLine()) != null)
//			  {
//				  emailTextBuffer.append(nextLine);
//			  }
//			  emailTemplate.close();
//			  String emailTextString = emailTextBuffer.toString();
//			  String slaText;
//			  if(slaDate.equals("not available")){
//			     slaText="This type of problem currently has no target resolution date";
//			  }else{
//				 slaText="Our target resolution date is " + slaDate;
//			  }
//			  String amendedEmailTextString = emailTextString.replace("AAA", laganCaseReference);
//			  amendedEmailTextString = amendedEmailTextString.replace("BBB", slaText);
//			  //amendedEmailTextString = amendedEmailTextString.replace("CCC", descriptionEmail);
//			  amendedEmailTextString = amendedEmailTextString.replace("DDD", shortenedURLforEmail);
//			  //amendedEmailTextString = amendedEmailTextString.replace("EEE", contactNumber);
//			  
//			  SendMail email = new SendMail();
//			  String[] strEmailTo = { emailAddress };
//			  try
//			  {
//				  email.postMail(strEmailTo, emailBCC, "MyCouncil : Your Call Number is " + laganCaseReference, amendedEmailTextString, emailFrom, smtpHost, true);
//			  }
//			  catch (MessagingException confirmationError)
//			  {
//				  continueProcessing = false;
//				  String errorLine1 = "";
//				  String errorLine2 = "CreateLaganCase " + version + " - Failed - Sending confirmation email";
//				  String errorLine3 = "Date        : " + currentDate;
//				  String errorLine4 = "LaganSystem : " + laganSystem;
//				  String errorLine5 = "Error       : " + confirmationError.toString();
//				  String errorLine6 = "";
//				  System.out.println(errorLine1);
//				  System.out.println(errorLine2);
//				  System.out.println(errorLine3);
//				  System.out.println(errorLine4);
//				  System.out.println(errorLine5);
//				  System.out.println(errorLine6);
//				  String emailContents = errorLine1 + "<BR>" +
//										 errorLine2 + "<BR>" +
//										 errorLine3 + "<BR>" +
//										 errorLine4 + "<BR>" +
//										 errorLine5 + "<BR>" +
//										 errorLine6;
//				  SendMail confirmationEmailError = new SendMail();
//				  try
//				  {
//					  confirmationEmailError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a confirmation email", emailContents, emailFrom, smtpHost, true);
//				  }
//				  catch (MessagingException emailError)
//				  {
//					  System.out.println("Email error : " + emailError.toString());
//				  }
//			  }
//		  }
//	  }

//	  if (continueProcessing)
//	  {
//		  phoneNumber = phoneNumber.replaceAll(" ", "");
//		  if (phoneNumber.length() == 5 || phoneNumber.length() == 6)
//		  {
//			  phoneNumber = localDialCode + phoneNumber;
//		  }
//		  if (phoneNumber.length() > 7 && phoneNumber.length() < 13)
//		  {
//			  String phoneText = "";
//			  String voiceMessagePart1 = "This is a message from " + textMessageFrom + " regarding call number  ";
//			  String voiceMessagePart2;
//			  if (slaDate.equals("not available"))
//			  {
//				  voiceMessagePart2 = ". We will notify you when your call has been resolved.";
//			  }
//			  else
//			  {
//				  voiceMessagePart2 = ". Your call should be resolved by ";
//			  }
//			  String voiceCaseReference = "";
//			  String tempVoiceSlaDate = "";
//			  if (phoneNumber.startsWith("07"))
//			  {
//				  voiceCaseReference = laganCaseReference;
//				  tempVoiceSlaDate = slaDate;
//			  }
//			  else
//			  {
//				  for (int currentCharacter = 0; currentCharacter < laganCaseReference.length(); currentCharacter++)
//				  {
//					  voiceCaseReference = voiceCaseReference + laganCaseReference.substring(currentCharacter, currentCharacter + 1);
//					  if (currentCharacter != laganCaseReference.length() - 1)
//					  {
//						  voiceCaseReference = voiceCaseReference + " ";
//					  }
//				  }
//				  tempVoiceSlaDate = voiceSlaDate;
//			  }
//			  if (slaDate.equals("not available"))
//			  {
//				  phoneText = voiceMessagePart1 + voiceCaseReference + voiceMessagePart2;
//			  }
//			  else
//			  {
//				  phoneText = voiceMessagePart1 + voiceCaseReference + voiceMessagePart2 + tempVoiceSlaDate + ".";
//			  }
//			  if (phoneText.length() > 160)
//			  {
//				  String errorLine1 = "";
//				  String errorLine2 = "CreateLaganCase " + version + " - Failed - Sending text message";
//				  String errorLine3 = "Date        : " + currentDate;
//				  String errorLine4 = "LaganSystem : " + laganSystem;
//				  String errorLine5 = "Error       : Text Message Too Long = '" + phoneText + "'";
//				  String errorLine6 = "";
//				  System.out.println(errorLine1);
//				  System.out.println(errorLine2);
//				  System.out.println(errorLine3);
//				  System.out.println(errorLine4);
//				  System.out.println(errorLine5);
//				  System.out.println(errorLine6);
//				  String emailContents = errorLine1 + "<BR>" +
//										 errorLine2 + "<BR>" +
//										 errorLine3 + "<BR>" +
//										 errorLine4 + "<BR>" +
//										 errorLine5 + "<BR>" +
//										 errorLine6;
//				  SendMail textMessageLengthError = new SendMail();
//				  try
//				  {
//					  textMessageLengthError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a text message", emailContents, emailFrom, smtpHost, true);
//				  }
//				  catch (MessagingException emailError)
//				  {
//					  System.out.println("Email error : " + emailError.toString());
//				  }
//			  }
//			  SendMail textMessage = new SendMail();
//			  String[] strEmailTo = { phoneNumber + "@smsmaker.com" };
//			  try
//			  {
//				  textMessage.postMail(strEmailTo, emailBCC, "", phoneText, smsFrom, smtpHost, false);
//			  }
//			  catch (MessagingException textMessageError)
//			  {
//				  String errorLine1 = "";
//				  String errorLine2 = "CreateLaganCase " + version + " - Failed - Sending text message";
//				  String errorLine3 = "Date        : " + currentDate;
//				  String errorLine4 = "LaganSystem : " + laganSystem;
//				  String errorLine5 = "Error       : " + textMessageError.toString();
//				  String errorLine6 = "";
//				  System.out.println(errorLine1);
//				  System.out.println(errorLine2);
//				  System.out.println(errorLine3);
//				  System.out.println(errorLine4);
//				  System.out.println(errorLine5);
//				  System.out.println(errorLine6);
//				  String emailContents = errorLine1 + "<BR>" +
//										 errorLine2 + "<BR>" +
//										 errorLine3 + "<BR>" +
//										 errorLine4 + "<BR>" +
//										 errorLine5 + "<BR>" +
//										 errorLine6;
//				  SendMail textMessageEmailError = new SendMail();
//				  try
//				  {
//					  textMessageEmailError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a text message", emailContents, emailFrom, smtpHost, true);
//				  }
//				  catch (MessagingException emailError)
//				  {
//					  System.out.println("Email error : " + emailError.toString());
//				  }
//			  }
//		  }
//	  }
	  
    }
   }