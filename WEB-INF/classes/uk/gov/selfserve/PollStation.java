package uk.gov.selfserve;

import uk.me.jstott.jcoord.LatLng;
import uk.me.jstott.jcoord.OSRef;

public class PollStation{
	
	private String type;
	private String name;
	private String address;
	private String fullAddress;
	private String district;
	private double easting;
	private double northing;
	private double lat;
	private double lng;
	private LatLng latLng;
	
	public double getEasting() {
		return easting;
	}
	public void setEasting(double easting) {
		this.easting = easting;
		if(this.easting > 0 && this.northing > 0){
			OSRef os = new OSRef(this.easting,this.northing);
			LatLng ll = os.toLatLng();
			ll.toWGS84();
			this.setLatLng(ll);
			this.setLat(ll.getLat());
			this.setLng(ll.getLng());
		}
	}
	public double getNorthing() {
		return northing;
	}
	public void setNorthing(double northing) {
		this.northing = northing;
		if(this.easting > 0 && this.northing > 0){
			OSRef os = new OSRef(this.easting,this.northing);
			LatLng ll = os.toLatLng();
			ll.toWGS84();
			this.setLatLng(ll);
			this.setLat(ll.getLat());
			this.setLng(ll.getLng());
		}
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double d) {
		this.lat = d;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double d) {
		this.lng = d;
	}
	public LatLng getLatLng() {
		return latLng;
	}
	public void setLatLng(LatLng latLng) {
		this.latLng = latLng;
	}
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
