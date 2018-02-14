package com.ualbany.hw1.problem3;



public class Person {
	private Address myAddress;
	private CheckingBankAccount myAccount;
	private String firstName;
	private String lastName;
	
	//this Constructor instantiates a person with a name, and account with 0. 
	public Person(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
		this.myAccount = new CheckingBankAccount();}
	
	
	public String getFullName() {
		return firstName + " "+ lastName; }
	public String getFullAddress() {
		return myAddress.getFullAddress();}
	
//	############ GETTERS AND SETTERS ###################################
	public CheckingBankAccount getMyAccount() {
		return myAccount;}
	public String getFirstName() {
		return firstName;}
	public String getLastName() {
		return lastName;}
	
	public void setAddress(Address address) {
		myAddress = address;}
	public void setMyAccount(CheckingBankAccount myAccount) {
		this.myAccount = myAccount;	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;}
	public void setLastName(String lastName) {
		this.lastName = lastName;}
	
//	###################### END OF GETTERS AND SETTERS ############################################
	
	
	}//end of class
