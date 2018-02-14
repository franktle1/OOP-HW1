package com.ualbany.hw1.problem2;
import java.lang.ArithmeticException;
import java.util.Random;

import javax.swing.JOptionPane;

public class HW1Problem2 {
	
	public boolean multiple(int num1, int num2) throws ArithmeticException{
		try {
			if (num1%num2==0)
				return true;}
		catch(ArithmeticException e){
			JOptionPane.showMessageDialog(null,"The universe could not comprehend division by zero. Returning false.");};
		return false;
	}//end of multiple
	
	public int remainder(int num){
		return (int)(num%7);}
	
	public double distance(double x1, double x2, double y1, double y2) {
		//Distance Formula: Square root of the quantity, (x1-x2)^2 + (y1-y2)^2
		return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));}
	
	//coin flip
	public void coinFlip() {	
		Random generator = new Random();
		int numberOfHeads = 0, numberOfTails = 0;
		String resultString = new String("");
		
		for(int i = 0; i < 10; i++) {
		//range is from 0 to 1
		int number = generator.nextInt(2);
		if(number == 1) {
			++numberOfHeads;
			resultString = resultString + "heads\n";}
		else {
			++numberOfTails;
			resultString = resultString + "tails\n";}
		}
		JOptionPane.showMessageDialog(null, "Results:\n" + resultString +"Tally--> Heads:"+
		numberOfHeads+ " VERSUS Tails: "+ numberOfTails);
		
		
	}
	
}


