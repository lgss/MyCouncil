package uk.gov.selfserve;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class SendMail
{
	public void postMail(String emailTo[], String emailBCC[], String subject, String message, String from, String smtpHost, boolean html) throws MessagingException
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
		InternetAddress[] addressTo = new InternetAddress[emailTo.length];
		for (int currentEmail = 0; currentEmail < emailTo.length; currentEmail++)
		{
			addressTo[currentEmail] = new InternetAddress(emailTo[currentEmail]);
		}
		msg.setRecipients(Message.RecipientType.TO, addressTo);
		InternetAddress[] addressBCC = new InternetAddress[emailBCC.length];
		for (int currentEmail = 0; currentEmail < emailBCC.length; currentEmail++)
		{
			addressBCC[currentEmail] = new InternetAddress(emailBCC[currentEmail]);
		}
		msg.setRecipients(Message.RecipientType.BCC, addressBCC);
		msg.setSubject(subject);
		msg.setContent(message, messageType);
		Transport.send(msg);
	}
}