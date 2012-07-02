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

import twitter4j.TwitterException;

import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.mail.*;


public class PostToSocial extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String useProxy = getServletConfig().getInitParameter("useproxy");
		Boolean proxy = Boolean.parseBoolean(useProxy);
		if(proxy){
			System.getProperties().put("http.proxyHost", "ascvbloxx");
			System.getProperties().put("http.proxyPort", "8080");
		}
		String bpmServer = getServletConfig().getInitParameter("bpmserverip");
		String localServer = getServletConfig().getInitParameter("localhostip");
		String ip = request.getRemoteAddr();
		
		String laganSystem = getServletContext().getInitParameter("laganSystem");
		String host = getServletContext().getInitParameter("host") + "/" + getServletContext().getServletContextName();
		String errorEmailTo = getServletContext().getInitParameter("errorEmailTo");
		String errorEmailBCC = getServletContext().getInitParameter("errorEmailBCC");
		String[] strErrorEmailTo = { errorEmailTo };
		String[] strErrorEmailBCC = new String[0];
		String emailFrom = getServletContext().getInitParameter("emailFrom");
		String smtpHost = getServletContext().getInitParameter("smtpHost");
		String twitterTESTConsumerKey = getServletContext().getInitParameter("twitter-TEST-Consumer-Key");
		String twitterTESTConsumerSecret = getServletContext().getInitParameter("twitter-TEST-Consumer-Secret");
		String twitterTESTAccessTokenKey = getServletContext().getInitParameter("twitter-TEST-Access-Token-Key");
		String twitterTESTAccessTokenSecret = getServletContext().getInitParameter("twitter-TEST-Access-Token-Secret");
		
		boolean sent = false;
		
		response.setContentType("text/html");
		PrintWriter output = response.getWriter();
		
		if(ip.compareToIgnoreCase(localServer) == 0 | ip.compareToIgnoreCase(bpmServer) == 0){
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			String currentDate = dateFormat.format(date);
		
			String twitterMessage = request.getParameter("message");
			TwitterEntry tweet = new TwitterEntry();
			tweet.createTwitterEntry(twitterMessage, currentDate, strErrorEmailTo, strErrorEmailBCC, emailFrom, smtpHost, twitterTESTConsumerKey, twitterTESTConsumerSecret, twitterTESTAccessTokenKey, twitterTESTAccessTokenSecret);
			sent = true;
		}else{
				output.println("Error sending tweet | Tweet from IP "+ip+" failed.");
		}
		output.print(sent);
	}
}
