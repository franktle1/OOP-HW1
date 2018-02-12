package com.ualbany.hw1.problem3;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	//any MainFrame Components goes here
	private FPanel formPanel;
	private TPanel textPanel;
	
	
	
	public MainFrame(Bank bank, Person customer) {
		super("Bank Simulator");					//title
		//Instantiated objects
		
		textPanel = new TPanel(); 					//used for displaying output
		formPanel = new FPanel();					//used for capturing customer request		
		
		
		defaultGreeting(bank, customer);
		
		add(textPanel,BorderLayout.CENTER);
		add(formPanel, BorderLayout.WEST);
		
		/*
		THESE ARE WHERE THE COMPONENT LISTENERS WILL GO
		*/
		
		//sets the JFrame
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void defaultGreeting(Bank b, Person p) {
		textPanel.addText("Welcome to "+ b.getName()+", " + p.getFullName()+". What would you like to do today?");
	}
	
	
}
