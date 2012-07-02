package uk.gov.selfserve;

import javax.mail.MessagingException;

import twitter4j.*;
import twitter4j.http.AccessToken;

public class TwitterEntry 
   {
   public void createTwitterEntry(String twitterMessage,
		                          String currentDate,
		                          String[] strErrorEmailTo,
		                          String[] strErrorEmailBCC,
		                          String emailFrom,
		                          String smtpHost,
	                              String consumerKey,
	                              String consumerSecret,
	                              String accessTokenKey,
	                              String accessTokenSecret) 
      {
	   TwitterFactory factory = new TwitterFactory();
       Twitter twitter = factory.getInstance();
	   twitter.setOAuthConsumer(consumerKey, consumerSecret);
	   AccessToken accessToken = new AccessToken(accessTokenKey, accessTokenSecret);
       twitter.setOAuthAccessToken(accessToken);
       try{
    	   twitter.updateStatus(twitterMessage);
		   }
       catch(TwitterException twitterError){    	   
		   String errorLine1 = "";
		   String errorLine2 = "TwitterEntry - Failed - Sending tweet";
		   String errorLine3 = "Date        : " + currentDate;
		   String errorLine4 = "TwitterError="+twitterError.toString();
		   String errorLine5 = "TwitterKey="+consumerKey;
		   String errorLine6 = "TwitterMessage="+twitterMessage;
		   String errorLine7 = "";
		   System.out.println(errorLine1);
		   System.out.println(errorLine2);
		   System.out.println(errorLine3);
		   System.out.println(errorLine4);
		   System.out.println(errorLine5);
		   System.out.println(errorLine6);
		   System.out.println(errorLine7);
		   String emailContents = errorLine1 + "<BR>" +
			 					  errorLine2 + "<BR>" +
								  errorLine3 + "<BR>" +
								  errorLine4 + "<BR>" +
								  errorLine5 + "<BR>" +
								  errorLine6 + "<BR>" +
								  errorLine7;
		   SendMail confirmationEmailError = new SendMail();
		   try
		   {
			  confirmationEmailError.postMail(strErrorEmailTo, strErrorEmailBCC, "MyCouncil has failed to send a tweet", emailContents, emailFrom, smtpHost, true);
		   }
		   catch (MessagingException emailError)
		   {
			  System.out.println("Email error : " + emailError.toString());
		   }
       }
      }
   }