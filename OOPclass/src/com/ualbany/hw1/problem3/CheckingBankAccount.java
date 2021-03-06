package com.ualbany.hw1.problem3;

import java.math.BigDecimal;
import java.math.RoundingMode;


import javax.swing.JOptionPane;

public class CheckingBankAccount {
	private double balance;
	
	public CheckingBankAccount() {
		this.balance = 0;}
	
	public CheckingBankAccount(double b) {
		this.balance = b;}
	
	public void setBalance(double b) {
		this.balance = b;}
	
	public void setBalanceWithString(String b) {
		if(validDouble(b)) {
			this.balance = Double.parseDouble(b);}
		else {
			JOptionPane.showMessageDialog(null, "Invalid Amount. Balance set to 0.");
			this.balance = 0;}
	}
	
	public double getBalance() {
		return this.balance;}
	
	public String getBalanceAsString() {
		return Double.toString(balance);
	}
	
	//Uses BigDecimal Class to prevent decimal arithmetic problem
	public void withdraw(String input) {
		if(validDouble(input)) {
			BigDecimal num = new BigDecimal(input);
			num = num.setScale(2, RoundingMode.HALF_UP);
			BigDecimal bal = new BigDecimal(String.valueOf(balance));
			this.balance = bal.subtract(num).doubleValue();}
		else
			return;}
	
	public void deposit(String input) {
		if(validDouble(input)) {
			BigDecimal num = new BigDecimal(input);
			num = num.setScale(2, RoundingMode.HALF_UP);
			BigDecimal bal = new BigDecimal(String.valueOf(balance));
			this.balance = bal.add(num).doubleValue();}
		else
			return;}
	
	//checks if the number is negative; the arg will have to be formatted
	private boolean validDouble(String r) {
		String temp = new String(r);
		try {
			Double.parseDouble(temp);
			return true;}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Enter a valid amount.");
			return false;}}
	
}
