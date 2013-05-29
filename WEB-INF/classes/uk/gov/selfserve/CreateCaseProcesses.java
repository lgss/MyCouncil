package uk.gov.selfserve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.mail.MessagingException;
import uk.gov.selfserve.LocationDetails;

public class CreateCaseProcesses implements Runnable 
{
	String googleURLAPIKey;
	String host;
	String laganCaseReference;
	double latitude;
	double longitude;
	String wsddPath;
	String laganSystem;
	String smtpHost;
	String emailFrom;
	String[] strErrorEmailTo;
	String[] strErrorEmailBCC;
	String details;
	String location;
	String street;
	String ward;
	String sector;
    String name;
    String emailAddress;
    String phoneNumber;
    String lat;
    String lng;
    String heading;
    String pitch;
    String zoom;
    String deviceID;
    String slaDay;
    boolean fromApp;
    String twitterTESTConsumerKey;
    String twitterTESTConsumerSecret;
    String twitterTESTAccessTokenKey;
    String twitterTESTAccessTokenSecret;
    String twitterALLConsumerKey;
    String twitterALLConsumerSecret;
    String twitterALLAccessTokenKey;
    String twitterALLAccessTokenSecret;
    String twitterALLHashtag;
    String twitterSectorHashtag;
    String dbLocation;
    LocationDetails thisLocation;
    String confirmationFilePath;
    String slaDate;
    String contactNumber;
    String[] emailBCC;
    String problemNumber;
    String localDialCode;
    String textMessageFrom;
    String voiceSlaDate;
    String smsFrom;
    String descriptionEmail;
    boolean useImage;
    boolean imageApproved;
    String imageLocation;
    boolean useTwitter;

	public CreateCaseProcesses(String host,
			                   String googleURLAPIKey,
			                   String laganCaseReference,
			                   double latitude,
			                   double longitude,
			                   String wsddPath,
			                   String laganSystem,
			                   String smtpHost,
			                   String emailFrom,
			                   String[] strErrorEmailTo,
			                   String[] strErrorEmailBCC,
			                   String details,
			                   String location,
			                   String street,
			                   String name,
			                   String emailAddress,
	  		                   String phoneNumber,
		 	                   String lat,
			                   String lng,
			                   String heading,
			                   String pitch,
			                   String zoom,
			                   String deviceID,
			                   String slaDay,
			                   boolean fromApp,
			                   String twitterTESTConsumerKey,
			                   String twitterTESTConsumerSecret,
			                   String twitterTESTAccessTokenKey,
			                   String twitterTESTAccessTokenSecret,
			                   String twitterALLConsumerKey,
			                   String twitterALLConsumerSecret,
			                   String twitterALLAccessTokenKey,
			                   String twitterALLAccessTokenSecret,
			                   String twitterALLHashtag,
			                   String twitterSectorHashtag,
			                   String dbLocation,
			                   LocationDetails thisLocation,
			                   String confirmationFilePath,
			                   String slaDate,
			                   String contactNumber,
			                   String[] emailBCC,
			                   String problemNumber,
			                   String localDialCode,
			                   String textMessageFrom,
			                   String voiceSlaDate,
			                   String smsFrom,
			                   boolean useImage,
			                   boolean imageApproved,
			                   String imageLocation,
			                   Boolean useTwitter) {
		this.googleURLAPIKey=googleURLAPIKey;
		this.host=host;
		this.laganCaseReference=laganCaseReference;
		this.latitude=latitude;
		this.longitude=longitude;
		this.wsddPath=wsddPath;
		this.laganSystem=laganSystem;
		this.smtpHost=smtpHost;
		this.emailFrom=emailFrom;
		this.strErrorEmailTo=strErrorEmailTo;
		this.strErrorEmailBCC=strErrorEmailBCC;
		this.details=details;
		this.location=location;
		this.street=street;
		this.name=name;
		this.emailAddress=emailAddress;
		this.phoneNumber=phoneNumber;
		this.lat=lat;
		this.lng=lng;
		this.heading=heading;
		this.pitch=pitch;
		this.zoom=zoom;
		this.deviceID=deviceID;
		this.slaDay=slaDay;
		this.fromApp=fromApp;
		this.twitterTESTConsumerKey=twitterTESTConsumerKey;
		this.twitterTESTConsumerSecret=twitterTESTConsumerSecret;
		this.twitterTESTAccessTokenKey=twitterTESTAccessTokenKey;
		this.twitterTESTAccessTokenSecret=twitterTESTAccessTokenSecret;
		this.twitterALLConsumerKey=twitterALLConsumerKey;
		this.twitterALLConsumerSecret=twitterALLConsumerSecret;
		this.twitterALLAccessTokenKey=twitterALLAccessTokenKey;
		this.twitterALLAccessTokenSecret=twitterALLAccessTokenSecret;
		this.twitterALLHashtag=twitterALLHashtag;
		this.twitterSectorHashtag=twitterSectorHashtag;
		this.dbLocation=dbLocation;
		this.thisLocation=thisLocation;
		this.confirmationFilePath=confirmationFilePath;
		this.slaDate=slaDate;
		this.contactNumber=contactNumber;
		this.emailBCC=emailBCC;
		this.problemNumber=problemNumber;
		this.localDialCode=localDialCode;
		this.textMessageFrom=textMessageFrom;
		this.voiceSlaDate=voiceSlaDate;
		this.smsFrom=smsFrom;
		this.useImage=useImage;
		this.imageApproved=imageApproved;
		this.imageLocation=imageLocation;
		this.useTwitter=useTwitter;
	}
	
