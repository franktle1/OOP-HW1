package com.ualbany.hw1.problem2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Problem2Driver extends JFrame {
	
	public static void main(String[] args) {
		HW1Problem2 r = new HW1Problem2();
		Problem2Driver m = new Problem2Driver(r);
	}
	
	//I used the class constructor as a JFrame to display the methods  
	public Problem2Driver(HW1Problem2 info) {
		//4 BUTTONS: MULTIPLE, REMAINDER, DISTANCE, FLIP COIN
		JButton multipleButton = new JButton("Multiple");
		JButton remainderButton = new JButton("Remainder");
		JButton distanceButton = new JButton("Distance");
		JButton bonusButton = new JButton("Bonus");
		JButton quitButton = new JButton("Quit");
		JPanel panel1 = new JPanel();
		JPanel banner = new JPanel();
		JLabel title = new JLabel("Choose your method:");
		
		banner.add(title);
		
		panel1.add(multipleButton);
		panel1.add(remainderButton);
		panel1.add(distanceButton);
		panel1.add(distanceButton);
		panel1.add(bonusButton);
		panel1.add(quitButton);
		
		//GridLayout(columns, rows)
		setLayout(new GridLayout(2,2));
		add(banner, BorderLayout.PAGE_START);
		add(panel1, BorderLayout.CENTER);
		
		//Inputs are two integers
		multipleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTextField num1Field = new JTextField(5);
				JTextField num2Field = new JTextField(5);
				JPanel panel = new JPanel();
				panel.add(new JLabel("Dividend:" ));
				panel.add(num1Field);
				panel.add(new JLabel("Divisor:"));
				panel.add(num2Field);
				
				int result = JOptionPane.showConfirmDialog(null, panel, "Input Numbers", JOptionPane.OK_CANCEL_OPTION);
				if(result == JOptionPane.OK_OPTION) {
					String input1 = num1Field.getText();
					String input2 = num2Field.getText();
					if(validInt(input1) && validInt(input2)) {
						int dividend = Integer.parseInt(input1);
						int divisor = Integer.parseInt(input2);
						JOptionPane.showMessageDialog(null, "Does " + dividend + " divide evenly with " +
								divisor +"? Answer: " + info.multiple(dividend, divisor));}
					else 
						JOptionPane.showMessageDialog(null, "Invalid format.");}
				else
					return;
			}
		});
		
		remainderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = JOptionPane.showInputDialog("Enter an integer to be divided by 7:");
				if(validInt(input)) {
					int user_number = Integer.parseInt(input);
					JOptionPane.showMessageDialog(null, "The remainder is:\n" + info.remainder(user_number));}
				else
					return;
			}});
		
		distanceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//for modularity: Change number of inputs, add field labels in pairs, and String len format if more points are added
				final int numberOfInputs = 4;
				JPanel panel = new JPanel();
				JTextField [] fields = new JTextField[numberOfInputs];
				String [] fieldLabels = {"x1:","y1:","x2:","y2:"};
				//in this case, it'll make 4 fields for the corresponding numeric coordinate inputs
				for(int i = 0; i < numberOfInputs; i++) {
					fields[i] = new JTextField(5);
					panel.add(new JLabel(fieldLabels[i]));
					panel.add(fields[i]);}
				int result = JOptionPane.showConfirmDialog(null, panel, "Input Numbers", JOptionPane.OK_CANCEL_OPTION);
				if(result == JOptionPane.OK_OPTION) {
					String [] inputs = new String[numberOfInputs];
					Double [] coords = new Double[numberOfInputs];
					//This loop stores all inputs into a string arr, and checks all inputs to be proper Doubles, returns a Double array
					for(int i = 0; i < numberOfInputs;i++) {
						inputs[i] = fields[i].getText();
						if(validDouble(inputs[i])== false) {
							JOptionPane.showMessageDialog(null, "Invalid format.");
							return;}
						else
							coords[i] = Double.parseDouble(inputs[i]);}
					String len = String.format("%.5f", info.distance(coords[0],coords[2],coords[1],coords[3]));
					JOptionPane.showMessageDialog(null, "Distance between ("
							+ coords[0]+","+coords[1]+") and (" + coords[2] + ","+coords[3]+") is :\n" + len);}				
				else
					return;
				
//				REPLACED CODE [found at end of file] FOR MODULARIZATION
			}});
		
		bonusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random generator = new Random();
				
				
				JOptionPane.showMessageDialog(null, "Still Working On It!!");
			}});
		
		quitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.exit(1);
			}});
		
//		JFRAME SPECS
		setTitle("HW1.2 Calculations");
		setSize(600,100);
		setResizable(false);
		setVisible(true);	
	}
	
	public static boolean validDouble(String str) {
		
		try {
			double num = Double.parseDouble(str);
			return true;}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Number(s) entered was not in double-format.");
			return false;}
	}//validDouble
	
	//Checks String
	public static boolean validInt(String str) {
	
		try {
			int num = Integer.parseInt(str);
			return true;}
		catch (NumberFormatException e ) {
			JOptionPane.showMessageDialog(null, "Number(s) entered was not an integer.");
			return false;}
	}//validInt
}




//				REPLACED WORKING CODE
/*
				JTextField x1Field = new JTextField(5);
				JTextField y1Field = new JTextField(5);
				JTextField x2Field = new JTextField(5);
				JTextField y2Field = new JTextField(5);
				JPanel panel = new JPanel();
				panel.add(new JLabel("x1:" ));
				panel.add(x1Field);
				panel.add(new JLabel("y1:"));
				panel.add(y1Field);
				panel.add(new JLabel("x2:" ));
				panel.add(x2Field);
				panel.add(new JLabel("y2:"));
				panel.add(y2Field);
				
				int result = JOptionPane.showConfirmDialog(null, panel, "Input Numbers", JOptionPane.OK_CANCEL_OPTION);
				if(result == JOptionPane.OK_OPTION) {
					String input1 = x1Field.getText();
					String input2 = y1Field.getText();
					String input3 = x2Field.getText();
					String input4 = y2Field.getText();
					if(validDouble(input1) && validDouble(input2) && validDouble(input3) && validDouble(input4)) {
						double x1 = Double.parseDouble(input1);
						double y1 = Double.parseDouble(input2);
						double x2 = Double.parseDouble(input3);
						double y2 = Double.parseDouble(input4);
						String len = String.format("%.5f", info.distance(x1,x2,y1,y2));
						JOptionPane.showMessageDialog(null, "Distance between ("
								+ x1+","+y1+") and (" + x2 + ","+y2+") is :\n" + len);}
					else 
						JOptionPane.showMessageDialog(null, "Invalid format.");}
				else
					return;

*/