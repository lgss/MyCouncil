package uk.gov.selfserve;

public class SocialEntry implements Comparable<SocialEntry> {
	
	//nbc or tweet
	String type = new String();
	//by NBC / by Leader of the Council / by Chief Executive
	String typeDesc = new String();
	//heading or tweet
	String heading = new String();
	//created date
	String date = "201112030000";
	//direct link
	String url = "http://www.northampton.gov.uk";
	
	@Override
	public int compareTo(SocialEntry o) {
		long first = Long.parseLong(this.date);
		long second = Long.parseLong(o.date);
		
		if(first == second){
			return 0;
		}
		else if(first < second){
			return 1;
		}			
		return -1;
	}
}
