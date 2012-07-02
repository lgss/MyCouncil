package uk.gov.selfserve;

public class LocationDetails 
   {
	private static final long serialVersionUID = 1L;
	private boolean success;
	private String postcode;
	private String ward;
	private String sector;
	private String northing;
	private String easting;
	private String sectorHashtag;
	private String sectorConsumerKey;
	private String sectorConsumerSecret;
	private String sectorAccessTokenKey;
	private String sectorAccessTokenSecret;
	private String wardHashtag;
	private String wardConsumerKey;
	private String wardConsumerSecret;
	private String wardAccessTokenKey;
	private String wardAccessTokenSecret;
	
	private Integer[] classificationCodes;
	private String[] problemDescriptions;
	private String[] problemEmailDescriptions;
	
	public void setSuccess(boolean success) 
	{
		this.success=success;
	}
	public void setPostcode(String postcode) 
	{
		this.postcode=postcode;
	}
	public void setWard(String ward) 
	{
		this.ward=ward;
	}
	public void setSector(String sector) 
	{
		this.sector=sector;
	}
	public void setNorthing(String northing) 
	{
		this.northing=northing;
	}
	public void setEasting(String easting) 
	{
		this.easting=easting;
	}
	public void setSectorHashtag(String sectorHashtag)
	{
		this.sectorHashtag=sectorHashtag;
	}
	public void setSectorConsumerKey(String sectorConsumerKey)
	{
		this.sectorConsumerKey=sectorConsumerKey;
	}
	public void setSectorConsumerSecret(String sectorConsumerSecret)
	{
		this.sectorConsumerSecret=sectorConsumerSecret;
	}
	public void setSectorAccessTokenKey(String sectorAccessTokenKey)
	{
		this.sectorAccessTokenKey=sectorAccessTokenKey;
	}
	public void setSectorAccessTokenSecret(String sectorAccessTokenSecret)
	{
		this.sectorAccessTokenSecret=sectorAccessTokenSecret;
	}
	public void setWardHashtag(String wardHashtag)
	{
		this.wardHashtag=wardHashtag;
	}
	public void setWardConsumerKey(String wardConsumerKey)
	{
		this.wardConsumerKey=wardConsumerKey;
	}
	public void setWardConsumerSecret(String wardConsumerSecret)
	{
		this.wardConsumerSecret=wardConsumerSecret;
	}
	public void setWardAccessTokenKey(String wardAccessTokenKey)
	{
		this.wardAccessTokenKey=wardAccessTokenKey;
	}
	public void setWardAccessTokenSecret(String wardAccessTokenSecret)
	{
		this.wardAccessTokenSecret=wardAccessTokenSecret;
	}
	public void setClassificationCodes(Integer[] classificationCodes)
	{
		this.classificationCodes=classificationCodes;
	}
	public void setProblemDescriptions(String[] problemDescriptions)
	{
		this.problemDescriptions=problemDescriptions;
	}
	public void setProblemEmailDescriptions(String[] problemEmailDescriptions)
	{
		this.problemEmailDescriptions=problemEmailDescriptions;
	}
	public boolean getSuccess()
	{
		return success;
	}
	public String getPostcode()
	{
		return postcode;
	}
	public String getWard()
	{
		return ward;
	}
	public String getSector()
	{
	    return sector;	
	}
	public String getNorthing()
	{
	    return northing;	
	}
	public String getEasting()
	{
	    return easting;	
	}
	public String getWardHashtag()
	{
		return wardHashtag;
	}
	public String getWardConsumerKey()
	{
		return wardConsumerKey;
	}
	public String getWardConsumerSecret()
	{
		return wardConsumerSecret;
	}
	public String getWardAccessTokenKey()
	{
		return wardAccessTokenKey;
	}
	public String getWardAccessTokenSecret()
	{
		return wardAccessTokenSecret;
	}
	public String getSectorHashtag()
	{
		return sectorHashtag;
	}
	public String getSectorConsumerKey()
	{
		return sectorConsumerKey;
	}
	public String getSectorConsumerSecret()
	{
		return sectorConsumerSecret;
	}
	public String getSectorAccessTokenKey()
	{
		return sectorAccessTokenKey;
	}
	public String getSectorAccessTokenSecret()
	{
		return sectorAccessTokenSecret;
	}
	public Integer[] getClassificationCodes()
	{
	    return classificationCodes;	
	}
	public String[] getProblemDescriptions()
	{
		return problemDescriptions;
	}
	public String[] getProblemEmailDescriptions()
	{
		return problemEmailDescriptions;
	}
	public void debug(){
		System.out.println("");
		System.out.println("Contents of Location Details :");
		System.out.println("success="+success);
		System.out.println("postcode="+postcode);
		System.out.println("ward="+ward);
		System.out.println("sector="+sector);
		System.out.println("northing="+northing);
		System.out.println("easting="+easting);
		System.out.println("sectorHashtag="+sectorHashtag);
		System.out.println("sectorConsumerKey="+sectorConsumerKey);
		System.out.println("sectorConsumerSecret="+sectorConsumerSecret);
		System.out.println("sectorAccessTokenKey="+sectorAccessTokenKey);
		System.out.println("sectorAccessTokenSecret="+sectorAccessTokenSecret);
		System.out.println("wardHashtag="+wardHashtag);
		System.out.println("wardConsumerKey="+wardConsumerKey);
		System.out.println("wardConsumerSecret="+wardConsumerSecret);
		System.out.println("wardAccessTokenKey="+wardAccessTokenKey);
		System.out.println("wardAccessTokenSecret="+wardAccessTokenSecret);	
		for(int currentCode=1;currentCode<classificationCodes.length;currentCode++){
			System.out.println("classificationCode["+currentCode+"]="+classificationCodes[currentCode]);
		}
		for(int currentDescription=1;currentDescription<classificationCodes.length;currentDescription++){
			System.out.println("problemDescription["+currentDescription+"]="+problemDescriptions[currentDescription]);
		}
		for(int currentEmailDescription=1;currentEmailDescription<classificationCodes.length;currentEmailDescription++){
			System.out.println("problemEmailDescription["+currentEmailDescription+"]="+problemEmailDescriptions[currentEmailDescription]);
		}
		
	}
}