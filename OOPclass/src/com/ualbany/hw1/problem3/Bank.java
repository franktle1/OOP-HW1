package com.ualbany.hw1.problem3;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class Bank {
	
	private String name;
	private Address bankAddress;
	
	public Bank(String name, Address bankAddress) {
		this.name = name;
		this.bankAddress = bankAddress;}

	public static void main(String[] args) {
		
		Bank bank = new Bank("SEFCU",
				new Address("123 Main Avenue", "Albany", "12222"));
		
		CreateNewClient customer = new CreateNewClient();
		
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				new MainFrame(bank, customer);
//			}
//		});
//		
		
////		This instantiates a Person object with a checking balance = 0;
//		Person customer = new Person("Bob", "Marley");
//		customer.setAddress(new Address("123 Fake St.", "Albany", "12200"));
//		Bank bank = new Bank("SEFCU",
//				new Address("123 Main Avenue", "Albany", "12222"));
//		
////		Simulates person arriving at the bank
//		System.out.println("Bank Name:" + bank.getName()+"\nClient name: "+ customer.getFullName());
//		printReceipt(customer);
////		Simulates opening a new account with initial deposit of 1000.00
//		customer.setMyAccount(new CheckingBankAccount(1000.00));
//		printReceipt(customer);
//		
////		Simulates deposit then persons name, their address, and balance prints
//		customer.getMyAccount().deposit("1000.00");
//		printReceipt(customer);
//		customer.getMyAccount().withdraw("500.00");
//		printReceipt(customer);
	}

	
	public static void printReceipt(Person customer) {
		System.out.println("Name: "+ customer.getFullName()+"\nClient Address: "+
				customer.getFullAddress()+"\nCurrent Balance:"+ customer.getMyAccount().getBalance());
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(Address bankAddress) {
		this.bankAddress = bankAddress;
	}
	
	


	
}
