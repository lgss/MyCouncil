package uk.gov.selfserve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

public class HousingAppReceipt extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{

		String errorEmailTo = getServletContext().getInitParameter("errorEmailTo");
		String emailFrom = getServletContext().getInitParameter("emailFrom");
		String smtpHost = getServletContext().getInitParameter("smtpHost");
		String nbcTelNumber = getServletContext().getInitParameter("contactNumber");
		String localDialCode = getServletContext().getInitParameter("localDialCode");
		String textMessageFrom = getServletContext().getInitParameter("textMessageFrom");
		String smsFrom = getServletContext().getInitParameter("smsFrom");
		String housingLoginUrl = getServletConfig().getInitParameter("housingLoginUrl");
		String emailTemplatePath = getServletContext().getRealPath("/email-templates/housing-application-receipt.txt");
		String[] emailBCC = {getServletConfig().getInitParameter("bccEmailAddress")};
		String[] strErrorEmailTo = { errorEmailTo };
		String[] strErrorEmailBCC = new String[0];
		
		String emailAddress = req.getParameter("email");
		String telephoneNumber = req.getParameter("tel");
		String applicationRef = req.getParameter("ref");
		
		boolean success = false;
		boolean emailSent = false;
		boolean textSent = false;
		String callback = req.getParameter("callback") != null ? req.getParameter("callback") : "callback";

		PrintWriter output = res.getWriter();
		res.setContentType("application/json");

		if(emailAddress != null){
			emailAddress = URLDecoder.decode(emailAddress, "UTF-8");
			emailSent = sendEmailConfirmation(applicationRef,emailAddress,nbcTelNumber, housingLoginUrl, emailTemplatePath, strErrorEmailTo, strErrorEmailBCC, emailBCC, emailFrom, smtpHost);
		}
		if(telephoneNumber != null){
			telephoneNumber = URLDecoder.decode(telephoneNumber, "UTF-8");
			textSent = sendTextConfirmation(strErrorEmailTo, strErrorEmailBCC, smtpHost, emailFrom, textMessageFrom, localDialCode, smsFrom, emailBCC,  telephoneNumber, applicationRef);
		}
		if(emailSent || textSent){
			success = true;
		}
		JSONObject jsonResponse = new JSONObject();

		try {
			jsonResponse.put("success", success);
			jsonResponse.put("email", emailSent);
			jsonResponse.put("sms", textSent);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		output.print(callback + "(" + jsonResponse + ")");
	}

