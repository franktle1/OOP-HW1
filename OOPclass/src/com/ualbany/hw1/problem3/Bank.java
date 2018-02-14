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
		
		//Generates the Menu Dialog to Demo or to manually input customer info
		String options[] = {"Make a new account", "Demo", "Exit"};
		int select = JOptionPane.showOptionDialog(null, "Choose your option.", "Main Menu", 0, 1, null, options, 0);
		switch(select){
			case 0:
				Bank bank = new Bank("SEFCU",
						new Address("123 Main Avenue", "Albany", "12222"));
				CreateNewClient c = new CreateNewClient();
				Person customer = c.getNewClient();
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						new MainFrame(bank, customer);
					}
				});
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Check Console");
//				This instantiates a Person object with a checking balance = 0;
				Person cust = new Person("Bob", "Marley");
				cust.setAddress(new Address("123 Fake St.", "Albany", "12200"));
				Bank ba = new Bank("SEFCU",
						new Address("123 Main Avenue", "Albany", "12222"));
				
//				Simulates person arriving at the bank
				System.out.println("Bank Name:" + ba.getName()+"\nClient name: "+ cust.getFullName());
				printReceipt(cust);
//				Simulates opening a new account with initial deposit of 1000.00
				cust.setMyAccount(new CheckingBankAccount(1000.00));
				printReceipt(cust);
				
//				Simulates deposit then persons name, their address, and balance prints
				cust.getMyAccount().deposit("1000.00");
				printReceipt(cust);
				cust.getMyAccount().withdraw("500.00");
				printReceipt(cust);
				break;
			case 2:
				System.out.println("GoodBye.");	
				System.exit(1);
				break;
			default: 
				System.exit(1);				
		}

	}

	
	public static void printReceipt(Person customer) {
		System.out.println("Name: "+ customer.getFullName()+"\nClient Address: "+
				customer.getFullAddress()+"\nCurrent Balance:"+ customer.getMyAccount().getBalance()+
				"\n-------------------\n-------------------");
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
