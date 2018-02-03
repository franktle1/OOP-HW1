package com.ualbany.hw1.problem3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CheckingBankAccount {
	private double balance;
	
	public CheckingBankAccount() {
		this.balance = 0;
	}
	public CheckingBankAccount(double b) {
		this.balance = b;
	}
	
	public void setBalance(double b) {
		this.balance = b;
	}
	
	public double getBalance() {
		return this.balance;}
	
	public void withdraw(String input) {
		if(validDouble(input)) {
			BigDecimal num = new BigDecimal(input);
			num = num.setScale(2, RoundingMode.HALF_UP);
			BigDecimal bal = new BigDecimal(String.valueOf(balance));
			this.balance = bal.subtract(num).doubleValue();}
		else
			JOptionPane.showMessageDialog(null, "Enter a valid amount.");}
	
	public void deposit(String input) {
		if(validDouble(input)) {
			BigDecimal num = new BigDecimal(input);
			num = num.setScale(2, RoundingMode.HALF_UP);
			BigDecimal bal = new BigDecimal(String.valueOf(balance));
			this.balance = bal.add(num).doubleValue();
		}
		else
			JOptionPane.showMessageDialog(null, "Enter a valid amount.");}
	
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
