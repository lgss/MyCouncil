package uk.gov.selfserve;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class SendEmail extends HttpServlet
{
	public void doPost(HttpServletRequest request,
					  HttpServletResponse response) 
                    throws ServletException, IOException
	{
		String emailVerification = getServletConfig().getInitParameter("emailVerification");
		String emailFrom = getServletConfig().getInitParameter("emailFrom");
		String auditEmailTo = getServletConfig().getInitParameter("auditEmailTo");
		String testRun = getServletConfig().getInitParameter("test");
		String testEmailAddress = getServletConfig().getInitParameter("testEmailAddress");
		String smtpHost = getServletConfig().getInitParameter("smtpHost");
		String eol = System.getProperty("line.separator");
		String contact=request.getParameter("contact");
		String sector = request.getParameter("sector");
		String message=request.getParameter("message");
		String messageType = request.getParameter("messageType");
		String emailTo = request.getParameter("emailTo");
		String subject = "MyCouncil : Message from citizen";
		String recipients[] = emailTo.split(",");
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
		emailContent += "Contact details of sender : " + contact + eol + eol;
		emailContent += "Message from sender       : " + message;
		for (int currentRecipient = 0; currentRecipient < recipients.length; currentRecipient++)
		{
			if (recipients[currentRecipient].indexOf(emailVerification) == -1)
			{
			PrintWriter output = response.getWriter();
			output.println("{\"message\":\"Apologies, but there was an error in the email address used. Please try again later.\"}");
			verified = false;
			}
		}
		String emailContentInternal = "Hello," + eol + eol + "A message was sent from the MyCouncil web page as below :" + eol + eol;
		emailContentInternal += "Recipient            : " + emailTo + eol + eol;
		emailContentInternal += "IP address of sender : " + request.getRemoteHost();

		if (verified)
		{
			try
			{
				boolean debug = false;
				Properties props = new Properties();
				props.put("mail.smtp.host", smtpHost);
				Session session = Session.getDefaultInstance(props, null);
				session.setDebug(debug);
				Message msg = new MimeMessage(session);
				InternetAddress addressFrom = new InternetAddress(emailFrom);
				msg.setFrom(addressFrom);
				InternetAddress[] addressTo = new InternetAddress[recipients.length];
				for (int currentRecipient = 0; currentRecipient < recipients.length; currentRecipient++)
				{
					if (testRun.equals("true"))
					{
						addressTo[currentRecipient] = new InternetAddress(testEmailAddress);
					}
					else
					{
						addressTo[currentRecipient] = new InternetAddress(recipients[currentRecipient]);
					}
				}
				msg.setRecipients(Message.RecipientType.TO, addressTo);
				msg.setSubject(subject);
				msg.setText(emailContent);
				Transport.send(msg);

				msg = new MimeMessage(session);
				addressFrom = new InternetAddress(emailFrom);
				msg.setFrom(addressFrom);
				addressTo = new InternetAddress[1];
				addressTo[0] = new InternetAddress(auditEmailTo);
				msg.setRecipients(Message.RecipientType.TO, addressTo);
				msg.setSubject(subject);
				msg.setText(emailContentInternal);
				Transport.send(msg);

				String name = "{\"message\":\"Your message has been sent.\"}";
				if (messageType.equals("3"))
				{
					name = "{\"message\":\"Thank you for your feedback, it has been successfully sent.\"}";
				}
				ajaxResponse.println(name);
			}
			catch (MessagingException error)
			{
				String name = "{\"message\":\"Apologies, but there was an error sending your message. Please try again later.\"}";
				System.out.println(error);
				ajaxResponse.println(name);
			}
		}

	}
}