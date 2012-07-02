package uk.gov.selfserve;

import java.net.*;
import java.io.*;
import com.google.gson.Gson;

public class URLShortener 
   {
   public String shortenURL(String mycouncilURL,String apiKey) 
      {
	   String shortenedURL="";
	   try{ 
		   String data = "{\"longUrl\": \"" + mycouncilURL + "\"}";
		   URL url = new URL("https://www.googleapis.com/urlshortener/v1/url?key="+apiKey); 
		   URLConnection conn = url.openConnection(); 
		   conn.setRequestProperty("CONTENT-TYPE", "application/json");
		   conn.setDoOutput(true); 
		   OutputStreamWriter urlWriter = new OutputStreamWriter(conn.getOutputStream()); 
		   urlWriter.write(data); 
		   urlWriter.flush(); 		   
		   BufferedReader urlReader = new BufferedReader(new InputStreamReader(conn.getInputStream())); 		  
		   String str; 
		   String result = ""; 		   
		   while ((str = urlReader.readLine()) != null) { 
			   result += str + "\r\n";
			   } 
		   urlWriter.close(); 
		   urlReader.close(); 
		   Gson gson = new Gson();
		   jsonData returnedData = gson.fromJson(result, jsonData.class);
		   shortenedURL=returnedData.getShortUrl();
		   } 
	   catch (MalformedURLException e) {  
	   } catch (IOException e) {
		   System.out.println(e);
	   }
	   return shortenedURL;
       }
   }

final class jsonData{
	private String kind="";
	private String id="";
	private String longUrl="";
	
	public String getShortUrl(){
		return this.id;
	}
}