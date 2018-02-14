package com.ualbany.hw1.problem3;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.sql.Timestamp;
public class MainFrame extends JFrame {
	
	//any MainFrame Components goes here
	private FPanel formPanel;
	private TPanel textPanel;
	
	
	//MainFrame Class is where the components interact with each other; IE Switch-Board
	public MainFrame(Bank bank, Person customer) {
		super("Bank Simulator");					
		textPanel = new TPanel(); 					//used for displaying output
		formPanel = new FPanel(customer);			//used for capturing customer request		
		
		defaultGreeting(bank, customer);
		
		add(textPanel,BorderLayout.CENTER);
		add(formPanel, BorderLayout.WEST);
		
	
		formPanel.setFormListener(new FormListener() {
			//creates the interface method here
			public void formEventOccurred(FormEvent e) {
				//This is where we grab info from the FormEvent e and communicate it to textPanel
				String fullName = customer.getFullName();
				String fullAddress = customer.getFullAddress();
				String transaction = e.getTransactionType();
				String transactionAmt = e.getAmount();
				Timestamp timestamp = new Timestamp(System.currentTimeMillis());
				
				if(transaction.compareTo("Deposit")==0)
					customer.getMyAccount().deposit(transactionAmt);
				else
					customer.getMyAccount().withdraw(transactionAmt);
				
				String currentBalance = customer.getMyAccount().getBalanceAsString();
				
				textPanel.addText("\n\n=========\n"+ timestamp +"\n========"
						+ "\nCustomer Name: " + fullName +"\nCustomer Address:\n" + fullAddress +
						"\nTransaction Type:" + transaction + "\nTransaction Amount: " +
						transactionAmt + "\nBalance: "+ currentBalance);
			}
		});
		
	
		//sets the JFrame
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	
	}
	
	public void defaultGreeting(Bank b, Person p) {
		textPanel.addText("Welcome to "+ b.getName()+", " + p.getFullName()+
				". Your current balance is: $"+ p.getMyAccount().getBalance() +
				". What would you like to do today?");
	}
	
	
}
