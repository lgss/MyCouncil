package uk.gov.selfserve;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.lang.StringEscapeUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class GetSocialFeed extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res){
		
			String auditEmailTo = getServletContext().getInitParameter("auditEmailTo");
			String auditEmailBCC = getServletContext().getInitParameter("auditEmailBCC");
			String emailFrom = getServletContext().getInitParameter("emailFrom");
			String smtpHost = getServletContext().getInitParameter("smtpHost");
			String from = emailFrom;
			String[] emailTo = {auditEmailTo};
			String[] emailBCC = {auditEmailBCC};
			String subject= "Social Feed Error";
			String message = "There was an error with the social feed:<br>";

			String fileLocation = getServletContext().getInitParameter("social-feed-filelocation") + "socialFeed.xml";
			System.out.println(fileLocation);
			
			Properties outputProperties = new Properties();
		    outputProperties.put(javax.xml.transform.OutputKeys.METHOD, "xml");
		    outputProperties.put(javax.xml.transform.OutputKeys.INDENT, "yes");   
		    File fileOutput = new File(fileLocation);
		    
			String jsonFile = getServletContext().getRealPath("/data/feeds.json");
			String weeks = getServletContext().getInitParameter("social-feed-weeks");
			SocialFeed feed = new SocialFeed();
			List<SocialEntry> output = null;
			
			try {
				output = feed.getFeed(jsonFile, weeks);
				
				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
				Document doc = docBuilder.newDocument();
				Element rootElement = doc.createElement("socialfeed");
				doc.appendChild(rootElement);

				for(int x = 0; x < output.size(); x++){
					SocialEntry item = output.get(x);

					Element socialEntry = doc.createElement("socialentry");
					rootElement.appendChild(socialEntry);
					
					item.date = StripIllegalXMLChars(item.date);
					item.heading = StringEscapeUtils.unescapeXml(item.heading);
					item.typeDesc = StripIllegalXMLChars(item.typeDesc);
					//item.url = URLEncoder.encode(item.url,"UTF-8");
					
					Element date = doc.createElement("date");
					date.appendChild(doc.createTextNode(item.date));
					socialEntry.appendChild(date);
					
					Element type = doc.createElement("type");
					type.appendChild(doc.createTextNode(item.type));
					socialEntry.appendChild(type);
					
					Element typeDesc = doc.createElement("typedesc");
					typeDesc.appendChild(doc.createTextNode(item.typeDesc));
					socialEntry.appendChild(typeDesc);
					
					Element heading = doc.createElement("heading");
					heading.appendChild(doc.createTextNode(item.heading));
					socialEntry.appendChild(heading);
					
					Element url = doc.createElement("url");
					url.appendChild(doc.createTextNode(item.url));
					socialEntry.appendChild(url);
					

				}	
				
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				Result result = new StreamResult(fileOutput); 
				transformer.transform(source, result);

			} catch (IOException e) {
				message += e;
				SendMail email = new SendMail();
				try {
					email.postMail(emailTo, emailBCC, subject, message, from, smtpHost, true);
				} catch (MessagingException e1) {
					e.printStackTrace();
				}
			}catch(ParserConfigurationException e){
				message += e;
				SendMail email = new SendMail();
				try {
					email.postMail(emailTo, emailBCC, subject, message, from, smtpHost, true);
				} catch (MessagingException e1) {
					e.printStackTrace();
				}
			} catch (TransformerConfigurationException e) {
				message += e;
				SendMail email = new SendMail();
				try {
					email.postMail(emailTo, emailBCC, subject, message, from, smtpHost, true);
				} catch (MessagingException e1) {
					e.printStackTrace();
				}
			} catch (TransformerException e) {
				message += e;
				SendMail email = new SendMail();
				try {
					email.postMail(emailTo, emailBCC, subject, message, from, smtpHost, true);
				} catch (MessagingException e1) {
					e.printStackTrace();
				}
			}	
		}
	
    private String StripIllegalXMLChars(String text)
    {
    	Pattern pattern = Pattern.compile("\\W+ | \\s*");
  		Matcher m = pattern.matcher(text);
  		text = m.replaceAll(" ");   
  		return text;
    }
}

