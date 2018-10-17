package com.example.accounts;

public class CheckingAccount {
	private double balance;
	private static double fee = 50;
	
	public CheckingAccount(double balance){
		this.balance = balance;
	}
	
	public CheckingAccount(){
		new CheckingAccount(0);
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getFee(){
		return fee;
	}
	
	public boolean deposit(double amount){
		this.balance += amount;
		return true;
	}
	
	public boolean withdraw(double amount){
			this.balance -= amount;
			return true;
	}

}
