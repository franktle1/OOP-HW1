package com.ualbany.hw1.problem3;

public class Address {
	private String addressLine1;
	private String addressLine2;
	private String cityName;
	private String stateName;
	private String zipCode;
	
	public Address(String al1, String al2, String cn, String sn, String zc) {
		this.addressLine1 = al1;
		this.addressLine2 = al2;
		this.cityName = cn;
		this.stateName = sn;
		this.zipCode = zc;}
	
	//Constructor, in case there is no line 2 for address
	public Address(String al1, String cn, String sn, String zc) {
		this(al1, "", cn, sn, zc);}
	
	public String getFullAddress() {
		if(addressLine2.compareTo("")==0) 
			return "\n"+addressLine1 +"\n"+ cityName + "\n" +stateName +"\n"+ zipCode;
		return addressLine1 +"\n"+addressLine2 +"\n"+ cityName + "\n" +stateName +"\n" + zipCode;}
	
//	GETTERS AND SETTERS FOR VARIABLES
	public void setAddressLine1(String str) {
		this.addressLine1 = str;}
	public void setAddressLine2(String str) {
		this.addressLine2 = str;}
	public void setCity(String str) {
		this.cityName = str;}
	public void setZip(String str) {
		this.zipCode = str;}
	public String getAddressLine1() {
		return this.addressLine1;}
	public String getAddressLine2() {
		return this.addressLine2;}
	public String getCity() {
		return this.cityName;}
	public String getZip() {
		return this.zipCode;}
	public String getStateName() {
		return stateName;}
	public void setStateName(String stateName) {
		this.stateName = stateName;}
	
	
	
}
