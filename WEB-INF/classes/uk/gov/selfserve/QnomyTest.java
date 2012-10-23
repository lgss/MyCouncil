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

public class QnomyTest extends HttpServlet
   {

   public void doGet(HttpServletRequest request,
                     HttpServletResponse response) 
                    throws ServletException, IOException
      {
      System.getProperties().put("http.proxyHost", "localhost");
	  System.getProperties().put("http.proxyPort", "8888");
      DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	  DateFormat slaDateFormat = new SimpleDateFormat("EEEEEEEEE, d MMMMMMMMM yyyy 'at' HH:mm:ss");
	  DateFormat voiceSlaDateFormat = new SimpleDateFormat("EEEEEEEEE, d MMMMMMMMM yyyy 'at' h mm a");
	  Date date = new Date();
	  String version = "v0.009";
      String currentDate = dateFormat.format(date);
	  String laganSystem = getServletContext().getInitParameter("laganSystem");
	  String host = getServletContext().getInitParameter("host") + "/" + getServletContext().getServletContextName();
	  String errorEmailTo = getServletContext().getInitParameter("errorEmailTo");
	  String emailFrom = getServletContext().getInitParameter("emailFrom");
	  String smsFrom = getServletContext().getInitParameter("smsFrom");
	  String smtpHost = getServletContext().getInitParameter("smtpHost");
	  String localDialCode = getServletContext().getInitParameter("localDialCode");
	  String textMessageFrom = getServletContext().getInitParameter("textMessageFrom");
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
			  lagan.api.main.FWTPartySearch partySearch = new lagan.api.main.FWTPartySearch();
			  partySearch.setSearchType("individual");
			  partySearch.setName("White");
			  partySearch.setForename("Kevin");
			  partySearch.setPostcode("NN5 4EA");
			  lagan.api.main.FWTObjectBriefDetails[] people = webInterface.searchForParty(partySearch);
			  lagan.api.main.FWTInteractionCreate interaction = new lagan.api.main.FWTInteractionCreate();
			  interaction.setPartyID(people[0].getObjectID());
			  String[] notes = {"http://www.northampton.gov.uk"};
			  interaction.setChannel("face_to_face");
			  interaction.setNoteText(notes);
			  webInterface.createInteraction(interaction);

			  //lagan.api.main.FWTCaseCreate caseCreate = new lagan.api.main.FWTCaseCreate();
			  //caseCreate.setClassificationEventCode(Integer.parseInt(classificationCode));
			  //caseCreate.setTitle("Reported via MyCouncil");
			  //caseCreate.setDescription("Enquiry sent from IP: <" + request.getRemoteHost() + ">");
			  //laganCaseReference = webInterface.createCase(caseCreate);
			  //String[] options = { "all" };
			  //lagan.api.main.FWTCaseFullDetailsRequest caseRequest = new lagan.api.main.FWTCaseFullDetailsRequest(laganCaseReference, options);
			  //lagan.api.main.FWTCaseFullDetails caseDetails = webInterface.retrieveCaseDetails(caseRequest);
			  //lagan.api.main.FWTCaseCoreDetails coreDetails = caseDetails.getCoreDetails();
			  //try
			  //{
			  //    slaDate = slaDateFormat.format(coreDetails.getDueDate().getTime());
			  //    voiceSlaDate = voiceSlaDateFormat.format(coreDetails.getDueDate().getTime());
			  //}
			  //catch (NullPointerException exceptionError)
			  //{
			  //    slaDate = "not available";
			  //}
			  //laganCaseReference = laganCaseReference.substring(laganCaseReference.length() - 6);
			  ajaxResponse.println("{\"result\":\"success\",\"callNumber\":\"" + laganCaseReference + "\",\"slaDate\":\"" + slaDate + "\"}");	  
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
   }