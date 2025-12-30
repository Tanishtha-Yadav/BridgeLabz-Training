package com.constructors.level1;

public class BankSystem {
	public int accountNumber;
	protected String accountHolder;
	private double balance;
	
	BankSystem (int accountNumber,String accountHolder,double balance){
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void checkBalance() {
		System.out.println("Current Balance :" +balance);
	}
	public void modifyBalance(double balance) {
		this.balance = balance;
		
	}
	
	

}