package uk.gov.selfserve;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class SendMessage extends HttpServlet
{
	public void doPost(HttpServletRequest request,
					  HttpServletResponse response) 
                    throws ServletException, IOException
	{
		String smtpHost = getServletContext().getInitParameter("smtpHost");
		String auditEmailTo = getServletContext().getInitParameter("auditEmailTo");
		String emailVerification = getServletConfig().getInitParameter("emailVerification");
		String emailFrom = getServletConfig().getInitParameter("emailFrom");
		String testRun = getServletConfig().getInitParameter("test");
		String testEmailAddress = getServletConfig().getInitParameter("testEmailAddress");
		String eol = System.getProperty("line.separator");
		String contact=request.getParameter("contact");
		String sector = request.getParameter("sector");
		String message=request.getParameter("message");
		String messageType = request.getParameter("messageType");
		String emailTo = request.getParameter("emailTo");
		String subject = "MyCouncil : Message from citizen";
		String recipients[] = emailTo.split(",");
		String strErrorEmailBCC[] = new String[0];
		String auditRecipients[] = {auditEmailTo};
		String greeting = "";
		boolean verified = true;
		PrintWriter ajaxResponse = response.getWriter();

		if (messageType.equals("1"))
		{
			greeting = "Councillor";
			if (recipients.length > 1)
			{
				greeting += "s";
			}
		}
		if (messageType.equals("2"))
		{
			greeting = "Coordinators";
			subject += " (FAO " + sector + " Sector)";
		}
		if (messageType.equals("3"))
		{
			greeting = "Hello";
			subject = "MyCouncil : Feedback";
		}
		String emailContent = greeting + "," + eol + eol + "You have received the message below from a citizen via the MyCouncil web page." + eol + eol;
		if (messageType.equals("3"))
		{
			emailContent = greeting + "," + eol + eol + "You have received the feedback below from the MyCouncil web page." + eol + eol;
		}
		if(contact.equals("")){
			emailContent += "Contact details of sender : Anonymous" + eol + eol;
		}else{
			emailContent += "Contact details of sender : " + contact + eol + eol;
			emailFrom = contact;
		}
		emailContent += "Message from sender       : " + message;
		for (int currentRecipient = 0; currentRecipient < recipients.length; currentRecipient++)
		{
			if (recipients[currentRecipient].indexOf(emailVerification) == -1)
			{
			PrintWriter output = response.getWriter();
			ajaxResponse.println("{\"message\":\"Apologies, but there was an error in the email address used. Please try again later.\"}");
			verified = false;
			}
		}
		String emailContentInternal = "Hello," + eol + eol + "A message was sent from the MyCouncil web page as below :" + eol + eol;
		emailContentInternal += "Recipient            : " + emailTo + eol + eol;
		emailContentInternal += "IP address of sender : " + request.getRemoteHost();

		if (verified)
		{
			if (testRun.equals("true"))
				{
			    for (int currentRecipient = 0; currentRecipient < recipients.length; currentRecipient++)
			    {
					recipients[currentRecipient] = testEmailAddress;
				}
			}
			SendMail messageEmail = new SendMail();
			try
			{
				messageEmail.postMail(recipients, strErrorEmailBCC, subject, emailContent, emailFrom, smtpHost, false);
			}
			catch (MessagingException emailError)
			{
				System.out.println(emailError);
				ajaxResponse.print("{\"message\":\"Apologies, but there was an error sending your message. Please try again later.\"}");
			}
			SendMail auditMessageEmail = new SendMail();
			try
			{
				auditMessageEmail.postMail(auditRecipients, strErrorEmailBCC, subject, emailContentInternal, emailFrom, smtpHost, false);
			}
			catch (MessagingException emailError)
			{
				System.out.println(emailError);
				ajaxResponse.print("{\"message\":\"Apologies, but there was an error sending your message. Please try again later.\"}");
			}
			String messageText = "{\"message\":\"Your message has been sent.\"}";
			if (messageType.equals("3"))
			{
				messageText = "{\"message\":\"Thank you for your feedback, it has been successfully sent.\"}";
			}
			ajaxResponse.print(messageText);
		}
	}
}