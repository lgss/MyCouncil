package uk.gov.selfserve;

import java.io.*;
import lagan.api.auth.*;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;
import org.apache.axis.client.Stub;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.mail.*;

public class LaganLogIn
{
	public static LogIn logIn(String laganSystem, String wsddLocation, String[] strErrorEmailTo, String[] strErrorEmailBCC, String emailFrom, String smtpHost)
	{
		LogIn objLogIn = new LogIn();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String currentDate = dateFormat.format(date);
  	    EngineConfiguration config = new FileProvider(wsddLocation);
		objLogIn.setConfig(config);
		PWCallback pwCallback = new PWCallback();
		lagan.api.auth.FLAuthService authService = new lagan.api.auth.FLAuthServiceLocator(config);
		org.apache.axis.client.Stub authStub = null;
		try
		{
		  lagan.api.auth.FLAuthWebInterface authInterface = authService.getFLAuth();
		  authInterface.authenticate();
		  authStub = (Stub)authInterface;
		  objLogIn.setStub(authStub);
		  objLogIn.setSuccess(true);
		}
		catch (Exception authenticationError)
		{
		  String errorLine1 = "";
		  String errorLine2 = "LaganLogIn Failed - Authenticating to Lagan";
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
	return objLogIn; 
	}
}