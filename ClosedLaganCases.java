package uk.gov.selfserve;

import java.io.*;
import javax.servlet.http.*;
import lagan.api.auth.*;
import lagan.api.main.*;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;
import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;
import java.util.Date;
import java.util.Calendar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

import javax.mail.*;

public class ClosedLaganCases extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	DateFormat dbFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String todaysDate = dbFormat.format(new Date());
	RunClosedLaganCases timedJob = new RunClosedLaganCases();
	Timer timer = new Timer();

	public void init()
	{
		System.out.println("*** ClosedLaganCases started @ " + todaysDate);
		String enabled = getServletConfig().getInitParameter("enabled");
		if(enabled.equals("true")){
		   timedJob.schedule();
		}
	}
	
	public void destroy()
	{
        timer.purge();
        timer.cancel();
	}

	public final class RunClosedLaganCases extends TimerTask
	{
		private final long final_minute = 1000 * 60;
		private final long final_hour = 1000 * 60 * 60;
		private final long final_day = 1000 * 60 * 60 * 60;
		private String smtpHost;
		private String laganSystem;
		private String errorEmailTo;
		private String emailFrom;
		private String auditEmailTo;
		private String[] strErrorEmailTo = new String[1];
		private String[] strErrorEmailBCC = new String[0];
		private String[] emailBCC = new String[1];
		private String[] emailSLA = new String[1];
		private String currentDate;
		private boolean continueProcessing = true;
		private String strCheckEvery;
		private String overrideCheckRestrictions;
		private long intCheckEvery = 0;
		private String emailedCases = "";
		private String localDialCode = "";
		private String textMessageFrom = "";
		private DateFormat textDateFormat = new SimpleDateFormat("EEEEEEEEE, d MMMMMMMMM yyyy 'at' HH:mm:ss");
		private DateFormat voiceDateFormat = new SimpleDateFormat("EEEEEEEEE, d MMMMMMMMM yyyy 'at' h mm a");
		private String smsFrom = "";

		public RunClosedLaganCases()
		{
			super();
		}

		public void schedule()
		{
			strCheckEvery = getServletConfig().getInitParameter("checkEvery");
			if (strCheckEvery.equals("minute"))
			{
				intCheckEvery = final_minute;
			}
			if (strCheckEvery.equals("hour"))
			{
				intCheckEvery = final_hour;
			}
			if (strCheckEvery.equals("day"))
			{
				intCheckEvery = final_day;
			}
			TimerTask runJob = new RunClosedLaganCases();
			//Timer timer = new Timer();
			timer.scheduleAtFixedRate(runJob, final_minute, intCheckEvery);
		}

		public void run()
		{
			todaysDate = dbFormat.format(new Date());
			System.out.println("*** ClosedLaganCases ran @ " + todaysDate);
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
			DateFormat emailDateFormat = new SimpleDateFormat("dd/MM/yyyy 'at' HH:mm");
			Date date = new Date();
			Calendar today = Calendar.getInstance();
			currentDate = dateFormat.format(date);
			laganSystem = getServletContext().getInitParameter("laganSystem");
			errorEmailTo = getServletContext().getInitParameter("errorEmailTo");
			auditEmailTo = getServletContext().getInitParameter("auditEmailTo");
			emailFrom = getServletContext().getInitParameter("emailFrom");
			smtpHost = getServletContext().getInitParameter("smtpHost");
			localDialCode = getServletContext().getInitParameter("localDialCode");
			textMessageFrom = getServletContext().getInitParameter("textMessageFrom");
			String contactNumber = getServletContext().getInitParameter("contactNumber");
			String twitterTESTConsumerKey = getServletContext().getInitParameter("twitter-TEST-Consumer-Key");
			String twitterTESTConsumerSecret = getServletContext().getInitParameter("twitter-TEST-Consumer-Secret");
			String twitterTESTAccessTokenKey = getServletContext().getInitParameter("twitter-TEST-Access-Token-Key");
			String twitterTESTAccessTokenSecret = getServletContext().getInitParameter("twitter-TEST-Access-Token-Secret");
			String twitterALLConsumerKey = getServletContext().getInitParameter("twitter-ALL-Consumer-Key");
			String twitterALLConsumerSecret = getServletContext().getInitParameter("twitter-ALL-Consumer-Secret");
			String twitterALLAccessTokenKey = getServletContext().getInitParameter("twitter-ALL-Access-Token-Key");
			String twitterALLAccessTokenSecret = getServletContext().getInitParameter("twitter-ALL-Access-Token-Secret");
			overrideCheckRestrictions = getServletConfig().getInitParameter("overrideCheckRestrictions");
			smsFrom = getServletContext().getInitParameter("smsFrom");
			strErrorEmailTo[0] = errorEmailTo;
			emailSLA[0] = getServletConfig().getInitParameter("slaEmailAddress");
			emailBCC[0] = getServletConfig().getInitParameter("bccEmailAddress");
			emailedCases = "";

			if (overrideCheckRestrictions.equals("true")
				|| (today.get(Calendar.DAY_OF_WEEK) > 1
				&& today.get(Calendar.DAY_OF_WEEK) < 7
				&& today.get(Calendar.HOUR_OF_DAY) > 7
				&& today.get(Calendar.HOUR_OF_DAY) < 18))
			{
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
					String errorLine2 = "ClosedLaganCases - Failed - Authenticating to Lagan";
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
						authenticationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to authenticate to Lagan", emailContents, emailFrom, smtpHost, false);
					}
					catch (MessagingException emailError)
					{
						System.out.println("Email error : " + emailError.toString());
					}
				}
				
 			    try
 			     {
		 		 Class.forName("org.sqlite.JDBC");
				 }
				catch (ClassNotFoundException error)
				 {
				 System.out.println("{\"name\":\"ClassNotFoundException\"}");
				 continueProcessing = false;
				 String errorLine1 = "";
				 String errorLine2 = "ClosedLaganCases - Failed - Loading JDBC class";
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
				 SendMail authenticationErrorEmail = new SendMail();
				 try
					{
					authenticationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to authenticate to Lagan", emailContents, emailFrom, smtpHost, false);
					}
				catch (MessagingException emailError)
					{
					System.out.println("Email error : " + emailError.toString());
					}
				 }
				String processingCase="";
				try
				{
					Connection dbConnection = DriverManager.getConnection("jdbc:sqlite:" + getServletContext().getRealPath("/WEB-INF/mycouncil.db3"));
					Statement dbStatement = dbConnection.createStatement();
					ResultSet dbResult = dbStatement.executeQuery("SELECT caseReference from openCases ORDER BY caseReference ASC;");
					while(dbResult.next()){
							System.out.println(dbResult.getString(1));
							processingCase=dbResult.getString(1);
							org.apache.axis.client.Stub webStub = null;
							FLWebService webService = new FLWebServiceLocator(config);
							FLWebInterface webInterface = webService.getFL();
							webStub = (Stub)webInterface;
							SOAPHeaderElement[] respHdrs = authStub.getResponseHeaders();
							for (int i = 0; i < respHdrs.length; i++)
							{
								webStub.setHeader(respHdrs[i]);
							}
							String[] options = { "all" };
							FWTCaseFullDetailsRequest caseRequest = new FWTCaseFullDetailsRequest(dbResult.getString(1), options);
							FWTCaseFullDetails caseDetails = webInterface.retrieveCaseDetails(caseRequest);
							FWTCaseCoreDetails coreDetails;
							try
							  {
							  coreDetails = caseDetails.getCoreDetails();
							  String textDate="";
							  String voiceDate="";
							  try{
							     textDate = textDateFormat.format(coreDetails.getClosed().getTime());
							     voiceDate = voiceDateFormat.format(coreDetails.getClosed().getTime());
							  }
							  catch(NullPointerException error){
							  }
							  FWTCaseEformData[] eFormData = caseDetails.getEformData();
							  FWTEformField[] eFormsFields = eFormData[0].getEformData();
							  String emailDescription = "";
							  String ward="";
							  String slaDate = "";
							  String urlForTwitter = "";
							  String urlForEmail = "";
							  String sector="";
							  String emailAddress = "";
							  String customerTelephone = "";
							  for (int currentField = 0; currentField < eFormsFields.length; currentField++)
								{
									if (eFormsFields[currentField].getFieldName().equals("txthumandescription"))
									{
										emailDescription = eFormsFields[currentField].getFieldValue();
									}
									if (eFormsFields[currentField].getFieldName().equals("txtward"))
									{
										ward = eFormsFields[currentField].getFieldValue();
									}
									if (eFormsFields[currentField].getFieldName().equals("txtshorturltwitter"))
									{
										urlForTwitter = eFormsFields[currentField].getFieldValue();
									}
									if (eFormsFields[currentField].getFieldName().equals("txtsector"))
									{
										sector = eFormsFields[currentField].getFieldValue();
									}
									if (eFormsFields[currentField].getFieldName().equals("txtshorturlemail"))
									{
										urlForEmail = eFormsFields[currentField].getFieldValue();
									}
									if (eFormsFields[currentField].getFieldName().equals("txtemail"))
									{
										emailAddress = eFormsFields[currentField].getFieldValue();
									}
									if (eFormsFields[currentField].getFieldName().equals("txtcustomertelephone"))
									{
										customerTelephone = eFormsFields[currentField].getFieldValue();
									}
								}
							  if(coreDetails.getStatus().equals("open"))
							  {
								  try{
								    if (today.getTime().after(coreDetails.getDueDate().getTime()) && today.get(Calendar.HOUR_OF_DAY) == 8 && !emailAddress.equals("")){
									     System.out.println("Open SLA Email");
										 sendEmail(dbResult.getString(1).substring(dbResult.getString(1).length() - 6),
												   emailAddress,
										           emailBCC,
										           emailSLA,
										           emailDateFormat.format(coreDetails.getOpened().getTime()),
										           slaDate,
										           true,
										           true,
										           emailDescription,
										           contactNumber,
										           urlForEmail);
										  if(!emailedCases.equals("")){
											  emailedCases += "<br>";
										  }
										  emailedCases += dbResult.getString(1) + " (Open, Sla Violation)";
								     }else{
								    	  emailedCases += dbResult.getString(1);
								     }
								  }
								  catch(NullPointerException exceptionError){
									  if(!emailedCases.equals("")){
										  emailedCases += "<br>";
									  }
									  emailedCases += dbResult.getString(1);
								  }
							  }
							  else{
								  if(!emailedCases.equals("")){
									  emailedCases += "<br>";
								  }
									  emailedCases+=dbResult.getString(1) + " (Twitter)";
								  boolean slaViolation=false;
								  try{
      								    if(coreDetails.getClosed().getTime().after(coreDetails.getDueDate().getTime())){
    									  slaViolation=true;
      								    }
								  }
								  catch(NullPointerException exceptionError){  
								  }
								  //Send email confirmation of closure.
								  if(!emailAddress.equals("")){
										 sendEmail(dbResult.getString(1).substring(dbResult.getString(1).length() - 6),
										 emailAddress,
										 emailBCC,
										 emailSLA,
										 emailDateFormat.format(coreDetails.getClosed().getTime()),
										 slaDate,
										 false,
										 slaViolation,
										 emailDescription,
										 contactNumber,
										 urlForEmail);
								         if(slaViolation){
									       emailedCases += "<br>" + dbResult.getString(1) + " (Email - Closed, Sla Violation)";	
								         }else{
									       emailedCases += "<br>" + dbResult.getString(1) + " (Email - Closed, Within Sla)";	
								         }
								  								  
								  }
								  //Send text/voice confirmation of closure.
								  if(!customerTelephone.equals("")){
									 sendText(dbResult.getString(1).substring(dbResult.getString(1).length() - 6),
								              customerTelephone,
								              emailBCC,
								              emailSLA,
								              textDate,
								              voiceDate,
								              slaViolation);
							         if(slaViolation){
									       emailedCases += "<br>" + dbResult.getString(1) + " (Text - Closed, Sla Violation)";	
								         }else{
									       emailedCases += "<br>" + dbResult.getString(1) + " (Text - Closed, Within Sla)";	
								         }
								  }
							      //Post Entry to 'All' twitter stream.
								  String twitterMessage="";
								  String noWardMessage="A problem has been resolved regarding " + emailDescription + ". More details " + urlForTwitter;
								  String wardMessage=ward + " : " + noWardMessage;
								  if(wardMessage.length()>140){
							          twitterMessage = noWardMessage;
									  }
								  else{
									  twitterMessage = wardMessage;
									  }
								  if (continueProcessing && laganSystem.equals("test") && !twitterTESTConsumerKey.equals("")){
									  TwitterEntry caseTwitterEntry = new TwitterEntry();
									  caseTwitterEntry.createTwitterEntry(
							                  twitterMessage,
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
								  else{
									  if (continueProcessing && !twitterALLConsumerKey.equals(""))
									  {
										  TwitterEntry caseTwitterEntry = new TwitterEntry();
										  caseTwitterEntry.createTwitterEntry( 
												  twitterMessage,
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
									  //Post Entry to Sector twitter stream.
									  if(continueProcessing && !laganSystem.equals("test")){
									     try
									      {
										     TwitterEntry caseTwitterEntry = new TwitterEntry();
										     caseTwitterEntry.createTwitterEntry(
										    	  twitterMessage,
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
										     System.out.println("Null Pointer Exception error sending twitter message");
									     }
									  }
								  }
								  Statement dbStatement2 = dbConnection.createStatement();
								  dbStatement2 = dbConnection.createStatement();
								  dbStatement2.executeUpdate("DELETE from openCases WHERE caseReference = '" + dbResult.getString(1) + "';");
								  dbStatement2.close();				  
							  }
							  }
							catch (NullPointerException exceptionError)
							  {
							  }
							
					}
					dbStatement.close();
					dbConnection.close();
		        }
				catch (SQLException error)
					{
					System.out.println("{\"message\":\"" + error.toString() + "\"}");
					}
				catch (Exception closedCasesError)
				{
					System.out.print("{\"result\":\"failed\",\"reason\":\"Getting closed cases on Lagan\"}");
					continueProcessing = false;
					String errorLine1 = "";
					String errorLine2 = "ClosedLaganCases - Failed - Getting closed cases on Lagan";
					String errorLine3 = "Date        : " + currentDate;
					String errorLine4 = "LaganSystem : " + laganSystem;
					String errorLine5 = "Error       : " + closedCasesError.toString();
					String errorLine6 = "Case        : " + processingCase;
					System.out.println(errorLine1);
					System.out.println(errorLine2);
					System.out.println(errorLine3);
					System.out.println(errorLine4);
					System.out.println(errorLine5);
					System.out.println(errorLine6);
					closedCasesError.printStackTrace();
					String emailContents = errorLine1 + "<BR>" +
										   errorLine2 + "<BR>" +
										   errorLine3 + "<BR>" +
										   errorLine4 + "<BR>" +
										   errorLine5 + "<BR>" +
										   errorLine6;
					SendMail caseCreationErrorEmail = new SendMail();
					try
					{
						caseCreationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to get OpenCases on Lagan", emailContents, emailFrom, smtpHost, true);
					}
					catch (MessagingException emailError)
					{
						System.out.println("Email error : " + emailError.toString());
					}
				}
				
				if (continueProcessing)
				{
					sendEmail(emailedCases);
				}
			}
			else
			{
			System.out.println("*** ClosedLaganCases ran @ " + todaysDate + " : Outside of working hours, notifications supressed.");
			}
		}

		private void sendEmail(String laganCaseReference,
							   String emailAddress,
			                   String[] emailBCC,
			                   String[] emailSLA,
							   String closedDate,
							   String slaDate,
							   boolean open,
							   boolean slaViolation,
							   String emailDescription,
							   String contactNumber,
							   String urlForEmail)
		{
			String slaText = "";
			
			if (!slaDate.equals(""))
			{
				StringBuffer stringBufferSlaText = new StringBuffer();
				try
				{
					BufferedReader bufferedReaderSlaText = new BufferedReader(new FileReader(getServletContext().getRealPath("/email-templates/report-it-notification-sla.txt")));
					String nextLine = "";
					while ((nextLine = bufferedReaderSlaText.readLine()) != null)
					{
						stringBufferSlaText.append(nextLine);
					}
					bufferedReaderSlaText.close();
					slaText = stringBufferSlaText.toString().replace("AAA", slaDate);
				}
				catch (IOException fileError)
				{
					continueProcessing = false;
					String errorLine1 = "";
					String errorLine2 = "CreateLaganCase - Failed - Reading report-it-notification-sla.txt";
					String errorLine3 = "Date        : " + currentDate;
					String errorLine4 = "LaganSystem : " + laganSystem;
					String errorLine5 = "Error       : " + fileError.toString();
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
						confirmationEmailError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a notification email", emailContents, emailFrom, smtpHost, true);
					}
					catch (MessagingException emailError)
					{
						System.out.println("Email error : " + emailError.toString());
					}
				}
			}

			String slaExplanation = "";

			if (slaViolation)
			{
				StringBuffer stringBufferSlaText = new StringBuffer();
				try
				{
					String slaFile="";
					if(open){
						slaFile="/email-templates/report-it-notification-open-out-sla.txt";
					}else{
						slaFile="/email-templates/report-it-notification-out-sla.txt";
					}
					BufferedReader bufferedReaderSlaText = new BufferedReader(new FileReader(getServletContext().getRealPath(slaFile)));
					String nextLine = "";
					while ((nextLine = bufferedReaderSlaText.readLine()) != null)
					{
						stringBufferSlaText.append(nextLine);
					}
					bufferedReaderSlaText.close();
					slaExplanation = stringBufferSlaText.toString();
				}
				catch (IOException fileError)
				{
					continueProcessing = false;
					String errorLine1 = "";
					String errorLine2 = "CreateLaganCase - Failed - Reading report-it-notification-out-sla.txt";
					String errorLine3 = "Date        : " + currentDate;
					String errorLine4 = "LaganSystem : " + laganSystem;
					String errorLine5 = "Error       : " + fileError.toString();
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
						confirmationEmailError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a notification email", emailContents, emailFrom, smtpHost, true);
					}
					catch (MessagingException emailError)
					{
						System.out.println("Email error : " + emailError.toString());
					}
				}
			}
			else
			{
				StringBuffer stringBufferSlaText = new StringBuffer();
				try
				{
					BufferedReader bufferedReaderSlaText = new BufferedReader(new FileReader(getServletContext().getRealPath("/email-templates/report-it-notification-in-sla.txt")));
					String nextLine = "";
					while ((nextLine = bufferedReaderSlaText.readLine()) != null)
					{
						stringBufferSlaText.append(nextLine);
					}
					bufferedReaderSlaText.close();
					slaExplanation = stringBufferSlaText.toString();
				}
				catch (IOException fileError)
				{
					continueProcessing = false;
					String errorLine1 = "";
					String errorLine2 = "CreateLaganCase - Failed - Reading report-it-notification-out-sla.txt";
					String errorLine3 = "Date        : " + currentDate;
					String errorLine4 = "LaganSystem : " + laganSystem;
					String errorLine5 = "Error       : " + fileError.toString();
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
						confirmationEmailError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a notification email", emailContents, emailFrom, smtpHost, true);
					}
					catch (MessagingException emailError)
					{
						System.out.println("Email error : " + emailError.toString());
					}
				}
			}

			StringBuffer emailTextBuffer = new StringBuffer();
			try
			{					
				String emailFile="";
			    if(open){
				  emailFile="/email-templates/report-it-notification-open.txt";
			    }else{
				  emailFile="/email-templates/report-it-notification.txt";
			    }
				BufferedReader emailTemplate = new BufferedReader(new FileReader(getServletContext().getRealPath(emailFile)));
				String nextLine = "";
				while ((nextLine = emailTemplate.readLine()) != null)
				{
					emailTextBuffer.append(nextLine);
				}
				emailTemplate.close();
			}
			catch (IOException fileError)
			{
				continueProcessing = false;
				String errorLine1 = "";
				String errorLine2 = "CreateLaganCase - Failed - Reading report-it-notification.txt";
				String errorLine3 = "Date        : " + currentDate;
				String errorLine4 = "LaganSystem : " + laganSystem;
				String errorLine5 = "Error       : " + fileError.toString();
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
					confirmationEmailError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a notification email", emailContents, emailFrom, smtpHost, true);
				}
				catch (MessagingException emailError)
				{
					System.out.println("Email error : " + emailError.toString());
				}
			}
			String slaColour = "";
			if (slaViolation)
			{
				slaColour = "red";
			}
			else
			{
				slaColour = "green";
			}
			String emailTextString = emailTextBuffer.toString();
			String amendedEmailTextString = emailTextString.replace("AAA", laganCaseReference);
			amendedEmailTextString = amendedEmailTextString.replace("BBB", slaColour);
			amendedEmailTextString = amendedEmailTextString.replace("CCC", closedDate);
			amendedEmailTextString = amendedEmailTextString.replace("DDD", slaText);
			amendedEmailTextString = amendedEmailTextString.replace("EEE", emailDescription);
			amendedEmailTextString = amendedEmailTextString.replace("GGG", slaExplanation);
			amendedEmailTextString = amendedEmailTextString.replace("HHH", contactNumber);
			amendedEmailTextString = amendedEmailTextString.replace("III", urlForEmail);
			//amendedEmailTextString = amendedEmailTextString.replace("DDD", myCouncilURL + "?search=");

			SendMail email = new SendMail();
			String[] strEmailTo = { emailAddress };
			String[] tempBCC;
			if (slaViolation)
			{
				tempBCC = new String[2];
				tempBCC[0] = emailBCC[0];
				tempBCC[1] = emailSLA[0];
			}
			else
			{
			    tempBCC=emailBCC;
			}
			try
			{
				String emailTitle="";
				if(open){
					emailTitle=" is still outstanding";
				}else{
					emailTitle=" has been resolved";
				}
				email.postMail(strEmailTo, tempBCC, "MyCouncil : Your Call Number " + laganCaseReference + emailTitle, amendedEmailTextString, emailFrom, smtpHost, true);
			}
			catch (MessagingException confirmationError)
			{
				continueProcessing = false;
				String errorLine1 = "";
				String errorLine2 = "CreateLaganCase - Failed - Sending confirmation email";
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

		private void sendEmail(String closedCases)
		{
			StringBuffer stringBufferText = new StringBuffer();
			try
			{
				BufferedReader bufferedReaderText = new BufferedReader(new FileReader(getServletContext().getRealPath("/email-templates/report-it-notification-audit.txt")));
				String nextLine = "";
				while ((nextLine = bufferedReaderText.readLine()) != null)
				{
					stringBufferText.append(nextLine);
				}
				bufferedReaderText.close();
				if(closedCases.equals("")){
					closedCases="<BR>There are no MyCouncil cases for this run.";
				}
				String amendedEmailTextString = stringBufferText.toString().replace("AAA", closedCases);
				SendMail email = new SendMail();
				String[] strEmailTo = { auditEmailTo };
				try
				{
					email.postMail(strEmailTo, strErrorEmailBCC, getServletContext().getServletContextName() + " : Notifications Audit", amendedEmailTextString, emailFrom, smtpHost, true);
				}
				catch (MessagingException confirmationError)
				{
					continueProcessing = false;
					String errorLine1 = "";
					String errorLine2 = "CreateLaganCase - Failed - Sending audit email";
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
						confirmationEmailError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send an audit email", emailContents, emailFrom, smtpHost, true);
					}
					catch (MessagingException emailError)
					{
						System.out.println("Email error : " + emailError.toString());
					}
				}
			}
			catch (IOException fileError)
			{
				continueProcessing = false;
				String errorLine1 = "";
				String errorLine2 = "CreateLaganCase - Failed - Reading report-it-notification-audit.txt";
				String errorLine3 = "Date        : " + currentDate;
				String errorLine4 = "LaganSystem : " + laganSystem;
				String errorLine5 = "Error       : " + fileError.toString();
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
					confirmationEmailError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send an audit email", emailContents, emailFrom, smtpHost, true);
				}
				catch (MessagingException emailError)
				{
					System.out.println("Email error : " + emailError.toString());
				}
			}
		}

		private void sendText(String laganCaseReference, 
			                  String phoneNumber, 
			                  String[] emailBCC, 
			                  String[] emailSLA, 
			                  String textDate, 
			                  String voiceDate,
			                  boolean slaViolation)
		{
	    phoneNumber = phoneNumber.replaceAll(" ", "");
	    if (phoneNumber.length() == 5 || phoneNumber.length() == 6)
	    {
	        phoneNumber = localDialCode + phoneNumber;
	    }
	    if (phoneNumber.length() > 7 && phoneNumber.length() < 13)
	    {
	    String textMessage = "";
	    String messagePart1 = "This is a message from " + textMessageFrom + " regarding call number  ";
	    String messagePart2 = ". Your call was resolved on ";
	    String caseReference = "";
	    String messageDate = "";
	    if (phoneNumber.startsWith("07"))
	       {
	       caseReference = laganCaseReference;
		   messageDate = textDate;
	       }
	    else
	       {
	       for (int currentCharacter = 0; currentCharacter < laganCaseReference.length(); currentCharacter++)
	          {
	          caseReference = caseReference + laganCaseReference.substring(currentCharacter, currentCharacter + 1);
	          if (currentCharacter != laganCaseReference.length() - 1)
	            {
	            caseReference = caseReference + " ";
	            }
	          }
			  messageDate = voiceDate;
	       }
		   textMessage = messagePart1 + caseReference + messagePart2 + messageDate + ".";
	       if (textMessage.length() > 160)
	        {
	        String errorLine1 = "";
	        String errorLine2 = "ClosedLaganCases - Failed - Sending text message";
	        String errorLine3 = "Date        : " + currentDate;
	        String errorLine4 = "LaganSystem : " + laganSystem;
	        String errorLine5 = "Error       : Text Message Too Long = '" + textMessage + "'";
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
	      SendMail textMail = new SendMail();
	      String[] strEmailTo = { phoneNumber + "@smsmaker.com" };
		  String[] tempBCC;
		  if (slaViolation)
		  {
			  tempBCC = new String[2];
			  tempBCC[0] = emailBCC[0];
			  tempBCC[1] = emailSLA[1];
		  }
		  else
		  {
			  tempBCC = emailBCC;
		  }

	      try
	        {
				textMail.postMail(strEmailTo, tempBCC, "", textMessage, smsFrom, smtpHost, false);
	        }
	      catch (MessagingException textMessageError)
	        {
	        String errorLine1 = "";
	        String errorLine2 = "ClosedLaganCases - Failed - Sending text message";
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