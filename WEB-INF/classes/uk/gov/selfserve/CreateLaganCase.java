package uk.gov.selfserve;

import java.awt.Polygon;
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.mail.*;

public class CreateLaganCase extends HttpServlet
   {
	private static final long serialVersionUID = 1L;

public void doPost(final HttpServletRequest request,
                     HttpServletResponse response) 
                    throws ServletException, IOException
      {
	  Boolean fromApp=false;
	  Boolean storeImage=false;
	  Boolean deviceApproved=false;
	  Boolean deviceBanned=false;
      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	  DateFormat slaDateFormat = new SimpleDateFormat("EEEEEEEEE, d MMMMMMMMM yyyy 'at' HH:mm:ss");
	  DateFormat voiceSlaDateFormat = new SimpleDateFormat("EEEEEEEEE, d MMMMMMMMM yyyy 'at' h mm a");
	  DateFormat tweetMonth = new SimpleDateFormat("MMM");
	  Date date = new Date();
	  String version = "v1.001";
      String currentDate = dateFormat.format(date);
	  String laganSystem = getServletContext().getInitParameter("laganSystem");
	  String host = getServletContext().getInitParameter("host") + "/" + getServletContext().getServletContextName();
	  String dbLocation = "jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/mycouncil.db3");
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
	  String wsddPath="";
	  
	  String dataSource=request.getHeader("dataSource");
	  String includesImage=request.getHeader("includesImage");
	  
	  if(dataSource==null){
		  dataSource="";
	  }
	  
	  String deviceID="";
	  String problemNumber="";
      String lat="";
      String lng="";
      String details="";
	  String location = "";
	  String street = "";
	  String name = "";
      String emailAddress="";
	  String phoneNumber = "";
	  String heading = "";
	  String pitch = "";
	  String zoom = "";
	  
	  if(dataSource.equals("myNBC")){
		  fromApp=true;
		  if(includesImage.equals("true")){
		    storeImage=true;
		  }else{
			storeImage=false;  
		  }
		  deviceID = request.getHeader("DeviceID");
		  problemNumber = request.getHeader("ProblemNumber");
	      lat=request.getHeader("ProblemLatitude");
	      lng=request.getHeader("ProblemLongitude");
	      details=request.getHeader("ProblemDescription");
		  location = request.getHeader("ProblemLocation");
	      emailAddress=request.getHeader("ProblemEmail");
		  phoneNumber = request.getHeader("ProblemPhone"); 
		  deviceApproved=isApproved(dbLocation,deviceID);
		  deviceBanned=isBanned(dbLocation,deviceID);
	  }else{
	      lat=request.getParameter("lat");
	      lng=request.getParameter("lng");
	      details=request.getParameter("problemDetails");
		  location = request.getParameter("problemLocation");
		  street = request.getParameter("problemStreet");
		  name = request.getParameter("name");
	      emailAddress=request.getParameter("emailAddress");
		  phoneNumber = request.getParameter("phoneNumber");
		  heading = request.getParameter("heading");
		  pitch = request.getParameter("pitch");
		  zoom = request.getParameter("zoom");
		  int tempInt=Integer.parseInt(request.getParameter("problemNumber"))+1;
		  problemNumber=String.valueOf(tempInt);
		  deviceApproved=isApproved(dbLocation,request.getRemoteHost());
		  deviceBanned=isBanned(dbLocation,request.getRemoteHost());
	  }
	    
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
	  
	  if(deviceBanned){
		  if(fromApp){
		     ajaxResponse.println("<response><result>"+"success"+"</result>"+"<callNumber>Device</callNumber><slaDate>Banned</slaDate></response>");
		  }else{
			 ajaxResponse.println("{\"result\":\"failed\",\"reason\":\"Your PC has been banned\"}");
		  }
		  continueProcessing=false;
	  }

	  if(phoneNumber.length()>3&&phoneNumber.substring(1,3).equals("44"))
	  {
      phoneNumber="0" + phoneNumber.substring(3,phoneNumber.length());
	  }
	  
	  //Get Location details
	  LocationDetails thisLocation=(new FindLocation(Double.parseDouble(lat.trim()),
			                                         Double.parseDouble(lng.trim()),
				                                     smtpHost,
				                                     emailFrom,
				                                     strErrorEmailTo,
				                                     strErrorEmailBCC,
				                                     dbLocation)).getLocation();
	  
	  //Authenticate to Lagan.
	  wsddPath=getServletContext().getRealPath("/WEB-INF/mycouncil.wsdd");
	  EngineConfiguration config = new FileProvider(wsddPath);
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
			  caseCreate.setClassificationEventCode(thisLocation.getClassificationCodes()[Integer.parseInt(problemNumber)]);
			  if(fromApp){
				  caseCreate.setTitle("Reported via MyCouncilMobile");
			  }else{
				  caseCreate.setTitle("Reported via MyCouncil");
			  }  
			  caseCreate.setDescription("Enquiry sent from IP: <" + request.getRemoteHost() + ">");
			  laganFullCaseReference = webInterface.createCase(caseCreate);
			  laganCaseReference = laganFullCaseReference.substring(laganFullCaseReference.length() - 6);
			  
			  //Get sla date
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
			  if(!fromApp){
			     ajaxResponse.println("{\"result\":\"success\",\"callNumber\":\"" + laganCaseReference + "\",\"slaDate\":\"" + slaDate + "\"}");
			  }else{
				  if(slaDay.equals("asap")){
					  ajaxResponse.println("<response><result>"+"success"+"</result>"+"<callNumber>"+ laganCaseReference +"</callNumber>"+"<slaDate>"+ slaDay +"</slaDate></response>");  
				  }else{
					  ajaxResponse.println("<response><result>"+"success"+"</result>"+"<callNumber>"+ laganCaseReference +"</callNumber>"+"<slaDate>"+ slaDay.substring(3) +"</slaDate></response>");  
				  }
			  }
			  
			  if(!thisLocation.getSuccess()){
				  details="Not in area - possible test - " + details;
			  }
			  
			  new Thread(new CreateCaseProcesses(host,
					                             googleURLAPIKey,
					                             laganFullCaseReference,
					                             Double.parseDouble(lat.trim()),
					                             Double.parseDouble(lng.trim()),
					                             wsddPath,
					                             laganSystem,
					                             smtpHost,
					                             emailFrom,
					                             strErrorEmailTo,
					                             strErrorEmailBCC,
					                             details,
					                             location,
					                             street,
					                             name,
					                             emailAddress,
					                             phoneNumber,
					                             lat,
					                             lng,
					                             heading,
					                             pitch,
					                             zoom,
					                             deviceID,
					                             slaDay,
					                             fromApp,
					                             twitterTESTConsumerKey,
					                             twitterTESTConsumerSecret,
					                             twitterTESTAccessTokenKey,
					                             twitterTESTAccessTokenSecret,
					                             twitterALLConsumerKey,
					                             twitterALLConsumerSecret,
					                             twitterALLAccessTokenKey,
					                             twitterALLAccessTokenSecret,
					                             twitterAllHashTag,
					                             twitterSectorHashTag,
					                             dbLocation,
					                             thisLocation,
					                             getServletContext().getRealPath("/email-templates/report-it-confirmation.txt"),
					                             slaDate,
					                             contactNumber,
					                             emailBCC,
					                             problemNumber,
					                             localDialCode,
					                             textMessageFrom,
					                             voiceSlaDate,
					                             smsFrom
					                             )).start();
			  //Store Image if from MyNBC
			  if(storeImage){			
					ServletInputStream in = request.getInputStream();
					int filesize=request.getContentLength();
					String imageLocation;
					if(deviceApproved){
						imageLocation="images/approved/";
					}else{
						imageLocation="WEB-INF/pending/";
					}
					FileOutputStream fos = new FileOutputStream(getServletContext().getRealPath("/") + imageLocation + laganCaseReference + ".jpg");
					int chunk=1;
				    byte[] dyn_data = new byte[chunk];
				    while (filesize>chunk){
				           in.read(dyn_data,0,chunk);
				           fos.write(dyn_data,0,chunk);
				       fos.flush();
				       filesize -= chunk;
				      }    
				    in.read(dyn_data,0,(int) filesize );
				    fos.write(dyn_data,0, (int) filesize);
				    fos.flush();
				    fos.close();
			  }
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
    }

   private boolean isApproved(String dbLocation,
		                      String deviceID){
	   boolean isApproved=false;
		  Connection dbConnection = null;
		  PreparedStatement psQuery = null;
		  ResultSet dbResult = null;
	  	  try
	      {
			Class.forName("org.sqlite.JDBC");
		  }
		  catch (ClassNotFoundException error)
		  {
			System.out.println("{\"name\":\"ClassNotFoundException\"}");
		  }
		  try{
			String sqlQuery = "SELECT deviceID from approvedDevices where deviceID = ?";
			dbConnection = DriverManager.getConnection(dbLocation);
			psQuery = dbConnection.prepareStatement( sqlQuery );
			psQuery.setString( 1, deviceID); 
			dbResult = psQuery.executeQuery();
			if(dbResult.next()){
				isApproved=true;
			}
		}
		catch (SQLException error)
		{
			System.out.println("{\"message\":\"" + error.toString() + "\"}");
		}
		finally {  
	        try {  
	            dbResult.close(); 
	            psQuery.close();  
	            dbConnection.close();  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	    }  	
	   return isApproved;
   }
   
   private boolean isBanned(String dbLocation,
		                      String deviceID){
	   boolean isBanned=false;
	   Connection dbConnection = null;
	   PreparedStatement psQuery = null;
	   ResultSet dbResult = null;
	   try
	   {
		   Class.forName("org.sqlite.JDBC");
	   }
	   catch (ClassNotFoundException error)
	   {
		   System.out.println("{\"name\":\"ClassNotFoundException\"}");
	   }
	   try{
		   String sqlQuery = "SELECT deviceID from bannedDevices where deviceID = ?";
		   dbConnection = DriverManager.getConnection(dbLocation);
		   psQuery = dbConnection.prepareStatement( sqlQuery );
		   psQuery.setString( 1, deviceID); 
		   dbResult = psQuery.executeQuery();
		   if(dbResult.next()){
			   isBanned=true;
		   }
	   }
	   catch (SQLException error)
	   {
		   System.out.println("{\"message\":\"" + error.toString() + "\"}");
	   }
	   finally {  
		   try {  
			   dbResult.close(); 
			   psQuery.close();  
			   dbConnection.close();  
		   } catch (Exception e) {  
			   e.printStackTrace();  
		   }  
	   }  	
	   return isBanned;
   }
   
   
   }