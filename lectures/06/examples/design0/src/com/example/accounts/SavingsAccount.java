package com.example.accounts;

public class SavingsAccount{
	
	private double balance;
	private static double interest = 4;
	
	public SavingsAccount(double balance){
		this.balance = balance;
	}
	
	public SavingsAccount(){
		new SavingsAccount(0);
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getInterestRate(){
		return interest;
	}
	
	public boolean deposit(double amount){
		this.balance += amount;
		return true;
	}
	
	public boolean withdraw(double amount){
		if (this.balance >= amount){
			this.balance -= amount;
			return true;
		}else return false;
	}
	
	

}