package com.ualbany.hw1.problem3;

import java.util.EventObject;
//We extend Event Object to get the the source of whatever triggered the event
public class FormEvent extends EventObject{
	//Instance variables should be the ones you want to transmit
	private String transactionType;
	private String amount;
	
	
	public FormEvent(Object source) {
		super(source);	
	}
	
	public FormEvent(Object source, String transactionType, String amount) {
		super(source);
		this.transactionType = transactionType;
		this.amount = amount;
		
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	

	
	
}
