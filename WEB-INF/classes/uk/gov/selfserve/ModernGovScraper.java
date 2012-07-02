package uk.gov.selfserve;

import java.util.Date;
import java.text.*;
import java.io.*;
import javax.servlet.http.*;

import java.util.Timer;
import java.util.TimerTask;

import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;

public class ModernGovScraper extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	Timer timer = new Timer();

	public void init()
	{
		DateFormat dbFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String todaysDate = dbFormat.format(new Date());
		System.out.println("*** ModernGovScraper started @ " + todaysDate);
		RunScraper scraper = new RunScraper();
		scraper.scrape();
	}
	
	public void destroy(){  
        timer.purge();
        timer.cancel();
	} 

 	public final class RunScraper extends TimerTask
	{
		private final long final_now = 0;
//		private final long final_minute = 1000 * 60;
//		private final long final_hour = 1000 * 60 * 60;
		private final long final_day = 1000 * 60 * 60 * 60;
		private String fileLock = "";
		private String modernGovURL = "";
		String useModernGovBaseURL = "";
		String modernGovBaseURL = "";

		public RunScraper()
		{
			super();
			modernGovURL = getServletConfig().getInitParameter("modernGovURL");
			useModernGovBaseURL = getServletConfig().getInitParameter("useModernGovBaseURL");
 		    if(useModernGovBaseURL.equals("true")){
			   modernGovBaseURL = getServletConfig().getInitParameter("modernGovBaseURL");
			}
		}

		public void scrape()
		{
			TimerTask runScraper = new RunScraper();
			
			timer.scheduleAtFixedRate(runScraper, final_now, final_day);
		}
		
		public void run()
		{
			synchronized (fileLock)
			{
			   FileWriter outputFile;
			   BufferedWriter outputFileBuffer;
			   try
			   {
				   outputFile = new FileWriter(getServletContext().getRealPath("/") + "meetings.json");
				   outputFileBuffer = new BufferedWriter(outputFile);
				   try
				   {
				       URL url = new URL(modernGovURL);
				       URLConnection connection = null;
				       InputStreamReader inStream = null;
				       BufferedReader buffer = null;
				       connection = url.openConnection();
				       inStream = new InputStreamReader(connection.getInputStream());
				       buffer = new BufferedReader(inStream);
				       outputFileBuffer.write("{\"meetings\" : [ ");
				       boolean endOfFile = false;
				       boolean firstEntry = true;
				       while (!endOfFile)
				       {
				           String webPageLine = buffer.readLine();
				           if (webPageLine == null)
				           {
				               endOfFile = true;
				           }
				           else
				           {
							   if(webPageLine.indexOf("mgCalendarWeekGrid")>-1)
							   {
		   					     webPageLine = buffer.readLine();
								 if (webPageLine.indexOf("<p>") > -1 && webPageLine.indexOf("</p>") > -1)
								 {
									 String meetingDate = webPageLine.substring(webPageLine.indexOf("<p>") + 3, webPageLine.indexOf("</p>"));
									 webPageLine = buffer.readLine();
			   					     webPageLine = buffer.readLine();
									 webPageLine = buffer.readLine();
									 webPageLine = buffer.readLine();
									 if (webPageLine.indexOf("<a  href") > -1 && webPageLine.indexOf("</a>") > -1)
									 {
										 if(!firstEntry)
										 {
											 outputFileBuffer.write(",");
											 outputFileBuffer.newLine();
										 }
											 else
										 {
											 firstEntry=false;
										 }
										 if(webPageLine.indexOf("<span")>50){
				   						     outputFileBuffer.write("{\"html\":\"" + 
				   						    		                "<a href='" +
				   						    		                modernGovBaseURL + 
				   						    		                webPageLine.substring(webPageLine.indexOf("<a  href") + 10, webPageLine.indexOf("amp;")) + 
			  	   						    		                webPageLine.substring(webPageLine.indexOf("amp;") + 4, webPageLine.indexOf("   title=")-1) +
			  	   						    		                "' target='_blank'>" +
			  	   						    		                meetingDate + " - " +
			  	   						    		                webPageLine.substring(webPageLine.indexOf("mgTimeTxt") + 12, webPageLine.indexOf("</span>",webPageLine.indexOf("mgTimeTxt"))) +
			  	   						    		                " : " +
			  	   						    		                webPageLine.substring(webPageLine.indexOf("</span>") + 7, webPageLine.indexOf("<span",webPageLine.indexOf("</span>"))) +
				   						    		                "</a>\"}");
										 }
										 else{
				   						     outputFileBuffer.write("{\"html\":\"" + 
	   						    		                "<a href='" +
	   						    		                modernGovBaseURL + 
	   						    		                webPageLine.substring(webPageLine.indexOf("<a  href") + 10, webPageLine.indexOf("amp;")) + 
	   						    		                webPageLine.substring(webPageLine.indexOf("amp;") + 4, webPageLine.indexOf("   title=")-1) +
	   						    		                "' target='_blank'>" +
	   						    		                meetingDate + " - " +
	   						    		                webPageLine.substring(webPageLine.indexOf("mgTimeTxt") + 12, webPageLine.indexOf("</span>",webPageLine.indexOf("mgTimeTxt"))) +
	   						    		                " : " +
	   						    		                webPageLine.substring(webPageLine.indexOf("'>")+2, webPageLine.indexOf("</a>")-1) +
	   						    		                "</a>\"}");	
				   						  }
									 }
								 }
							   }
				           }
				       }
				       outputFileBuffer.write("]}");
				   }
				   catch (MalformedURLException error)
				   {
					   System.out.println("Unable to read URL(1) : " + error.toString());
				   }
				   catch (IOException error)
				   {
					   System.out.println("Unable to read URL(2) : " + error.toString());
				   }
				   outputFileBuffer.close();
			   }
			   catch (IOException error)
			   {
				   System.out.println("Unable to create file : " + error);
			   }
			}
		}
	}	
}