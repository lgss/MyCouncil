package uk.gov.selfserve;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Bulky implements Comparable<Bulky>{
	
	public Date collectionDate;
	public int collectionCount = 0;	
	private SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
	
	public String getLaganDate(){
		return sdf.format(collectionDate);
	}

	
	public int compareTo(Bulky bulky) {
		final int BEFORE = -1;
	    final int EQUAL = 0;
	    final int AFTER = 1;
		
	    if(this == bulky)return EQUAL;
		if(this.collectionDate.before(bulky.collectionDate)){
			return BEFORE;
		}
		if(this.collectionDate.after(bulky.collectionDate)){
			return AFTER;
		}
		return EQUAL;
	}
	
	public String getDay(){
		String dayOfTheWeek = "";
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		Calendar cal = Calendar.getInstance();
		cal.setTime(this.collectionDate);
		dayOfTheWeek = days[(cal.get(Calendar.DAY_OF_WEEK)-1)];
		return dayOfTheWeek;
	}
	
	public String getReadableDate(){
		if(this.collectionDate != null){
			Calendar cal = Calendar.getInstance();
			cal.setTime(this.collectionDate);
			SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
			return sd.format(cal.getTime());
		}
		return null;
	}
}
