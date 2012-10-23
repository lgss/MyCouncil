package uk.gov.selfserve;

public class PollStation{
	
	private String type;
	private String name;
	private String address;
	private String fullAddress;
	private String district;
	
	public PollStation(){
		//empty constructor for ease of use.
	}
	public PollStation(String type, String name, String address, String district){
		this.type = type;
		this.name = name;
		this.address = address;
		this.district = district;
		this.fullAddress = name.trim() + ", " + address.trim();
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		if(this.address != null){
			this.fullAddress = this.name.trim() + ", " + this.address.trim();
		}
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
		if(this.name != null){
			this.fullAddress = this.name.trim() + ", " + this.address.trim();
		}
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	@Override
	public String toString(){
		return this.fullAddress;
	}
	
	
	
}
