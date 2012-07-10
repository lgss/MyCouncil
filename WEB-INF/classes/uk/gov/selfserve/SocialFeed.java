package uk.gov.selfserve;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class SocialFeed {
	
	SimpleDateFormat twitterDate = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
	SimpleDateFormat outputDate = new SimpleDateFormat("yyyyMMddHHmm");
	SimpleDateFormat tweetsSince = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat nbcFeedDate = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
	Pattern pattern = Pattern.compile("((https?|ftp|gopher|telnet|file|notes|ms-help):((//)|(\\\\\\\\))+[\\w\\d:#@%/;$()~_?\\+-=\\\\\\.&]*)");
	
	public List<SocialEntry> getFeed(String jsonFile, String dateLimitStr) throws IOException{
		List<SocialEntry> elements = new ArrayList<SocialEntry>();
		JSONArray feeds = null;
		boolean replyFeed = false;
		//System.getProperties().put("http.proxyHost", "ascvbloxx");
		//System.getProperties().put("http.proxyPort", "8080");
		//set the date x weeks ago
		int dateLimitInt = Integer.parseInt(dateLimitStr);
		Calendar sinceCal = Calendar.getInstance();
		sinceCal.add(Calendar.WEEK_OF_YEAR, dateLimitInt * -1);
		
		
		//retrieve the feeds
		String feedList = jsonFile;	
		StringBuilder fileOutput = new StringBuilder();
		String line;
		File file = new File(feedList);
		BufferedReader reader;
		reader = new BufferedReader(new FileReader(file));
		
		
		while((line = reader.readLine()) != null){
			fileOutput.append(line);
		}
		
		reader.close();
			
			try {
				feeds = new JSONObject(fileOutput.toString()).getJSONArray("feeds");
				
				for(int x = 0; x < feeds.length(); x++){
					JSONObject feed = feeds.getJSONObject(x);
					String name = feed.getString("name");
					String format = feed.getString("format");
					String url = feed.getString("url");
					try{
						replyFeed = feed.getBoolean("replies");
					}catch(JSONException e){
						//System.out.println("not replies");
					}

					if(format.compareToIgnoreCase("json") == 0){
						if(replyFeed){
							Calendar yesterdayCal = Calendar.getInstance();
							yesterdayCal.add(Calendar.DAY_OF_YEAR,- 1);
							String yesterdayStr = tweetsSince.format(yesterdayCal.getTime());	
							//System.out.println("Replies Since string: "+yesterdayStr);
							url += "%20since:"+yesterdayStr;
						}else{
							String sinceStr = tweetsSince.format(sinceCal.getTime());
							//System.out.println("Since string: "+sinceStr);
							url += "%20since:"+sinceStr;
						}
						try {
							getTwitterFeed(url,elements);
						} catch (ParseException e) {
							e.printStackTrace();
						}
					}
					else if(format.compareToIgnoreCase("xml") == 0){
							if(name.compareToIgnoreCase("nbc") == 0){
								getNBCFeed(url,elements,sinceCal);
							}
						
					}
					else{
						//do nothing?!
					}

					
				}
				//System.out.println(feeds);
				
				} catch (JSONException e) {
					e.printStackTrace();
				}
				
			//sort into time order
			Collections.sort(elements);
			
			//remove duplicates
			for(int n = 0; n  < elements.size(); n++){
				String currentItem = elements.get(n).heading;
				String currentType = elements.get(n).typeDesc;
				for(int m = 0; m < elements.size(); m++){
					if(currentItem.equalsIgnoreCase(elements.get(m).heading) && !currentType.equalsIgnoreCase(elements.get(m).typeDesc)){
						if(!elements.get(m).typeDesc.equalsIgnoreCase("by nbc")){
							elements.remove(m);
						}
					}
				}
			}
			return elements;		
	}
	
	public void getTwitterFeed(String url, List<SocialEntry> elements) throws JSONException, ParseException, IOException{
		
		String content = getUrlContent(url);
		
		//get twitter results
		JSONArray contentJson = new JSONObject(content).getJSONArray("results");
		for(int y = 0; y < contentJson.length(); y++){
			JSONObject tweet = contentJson.getJSONObject(y);
			String typeDesc = tweet.getString("from_user");
			String heading = tweet.getString("text");			
			
			String tweetUrl = twitterStatusUrl(typeDesc,tweet.getString("id_str"));
			String createdAt = tweet.getString("created_at");
			Date createdDate = twitterDate.parse(createdAt);						
			String date = outputDate.format(createdDate);
			
			Matcher matches = pattern.matcher(heading);
			heading = matches.replaceAll("");
			
			SocialEntry item = new SocialEntry();
			item.date = date;
			item.heading = heading.trim();
			item.type = "tweet";
			item.typeDesc = typeDesc;
			item.url = tweetUrl;
			elements.add(item);
		}
	}
	
	public void getNBCFeed(String url, List<SocialEntry> elements, Calendar since)throws IOException{

		InputStream is = new URL(url).openStream();
		DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		domFactory.setNamespaceAware(true);		
		DocumentBuilder builder;
		try {
			
			builder = domFactory.newDocumentBuilder();
			Document doc = builder.parse(is);
			XPathFactory factory = XPathFactory.newInstance();
			XPath xpath = factory.newXPath();
			XPathExpression expr = xpath.compile("//item");
			Object result = expr.evaluate(doc, XPathConstants.NODESET);
			NodeList nodes = (NodeList)result;
			
			for(int x = 0; x < nodes.getLength(); x++){
				NodeList item = nodes.item(x).getChildNodes();
				SocialEntry socialentry = new SocialEntry();
				socialentry.typeDesc = "by NBC";
				socialentry.type = "nbc";
				for(int y = 0; y < item.getLength(); y++){
					if(item.item(y).getLocalName() == "title"){
						String nbcTypeDesc = item.item(y).getTextContent();
						socialentry.heading = nbcTypeDesc.trim();
					}
					else if(item.item(y).getLocalName() == "link"){
						String nbcUrl = item.item(y).getTextContent();
						socialentry.url = nbcUrl;
					}
					else if(item.item(y).getLocalName() == "pubDate"){
						String nbcDateStr = item.item(y).getTextContent();
						Date nbcDate = nbcFeedDate.parse(nbcDateStr);
						nbcDateStr = outputDate.format(nbcDate);
						socialentry.date = nbcDateStr;
					}
					
				}
				//current date
				Date objDate = outputDate.parse(socialentry.date);
				//current date as calendar
				Calendar objCal = Calendar.getInstance();
				objCal.setTime(objDate);
				//if the current date is before the limit date, add it to the array
				if(since.before(objCal)){
					elements.add(socialentry);
				}
				
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	public String getUrlContent(String url) throws IOException{
		
		String content = null;
		InputStream feedResponse = null;
		
		try{
			URL feedSource = new URL(url);
			URLConnection conn = feedSource.openConnection();
		
			feedResponse = conn.getInputStream();
			content = IOUtils.toString(feedResponse);
		}finally{
			feedResponse.close();
		}
		return content;
	}
	public String twitterStatusUrl(String user, String tweetId){
		
		StringBuilder url = new StringBuilder();
		url.append("http://twitter.com/#!/");
		url.append(user);
		url.append("/status/");
		url.append(tweetId);
		
		return url.toString();
	}	
}