	//Voice or Text Message Confirmation
	private boolean sendTextConfirmation(String[] strErrorEmailTo, String[] strErrorEmailBCC, String smtpHost, String emailFrom, 
			String textMessageFrom, String localDialCode, String smsFrom, String[] emailBCC, String phoneNumber, String applicationRef){

		//clear all spaces
		phoneNumber = phoneNumber.replaceAll(" ", "");

		//add dial code if the phone number isn't a mobile number
		if (phoneNumber.length() == 5 || phoneNumber.length() == 6) {
			phoneNumber = localDialCode + phoneNumber;
		}

		if (phoneNumber.length() > 7 && phoneNumber.length() < 13) {
			StringBuilder phoneText = new StringBuilder();
			phoneText.append("This is a message from " + textMessageFrom + ". ");

			if (applicationRef.length() > 0) {
				phoneText.append("Your housing application number is ");
			}

			//if the phone number isn't a mobile, expand the application 
			if (!phoneNumber.startsWith("07")) {
				StringBuilder newRef = new StringBuilder();
				for (int currentCharacter = 0; currentCharacter < applicationRef.length(); currentCharacter++)
				{
					newRef.append(applicationRef.charAt(currentCharacter));
					newRef.append(" ");
				}
				applicationRef = newRef.toString();
				System.out.println(applicationRef);
			}

			phoneText.append(applicationRef);
			phoneText.append(".");

			if (phoneText.length() > 160) {
				String errorLine1 = "";
				String errorLine2 = "HousingAppReceipt - Failed - Sending text message";
				String errorLine3 = "Date        : " ;
				String errorLine4 = "System : Housing";
				String errorLine5 = "Error       : Text Message Too Long = '" + phoneText.toString() + "'";
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
				try {
					textMessageLengthError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a text message", emailContents, emailFrom, smtpHost, true);
				}
				catch (MessagingException emailError) {
					System.out.println("Email error : " + emailError.toString());
				}
				return false;
			}

			SendMail textMessage = new SendMail();
			String[] strEmailTo = { phoneNumber + "@smsmaker.com" };

			try {
				textMessage.postMail(strEmailTo, emailBCC, "", phoneText.toString(), smsFrom, smtpHost, false);
			}
			catch (MessagingException textMessageError) {
				String errorLine1 = "";
				String errorLine2 = "HousingAppReceipt - Failed - Sending text message";
				String errorLine3 = "Date        : ";
				String errorLine4 = "System : Housing Application";
				String errorLine5 = "Error       : " + textMessageError.toString();
				String errorLine6 = "";
				System.out.println(errorLine1);
				System.out.println(errorLine2);
				System.out.println(errorLine3);
				System.out.println(errorLine4);
				System.out.println(errorLine5);
				System.out.println(errorLine6);
				textMessageError.printStackTrace();
				StringBuilder errors = new StringBuilder();
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
				return false;
			}


		}
		return true;
	}

	private boolean sendEmailConfirmation(String applicationRef, String emailAddress, String contactNumber, String housingLoginUrl, String emailTemplatePath, String[] strErrorEmailTo, String[] strErrorEmailBCC, String[] emailBCC, String emailFrom, String smtpHost){
		//Send the confirmation email.
		if (emailAddress.length() > 0)
		{
			String emailTextString="";;

			try{
				BufferedReader emailTemplate = new BufferedReader(new FileReader(emailTemplatePath));
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
				String errorLine2 = "Housing Receipt Email Failed - IO Exception error processing confirmation email file";
				String errorLine3 = "Date        : ";
				String errorLine4 = "System : Housing Application";
				String errorLine5 = "";
				System.out.println(errorLine1);
				System.out.println(errorLine2);
				System.out.println(errorLine3);
				System.out.println(errorLine4);
				System.out.println(errorLine5);
				error.printStackTrace();
				StringBuilder errors = new StringBuilder();
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

			String amendedEmailTextString = emailTextString.replace("AAA", applicationRef);
			//amendedEmailTextString = amendedEmailTextString.replace("BBB", "Please ensure you keep this number safe and quote it on any correspondence");
			amendedEmailTextString = amendedEmailTextString.replace("CCC", applicationRef);
			amendedEmailTextString = amendedEmailTextString.replace("DDD", contactNumber);
			amendedEmailTextString = amendedEmailTextString.replace("EEE", housingLoginUrl);

			SendMail email = new SendMail();
			String[] strEmailTo = { emailAddress };
			try
			{
				email.postMail(strEmailTo, emailBCC, "MyCouncil : Your Application Reference is " + applicationRef, amendedEmailTextString, emailFrom, smtpHost, true);
			}
			catch (MessagingException confirmationError)
			{
				String errorLine1 = "";
				String errorLine2 = "CreateCaseProcesses - Failed - Sending confirmation email";
				String errorLine3 = "Date        : ";
				String errorLine4 = "System : Housing Application Receipt";
				String errorLine5 = "Error       : " + confirmationError.toString();
				String errorLine6 = "";
				System.out.println(errorLine1);
				System.out.println(errorLine2);
				System.out.println(errorLine3);
				System.out.println(errorLine4);
				System.out.println(errorLine5);
				System.out.println(errorLine6);
				confirmationError.printStackTrace();
				StringBuilder errors = new StringBuilder();
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
				return false;
			}
		}
		return true;
	}
}


