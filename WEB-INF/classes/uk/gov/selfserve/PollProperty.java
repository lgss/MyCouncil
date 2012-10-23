package uk.gov.selfserve;

public class PollProperty implements Comparable<PollProperty>{
	
	public String uprn;
	public int easting;
	public int northing;
	public String propName;
	public String propNumber;
	private int propNumberInt;
	public String fullAddress;
	public String district;
	public String ward;
	
	public PollProperty(){
		//empty constructor for ease of use.
	}
	public PollProperty(String uprn, int easting, int northing, 
			String propName, String propNumber, String fullAddress, String district){
		this.uprn = uprn;
		this.easting = easting;
		this.northing = northing;
		this.propName = propName;
		this.propNumber = propNumber;
		this.fullAddress = fullAddress;
		this.district = district;
		try{
			if(propNumber != null){
				propNumber = propNumber.replaceAll("[a-zA-Z]", "");
				//if the address spans multiple property numbers, use only the first part
				if(propNumber.contains(" ")){
					propNumber = propNumber.substring(0,3).trim();
				}
				this.propNumberInt = Integer.parseInt(propNumber);
			}
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		
	}
	
	public String getUprn() {
		return uprn;
	}
	public void setUprn(String uprn) {
		this.uprn = uprn;
	}
	public double getEasting() {
		return easting;
	}
	public void setEasting(int easting) {
		this.easting = easting;
	}
	public double getNorthing() {
		return northing;
	}
	public void setNorthing(int northing) {
		this.northing = northing;
	}
	public String getPropName() {
		return propName;
	}
	public void setPropName(String propName) {
		this.propName = propName;
	}
	public String getPropNumber() {
		return propNumber;
	}
	public void setPropNumber(String propNumber) {
		this.propNumber = propNumber;
		try{
			if(propNumber != null){
				propNumber = propNumber.replaceAll("[a-zA-Z]", "");
				//if the address spans multiple property numbers, use only the first part
				if(propNumber.contains(" ")){
					propNumber = propNumber.substring(0,3).trim();
				}
				this.propNumberInt = Integer.parseInt(propNumber);
			}
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public int getPropNumberInt() {
		return propNumberInt;
	}
	
	@Override
	public int compareTo(PollProperty p) {
		final int LOWER = -1;
	    final int EQUAL = 0;
	    final int HIGHER = 1;
	    
	    if (this == p) return EQUAL;
	    if (this.propNumberInt > p.propNumberInt) return LOWER;
	    if (this.propNumberInt < p.propNumberInt) return HIGHER;
	    
		return 0;
	}
	
	@Override
	public String toString(){
		String out = "";
		out += this.uprn;
		out += " / ";
		out += this.fullAddress;
		out += " / ";
		out += this.easting;
		out += " / ";
		out += this.northing;
		return out;
		
	}
	
	
	
}
