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
		
		
		
		add(textPanel,BorderLayout.CENTER);
		add(formPanel, BorderLayout.WEST);
		
		//sets the JFrame
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
}
