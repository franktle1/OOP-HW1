package com.ualbany.hw1.problem3;

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
			double x = Double.parseDouble(input);
			String temp = (new DecimalFormat("#.00").format(x));
			double num = Double.parseDouble(temp);
			this.balance -= num;}
		else
			JOptionPane.showMessageDialog(null, "Enter a valid amount.");}
	
	public void deposit(String input) {
		if(validDouble(input)) {
			double x = Double.parseDouble(input);
			String temp = (new DecimalFormat("#.00").format(x));
			double num = Double.parseDouble(temp);
			this.balance += num;}
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