	public void run() {
		
		//Get shortened URLs
		URLShortener urlShortener = new URLShortener();
		String shortenedURLforEmail = urlShortener.shortenURL(host + "/?search=" + laganCaseReference.substring(laganCaseReference.length() - 7) + "&url=1",googleURLAPIKey);
		String shortenedURLforTwitter = urlShortener.shortenURL(host + "/?search=" + laganCaseReference.substring(laganCaseReference.length() - 7) + "&url=2",googleURLAPIKey);
		String shortenedURLforFacebook = urlShortener.shortenURL(host + "/?search=" + laganCaseReference.substring(laganCaseReference.length() - 7) + "&url=3",googleURLAPIKey);
		
		ward=thisLocation.getWard();
		sector=thisLocation.getSector();
		descriptionEmail=thisLocation.getProblemEmailDescriptions()[Integer.parseInt(problemNumber)];
		
        if((new UpdateLaganCase()).updateCase(laganCaseReference,
        		                              wsddPath,
        		                              laganSystem,
        		                              smtpHost,
        		                              emailFrom,
        		                              strErrorEmailTo,
        		                              strErrorEmailBCC,
        		                              thisLocation.getProblemDescriptions()[Integer.parseInt(problemNumber)],
        		                              details,
        		                              location,
        		                              street,
        		                              ward,
        		                              sector,
        		                              name,
        		                              emailAddress,
        		                              phoneNumber,
        		                              lat,
        		                              lng,
        		                              heading,
        		                              pitch,
        		                              zoom,
        		                              thisLocation.getProblemEmailDescriptions()[Integer.parseInt(problemNumber)],
        		                              thisLocation.getNorthing(),
        		                              thisLocation.getEasting(),
        		                              shortenedURLforTwitter,
        		                              shortenedURLforFacebook,
        		                              shortenedURLforEmail,
        		                              deviceID,
        		                              useImage,
        		                              imageApproved,
        		                              imageLocation
                                              )){
          laganCaseReference=laganCaseReference.substring(laganCaseReference.length() - 7);
          String currentDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
    	  String xmlWard=ward.replace(" ","");
    	  xmlWard=xmlWard.replace("&","");
    	  if(useTwitter){
	          //Post twitter messages.
	      	  String twitterMessage="";
	      	  if(descriptionEmail.equals("cleansing")){
	      		  twitterMessage="We'll be dealing with " + descriptionEmail + " " + slaDay + ". More details " + shortenedURLforTwitter;	  
	      	  }else{
	      		  twitterMessage="We'll be cleaning up " + descriptionEmail + " " + slaDay + ". More details " + shortenedURLforTwitter;			 
	      	  }
	      	  if (details.toLowerCase().contains("test")|(laganSystem.equals("test") && !twitterTESTConsumerKey.equals(""))){
	      		  //Test SocialMedia
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
	      				  String errorLine1 = "";
	      				  String errorLine2 = "CreateCaseProcesses Failed - Null Pointer Exception error sending ALL twitter message (TEST)";
	      				  String errorLine3 = "Date        : " + currentDate;
	      				  String errorLine4 = "LaganSystem : " + laganSystem;
	      				  String errorLine5 = "";
	      				  System.out.println(errorLine1);
	      				  System.out.println(errorLine2);
	      				  System.out.println(errorLine3);
	      				  System.out.println(errorLine4);
	      				  System.out.println(errorLine5);
	      				  error.printStackTrace();
	      				  StringWriter errors = new StringWriter();
	      				  error.printStackTrace(new PrintWriter(errors));
	      				  String emailContents = errorLine1 + "<BR>" +
	      										 errorLine2 + "<BR>" +
	      										 errorLine3 + "<BR>" +
	      										 errorLine4 + "<BR>" +
	      										 errorLine5 + "<BR>" +
	      										 errors.toString();
	      				  SendMail caseCreationErrorEmail = new SendMail();
	      				  try
	      				  {
	      					  caseCreationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a tweet", emailContents, emailFrom, smtpHost, true);
	      				  }
	      				  catch (MessagingException emailError)
	      				  {
	      					  System.out.println("Email error : " + emailError.toString());
	      				  }
	      		     }		
	      		  //Sector stream TEST
	      		  caseTwitterEntry = new TwitterEntry();
	      		  try
	      	      {
	      		    caseTwitterEntry.createTwitterEntry(
	      		    	  thisLocation.getSectorHashtag().substring(1) + " : " + twitterMessage,
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
	      			      String errorLine1 = "";
	      				  String errorLine2 = "CreateCaseProcesses Failed - Null Pointer Exception error sending Sector twitter message (TEST)";
	      				  String errorLine3 = "Date        : " + currentDate;
	      				  String errorLine4 = "LaganSystem : " + laganSystem;
	      				  String errorLine5 = "";
	      				  System.out.println(errorLine1);
	      				  System.out.println(errorLine2);
	      				  System.out.println(errorLine3);
	      				  System.out.println(errorLine4);
	      				  System.out.println(errorLine5);
	      				  error.printStackTrace();
	      				  StringWriter errors = new StringWriter();
	      				  error.printStackTrace(new PrintWriter(errors));
	      				  String emailContents = errorLine1 + "<BR>" +
	      										 errorLine2 + "<BR>" +
	      										 errorLine3 + "<BR>" +
	      										 errorLine4 + "<BR>" +
	      										 errorLine5 + "<BR>" +
	      										 errors.toString();
	      				  SendMail caseCreationErrorEmail = new SendMail();
	      				  try
	      				  {
	      					  caseCreationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a tweet", emailContents, emailFrom, smtpHost, true);
	      				  }
	      				  catch (MessagingException emailError)
	      				  {
	      					  System.out.println("Email error : " + emailError.toString());
	      				  }
	      		     }		  
	      		  //Ward stream TEST  
	//      		  caseTwitterEntry = new TwitterEntry();
	//      		  try
	//      		      {
	//      			    caseTwitterEntry.createTwitterEntry(
	//      			    	  thisLocation.getWardHashtag() + " : " + twitterMessage,
	//      			    	  currentDate,
	//      	                  strErrorEmailTo,
	//      	                  strErrorEmailBCC,
	//      	                  emailFrom,
	//      	                  smtpHost,
	//                            twitterTESTConsumerKey,
	//                            twitterTESTConsumerSecret,
	//                            twitterTESTAccessTokenKey,
	//                            twitterTESTAccessTokenSecret);
	//      		     }
	//      		     catch(NullPointerException error){
	//    			      String errorLine1 = "";
	//      				  String errorLine2 = "CreateCaseProcesses Failed - Null Pointer Exception error sending Ward twitter message (TEST)";
	//      				  String errorLine3 = "Date        : " + currentDate;
	//      				  String errorLine4 = "LaganSystem : " + laganSystem;
	//      				  String errorLine5 = "";
	//      				  System.out.println(errorLine1);
	//      				  System.out.println(errorLine2);
	//      				  System.out.println(errorLine3);
	//      				  System.out.println(errorLine4);
	//      				  System.out.println(errorLine5);
	//      				  error.printStackTrace();
	//  				      StringWriter errors = new StringWriter();
	//  				      error.printStackTrace(new PrintWriter(errors));
	//      				  String emailContents = errorLine1 + "<BR>" +
	//      										 errorLine2 + "<BR>" +
	//      										 errorLine3 + "<BR>" +
	//      										 errorLine4 + "<BR>" +
	//      										 errorLine5 + "<BR>" +
	//      		                                 errors.toString();
	//      				  SendMail caseCreationErrorEmail = new SendMail();
	//      				  try
	//      				  {
	//      					  caseCreationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a tweet", emailContents, emailFrom, smtpHost, true);
	//      				  }
	//      				  catch (MessagingException emailError)
	//      				  {
	//      					  System.out.println("Email error : " + emailError.toString());
	//      				  }
	//      		     }
	      		     //Temporary home for ward stream live
	//      		     try
	//      		      {
	//      		    	 caseTwitterEntry = new TwitterEntry();
	//      			     caseTwitterEntry.createTwitterEntry(
	//      			    	  thisLocation.getWardHashtag() + " : " + twitterMessage,
	//      			    	  currentDate,
	//      	                  strErrorEmailTo,
	//      	                  strErrorEmailBCC,
	//      	                  emailFrom,
	//      	                  smtpHost,
	//      					  thisLocation.getWardConsumerKey(),
	//      					  thisLocation.getWardConsumerSecret(),
	//      					  thisLocation.getWardAccessTokenKey(),
	//      					  thisLocation.getWardAccessTokenSecret());
	//      		     }
	//      		     catch(NullPointerException error){
	//      			      String errorLine1 = "";
	//      				  String errorLine2 = "CreateCaseProcesses Failed - Null Pointer Exception error sending WARD twitter message";
	//      				  String errorLine3 = "Date        : " + currentDate;
	//      				  String errorLine4 = "LaganSystem : " + laganSystem;
	//      				  String errorLine5 = "";
	//      				  System.out.println(errorLine1);
	//      				  System.out.println(errorLine2);
	//      				  System.out.println(errorLine3);
	//      				  System.out.println(errorLine4);
	//      				  System.out.println(errorLine5);
	//      				  error.printStackTrace();
	//  				      StringWriter errors = new StringWriter();
	//  				      error.printStackTrace(new PrintWriter(errors));
	//      				  String emailContents = errorLine1 + "<BR>" +
	//      										 errorLine2 + "<BR>" +
	//      										 errorLine3 + "<BR>" +
	//      										 errorLine4 + "<BR>" +
	//      										 errorLine5 + "<BR>" +
	//      		                                 errors.toString();
	//      				  SendMail caseCreationErrorEmail = new SendMail();
	//      				  try
	//      				  {
	//      					  caseCreationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a tweet", emailContents, emailFrom, smtpHost, true);
	//      				  }
	//      				  catch (MessagingException emailError)
	//      				  {
	//      					  System.out.println("Email error : " + emailError.toString());
	//      				  }
	//      		     }		  
	      	  }
	      	  else
	      	  //Live SocialMedia
	      	  {
	      		  if(!twitterALLConsumerKey.equals(""))
	      		  {		     
	      		  try
	      	         {
	      			  TwitterEntry caseTwitterEntry = new TwitterEntry();
	      			  caseTwitterEntry.createTwitterEntry( 
	      					  ward + " : " + twitterMessage + " " + twitterALLHashtag,
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
	    			      String errorLine1 = "";
	      				  String errorLine2 = "CreateCaseProcesses Failed - Null Pointer Exception error sending ALL twitter message";
	      				  String errorLine3 = "Date        : " + currentDate;
	      				  String errorLine4 = "LaganSystem : " + laganSystem;
	      				  String errorLine5 = "";
	      				  System.out.println(errorLine1);
	      				  System.out.println(errorLine2);
	      				  System.out.println(errorLine3);
	      				  System.out.println(errorLine4);
	      				  System.out.println(errorLine5);
	      				  error.printStackTrace();
	      				  StringWriter errors = new StringWriter();
	      				  error.printStackTrace(new PrintWriter(errors));
	      				  String emailContents = errorLine1 + "<BR>" +
	      										 errorLine2 + "<BR>" +
	      										 errorLine3 + "<BR>" +
	      										 errorLine4 + "<BR>" +
	      										 errorLine5 + "<BR>" +
	      										 errors.toString();
	      				  SendMail caseCreationErrorEmail = new SendMail();
	      				  try
	      				  {
	      					  caseCreationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a tweet", emailContents, emailFrom, smtpHost, true);
	      				  }
	      				  catch (MessagingException emailError)
	      				  {
	      					  System.out.println("Email error : " + emailError.toString());
	      				  }
	      		     }
	      	      }
	      		  //Post Entry to Sector twitter stream.
	      		  if(!laganSystem.equals("test")){
	      		     try
	      		      {
	      			     TwitterEntry caseTwitterEntry = new TwitterEntry();
	      			     caseTwitterEntry.createTwitterEntry(
	      			    	  thisLocation.getSectorHashtag() + " : " + twitterMessage + " " + twitterSectorHashtag,
	      			    	  currentDate,
	      	                  strErrorEmailTo,
	      	                  strErrorEmailBCC,
	      	                  emailFrom,
	      	                  smtpHost,
	      					  thisLocation.getSectorConsumerKey(),
	      					  thisLocation.getSectorConsumerSecret(),
	      					  thisLocation.getSectorAccessTokenKey(),
	      					  thisLocation.getSectorAccessTokenSecret());
	      		     }
	      		     catch(NullPointerException error){
	      			      String errorLine1 = "";
	      				  String errorLine2 = "CreateCaseProcesses Failed - Null Pointer Exception error sending SECTOR twitter message";
	      				  String errorLine3 = "Date        : " + currentDate;
	      				  String errorLine4 = "LaganSystem : " + laganSystem;
	      				  String errorLine5 = "";
	      				  System.out.println(errorLine1);
	      				  System.out.println(errorLine2);
	      				  System.out.println(errorLine3);
	      				  System.out.println(errorLine4);
	      				  System.out.println(errorLine5);
	      				  error.printStackTrace();
	      				  StringWriter errors = new StringWriter();
	      				  error.printStackTrace(new PrintWriter(errors));
	      				  String emailContents = errorLine1 + "<BR>" +
	      										 errorLine2 + "<BR>" +
	      										 errorLine3 + "<BR>" +
	      										 errorLine4 + "<BR>" +
	      										 errorLine5 + "<BR>" +
	      										 errors.toString();
	      				  SendMail caseCreationErrorEmail = new SendMail();
	      				  try
	      				  {
	      					  caseCreationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a tweet", emailContents, emailFrom, smtpHost, true);
	      				  }
	      				  catch (MessagingException emailError)
	      				  {
	      					  System.out.println("Email error : " + emailError.toString());
	      				  }
	      		     }
	      		  }
	      		  //Post Entry to Ward twitter stream.
	//      		  if(continueProcessing && !laganSystem.equals("test")){
	//      		  }
	      	  }
    	  }
    	  //Send the confirmation email.
    		  if (emailAddress.length() > 0)
    		  {
    			  String emailTextString="";;
    			  String slaText="";
    			  
    			  try{
    			  BufferedReader emailTemplate = new BufferedReader(new FileReader(confirmationFilePath));
    			  String nextLine = "";
    			  StringBuffer emailTextBuffer = new StringBuffer();
    			  while ((nextLine = emailTemplate.readLine()) != null)
    			  {
    				  emailTextBuffer.append(nextLine);
    			  }
    			  emailTemplate.close();
    			  emailTextString = emailTextBuffer.toString();
    			  }catch(IOException error){
      			      String errorLine1 = "";
      				  String errorLine2 = "CreateCaseProcesses Failed - IO Exception error processing confirmation email file";
      				  String errorLine3 = "Date        : " + currentDate;
      				  String errorLine4 = "LaganSystem : " + laganSystem;
      				  String errorLine5 = "";
      				  System.out.println(errorLine1);
      				  System.out.println(errorLine2);
      				  System.out.println(errorLine3);
      				  System.out.println(errorLine4);
      				  System.out.println(errorLine5);
      				  error.printStackTrace();
      				  StringWriter errors = new StringWriter();
      				  error.printStackTrace(new PrintWriter(errors));
      				  String emailContents = errorLine1 + "<BR>" +
      										 errorLine2 + "<BR>" +
      										 errorLine3 + "<BR>" +
      										 errorLine4 + "<BR>" +
      										 errorLine5 + "<BR>" +
      										 errors.toString();
      				  SendMail caseCreationErrorEmail = new SendMail();
      				  try
      				  {
      					  caseCreationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send an email", emailContents, emailFrom, smtpHost, true);
      				  }
      				  catch (MessagingException emailError)
      				  {
      					  System.out.println("Email error : " + emailError.toString());
      				  }   				  
    			  }
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
    				  String errorLine1 = "";
    				  String errorLine2 = "CreateCaseProcesses - Failed - Sending confirmation email";
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
    				  confirmationError.printStackTrace();
      				  StringWriter errors = new StringWriter();
      				  confirmationError.printStackTrace(new PrintWriter(errors));
    				  String emailContents = errorLine1 + "<BR>" +
    										 errorLine2 + "<BR>" +
    										 errorLine3 + "<BR>" +
    										 errorLine4 + "<BR>" +
    										 errorLine5 + "<BR>" +
    										 errorLine6 + "<BR>" +
    										 errors.toString();
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
    		  
    		  //Voice or Text Message Confirmation
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
    				  String errorLine2 = "CreateLaganCase - Failed - Sending text message";
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
    				  String errorLine2 = "CreateLaganCase - Failed - Sending text message";
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
    				  textMessageError.printStackTrace();
      				  StringWriter errors = new StringWriter();
      				  textMessageError.printStackTrace(new PrintWriter(errors));
    				  String emailContents = errorLine1 + "<BR>" +
    										 errorLine2 + "<BR>" +
    										 errorLine3 + "<BR>" +
    										 errorLine4 + "<BR>" +
    										 errorLine5 + "<BR>" +
    										 errorLine6 + "<BR>" +
    										 errors.toString();
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