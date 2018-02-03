package com.ualbany.hw1.problem3;

public class Bank {
	
	
	
	
	
	public static void main(String[] args) {
		CheckingBankAccount r = new CheckingBankAccount();
		r.setBalance(100);
		System.out.println(r.getBalance());
		r.deposit("50.111");
		System.out.println(r.getBalance());
		r.withdraw("25.00");
		System.out.println(r.getBalance());
		System.out.println(r.getBalance());
		System.out.println(r.getBalance());
	}
}
