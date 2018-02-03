package com.ualbany.hw1.problem1;

import javax.swing.JOptionPane;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String fn, String ln, double ms) {
		this.firstName = fn;
		this.lastName = ln;
		if (ms < 0)
			this.monthlySalary = 0.0;
		else
			this.monthlySalary = ms;}
	
	public void setFirstName(String fn) {
		this.firstName = fn;}
	
	public void setLastName(String ln) {
		this.lastName = ln;}
	
	public void setSalary(double s) {
		if(s < 0) {
			this.monthlySalary = 0;
			JOptionPane.showMessageDialog(null, "Salary should be positive.\n Setting salary to 0.");}
		else
			this.monthlySalary = s;	}
	
	
	public String getFirstName() {
		return this.firstName;}
	
	public String getLastName() {
		return this.lastName;}
	
	public double getSalary() {
		return this.monthlySalary;}
	

}
