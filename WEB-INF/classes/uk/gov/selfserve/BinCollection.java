package uk.gov.selfserve;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BinCollection {
	
	public String day; //day in plain text
	public int week; //round week
	public String type; //type of collection
	public String nextCollection; //date of next collection yyyyMMddhhmm
	public String address; //first line of the address
	
	
	public void getNextCollection(){
		
		Calendar now = Calendar.getInstance();
		now.setMinimalDaysInFirstWeek(4);
		SimpleDateFormat longDate = new SimpleDateFormat("yyyyMMddhhmm");
		try{
			
			this.nextCollection = getNextDate(this.day,now);
			
			Calendar nextCollection = Calendar.getInstance();
			nextCollection.setMinimalDaysInFirstWeek(4);
			
			Date next = longDate.parse(this.nextCollection);
			nextCollection.setTime(next);
			System.out.println("Week Number: " + nextCollection.get(Calendar.WEEK_OF_YEAR));
			if(nextCollection.get(Calendar.WEEK_OF_YEAR) % 2 == 0){
				//get collection type for even weeks
				this.type = getCollectionType(true, this.week);
			}
			//otherwise the week of the year is odd
			else{
				//get collection type for odd weeks
				this.type = getCollectionType(false, this.week);
			}			
		}catch(NumberFormatException e){
			System.out.println("Not a number.");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
	private String getCollectionType(boolean even, int binWeek){
		String collectionType = null;
		
		if(even){
			switch(binWeek){
				case 0: collectionType = "bags";
						break;
				case 1: collectionType = "brown";
						break;
				case 2: collectionType = "black";
						break;
			}		
		}else{
			switch(binWeek){
				case 0: collectionType = "bags";
						break;
				case 1: collectionType = "black";
						break;
				case 2: collectionType = "brown";
						break;
			}
		}
		
		return collectionType;
	}
	
	private String getNextDate(String day, Calendar now){
		//set constants
		SimpleDateFormat nextDateFormat = new SimpleDateFormat("yyyyMMdd");
		String[] days = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		
		//initialize variables
		String collectionDate = null;
		Date today = now.getTime();
		Date nextDate;
		int collectionDay = 0;
		int dayOfTheWeek = now.get(Calendar.DAY_OF_WEEK)-1;
		day = day.toUpperCase();
		
		//get collection day integer from array
		for(int x = 0; x < days.length; x++){
			if(days[x].compareToIgnoreCase(day) == 0){
				collectionDay = x;
			}
		}

		//if collection day is today
		if(collectionDay == dayOfTheWeek){
			collectionDate = nextDateFormat.format(today);
		}
		else{
			//loop through dates
			while(collectionDay != dayOfTheWeek){
				//move to the next day
				now.add(Calendar.DAY_OF_MONTH,1);
				//set day of the week to the next day
				dayOfTheWeek = now.get(Calendar.DAY_OF_WEEK)-1;
			}
			//found a match, create a date object for formatting
			nextDate = now.getTime();
			//format date object to string
			collectionDate = nextDateFormat.format(nextDate);
		}
		//add collection time to collection date
		if(collectionDate.length() == 8){
			collectionDate += "0630";
		}
		
		return collectionDate;
	}
	
}
