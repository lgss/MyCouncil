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
import java.util.GregorianCalendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

import javax.mail.*;

public class ClosedLaganCases extends HttpServlet
{
	private static String todaysDate;
	private String version = "v1.00";

	public void init()
	{
		String enabled = getServletConfig().getInitParameter("enabled");
		if(enabled.equals("true")){
		   DateFormat dbFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   todaysDate = dbFormat.format(new Date());
		   System.out.println("*** ClosedLaganCases " + version + " started @ " + todaysDate);
		   RunClosedLaganCases timedJob = new RunClosedLaganCases();
		   timedJob.schedule();
		}
	}

	public final class RunClosedLaganCases extends TimerTask
	{
		private final long final_now = 0;
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
		private String closedCases = "";
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
			Timer timer = new Timer();
			timer.scheduleAtFixedRate(runJob, final_minute, intCheckEvery);
		}

		public void run()
		{
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
			DateFormat emailDateFormat = new SimpleDateFormat("dd/MM/yyyy 'at' HH:mm");
			Date date = new Date();
			Calendar today = Calendar.getInstance();
			System.out.println("DayOfWeek=" + today.get(Calendar.DAY_OF_WEEK));
			System.out.println("HourOfDay=" + today.get(Calendar.HOUR_OF_DAY));
			currentDate = dateFormat.format(date);
			laganSystem = getServletContext().getInitParameter("laganSystem");
			errorEmailTo = getServletContext().getInitParameter("errorEmailTo");
			auditEmailTo = getServletContext().getInitParameter("auditEmailTo");
			emailFrom = getServletContext().getInitParameter("emailFrom");
			smtpHost = getServletContext().getInitParameter("smtpHost");
			localDialCode = getServletContext().getInitParameter("localDialCode");
			textMessageFrom = getServletContext().getInitParameter("textMessageFrom");
			overrideCheckRestrictions = getServletConfig().getInitParameter("overrideCheckRestrictions");
			smsFrom = getServletContext().getInitParameter("smsFrom");
			strErrorEmailTo[0] = errorEmailTo;
			emailSLA[0] = getServletConfig().getInitParameter("slaEmailAddress");
			emailBCC[0] = getServletConfig().getInitParameter("bccEmailAddress");
			boolean dueFound = false;
			closedCases = "";

			if (overrideCheckRestrictions.equals("true")
				|| (today.get(Calendar.DAY_OF_WEEK) > 1
				&& today.get(Calendar.DAY_OF_WEEK) < 7
				&& today.get(Calendar.HOUR_OF_DAY) > 7
				&& today.get(Calendar.HOUR_OF_DAY) < 18))
			{
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
					String errorLine2 = "ClosedLaganCases " + version + " - Failed - Authenticating to Lagan";
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
				String previousDate = "";
				try
				{
					InputStream inputStream = getServletContext().getResourceAsStream("/WEB-INF/last_closed_date.txt");
					InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
					BufferedReader reader = new BufferedReader(inputStreamReader);
					previousDate = reader.readLine();
				}
				catch (IOException ioError)
				{
					continueProcessing = false;
					System.out.println(ioError.toString());
				}
				System.out.println("previousDate=" + previousDate);
				Calendar lastRun = new GregorianCalendar(Integer.valueOf(previousDate.substring(6, 10)),
														 Integer.valueOf(previousDate.substring(3, 5)) - 1,
														 Integer.valueOf(previousDate.substring(0, 2)),
														 Integer.valueOf(previousDate.substring(11, 13)),
														 Integer.valueOf(previousDate.substring(14, 16)));

				//Get cases from Lagan.
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
						lagan.api.main.FWTUser raisedByUser = new lagan.api.main.FWTUser("MyCouncil", "MyCouncil");
						lagan.api.main.FWTCaseSearch caseSearch = new lagan.api.main.FWTCaseSearch();
						caseSearch.setRaisedByUser(raisedByUser);
						caseSearch.setStatus("closed");
						caseSearch.setResultsLimit(999);
						lagan.api.main.FWTCaseBriefDetails[] caseDetails = webInterface.searchForCases(caseSearch);
						System.out.println("numOfCases=" + caseDetails.length);
						for (int currentCase = 0; currentCase < caseDetails.length; currentCase++)
						{
							String[] options = { "core" };
							lagan.api.main.FWTCaseFullDetailsRequest caseRequest = new lagan.api.main.FWTCaseFullDetailsRequest(caseDetails[currentCase].getCaseReference(), options);
							lagan.api.main.FWTCaseFullDetails fullDetails = webInterface.retrieveCaseDetails(caseRequest);
							lagan.api.main.FWTCaseCoreDetails coreDetails;
							try
							{
								coreDetails = fullDetails.getCoreDetails();
								if (coreDetails.getClosed().getTime().after(lastRun.getTime()))
								{
									System.out.println("case=" + caseDetails[currentCase].getCaseReference() + " ,closed=" + coreDetails.getClosed().getTime().toString());
									String textDate = textDateFormat.format(coreDetails.getClosed().getTime());
									String voiceDate = voiceDateFormat.format(coreDetails.getClosed().getTime());
									String[] selectedOptions = { "all" };
									lagan.api.main.FWTCaseFullDetailsRequest selectedCaseRequest = new lagan.api.main.FWTCaseFullDetailsRequest(caseDetails[currentCase].getCaseReference(), selectedOptions);
									lagan.api.main.FWTCaseFullDetails selectedFullDetails = webInterface.retrieveCaseDetails(selectedCaseRequest);
									lagan.api.main.FWTCaseEformData[] eFormData = selectedFullDetails.getEformData();
									lagan.api.main.FWTEformField[] eFormsFields = eFormData[0].getEformData();
									String emailDescription = "";
									String slaDate = "";
									boolean slaViolation = false;
									try
									{
										slaDate = dateFormat.format(coreDetails.getDueDate().getTime());
										if (coreDetails.getClosed().after(coreDetails.getDueDate()))
										{
											slaViolation = true;
										}
									}
									catch (NullPointerException exceptionError)
									{
									}
									for (int currentField = 0; currentField < eFormsFields.length; currentField++)
									{
										System.out.println(eFormsFields[currentField].getFieldName());
										if (eFormsFields[currentField].getFieldName().equals("txtdescription"))
										{
											emailDescription = eFormsFields[currentField].getFieldValue();
										}
									}
									for (int currentField = 0; currentField < eFormsFields.length; currentField++)
									{
										if (eFormsFields[currentField].getFieldName().equals("txtemail") &&
										   !eFormsFields[currentField].getFieldValue().equals(""))
										{
											sendEmail(caseDetails[currentCase].getCaseReference().substring(caseDetails[currentCase].getCaseReference().length() - 6),
													 eFormsFields[currentField].getFieldValue(),
													 emailBCC,
													 emailSLA,
													 emailDateFormat.format(coreDetails.getClosed().getTime()),
													 slaDate,
													 slaViolation,
													 emailDescription);
											closedCases += "<br>" + caseDetails[currentCase].getCaseReference();
										}
										if (eFormsFields[currentField].getFieldName().equals("txtcustomertelephone") &&
										 !eFormsFields[currentField].getFieldValue().equals(""))
										{
											sendText(caseDetails[currentCase].getCaseReference().substring(caseDetails[currentCase].getCaseReference().length() - 6),
												     eFormsFields[currentField].getFieldValue(),
													 emailBCC,
													 emailSLA,
													 textDate,
													 voiceDate,
													 slaViolation);
										}
									}
								}
							}
							catch (NullPointerException exceptionError)
							{
								System.out.print("{\"result\":\"success\",\"status\":\"" + exceptionError.toString() + "\"}");
								exceptionError.printStackTrace();
								return;
							}
						}
					}
					catch (Exception closedCasesError)
					{
						System.out.print("{\"result\":\"failed\",\"reason\":\"Getting closed cases on Lagan\"}");
						continueProcessing = false;
						String errorLine1 = "";
						String errorLine2 = "ClosedLaganCases " + version + " - Failed - Getting closed cases on Lagan";
						String errorLine3 = "Date        : " + currentDate;
						String errorLine4 = "LaganSystem : " + laganSystem;
						String errorLine5 = "Error       : " + closedCasesError.toString();
						String errorLine6 = "";
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
							caseCreationErrorEmail.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to view a case on Lagan", emailContents, emailFrom, smtpHost, false);
						}
						catch (MessagingException emailError)
						{
							System.out.println("Email error : " + emailError.toString());
						}
					}
				}

				if (continueProcessing)
				{
					sendEmail(closedCases);
					try
					{
						FileWriter outputFile = new FileWriter(getServletContext().getRealPath("/WEB-INF/last_closed_date.txt"));
						BufferedWriter outputFileBuffer = new BufferedWriter(outputFile);
						outputFileBuffer.write(currentDate);
						outputFileBuffer.newLine();
						outputFileBuffer.close();
					}
					catch (IOException error)
					{
						System.out.println("Unable to update last_closed_date.txt : " + error.toString());
					}
				}
			}
			else
			{
			System.out.println("*** ClosedLaganCases " + version + " ran @ " + todaysDate + " : Outside of working hours, notifications supressed.");
			}
		}

		private void sendEmail(String laganCaseReference,
							   String emailAddress,
			                   String[] emailBCC,
			                   String[] emailSLA,
							   String closedDate,
							   String slaDate,
							   boolean slaViolation,
							   String emailDescription)
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
					String errorLine2 = "CreateLaganCase " + version + " - Failed - Reading report-it-notification-sla.txt";
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
					BufferedReader bufferedReaderSlaText = new BufferedReader(new FileReader(getServletContext().getRealPath("/email-templates/report-it-notification-out-sla.txt")));
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
					String errorLine2 = "CreateLaganCase " + version + " - Failed - Reading report-it-notification-out-sla.txt";
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
					String errorLine2 = "CreateLaganCase " + version + " - Failed - Reading report-it-notification-out-sla.txt";
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
				BufferedReader emailTemplate = new BufferedReader(new FileReader(getServletContext().getRealPath("/email-templates/report-it-notification.txt")));
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
				String errorLine2 = "CreateLaganCase " + version + " - Failed - Reading report-it-notification.txt";
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
				email.postMail(strEmailTo, tempBCC, "MyCouncil : Your Call Number " + laganCaseReference + " has been resolved", amendedEmailTextString, emailFrom, smtpHost, true);
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
					closedCases="<BR>There were no emails to be sent for this run.";
				}
				String amendedEmailTextString = stringBufferText.toString().replace("AAA", closedCases);
				SendMail email = new SendMail();
				String[] strEmailTo = { auditEmailTo };
				try
				{
					email.postMail(strEmailTo, strErrorEmailBCC, "MyCouncil : Confirmation of emails sent", amendedEmailTextString, emailFrom, smtpHost, true);
				}
				catch (MessagingException confirmationError)
				{
					continueProcessing = false;
					String errorLine1 = "";
					String errorLine2 = "CreateLaganCase " + version + " - Failed - Sending audit email";
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
				String errorLine2 = "CreateLaganCase " + version + " - Failed - Reading report-it-notification-audit.txt";
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
	        String errorLine2 = "ClosedLaganCases " + version + " - Failed - Sending text message";
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
	        String errorLine2 = "ClosedLaganCases " + version + " - Failed - Sending text message";
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