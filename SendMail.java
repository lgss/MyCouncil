package uk.gov.selfserve;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class SendMail
{
	public void postMail(String recipients[ ], String subject, String message, String from, String smtpHost, boolean html) throws MessagingException
	{
		Properties props = new Properties();
		String messageType="text/html";
		if (!html)
		{
			messageType = "text/plain";
		}
		props.put("mail.smtp.host", smtpHost);
		Session session = Session.getDefaultInstance(props, null);
		Message msg = new MimeMessage(session);
		InternetAddress addressFrom = new InternetAddress(from);
		msg.setFrom(addressFrom);
		InternetAddress[] addressTo = new InternetAddress[recipients.length];
		for (int i = 0; i < recipients.length; i++)
		{
			addressTo[i] = new InternetAddress(recipients[i]);
		}
		msg.setRecipients(Message.RecipientType.TO, addressTo);
		msg.setSubject(subject);
		msg.setContent(message, messageType);
		Transport.send(msg);
	}
}