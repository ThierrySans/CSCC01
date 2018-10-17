package com.example.accounts;

public class CheckingAccount implements AccountInterface{
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
	
	public boolean deposit(double amount){
		this.balance += amount;
		return true;
	}
	
	public boolean withdraw(double amount){
			this.balance -= amount;
			return true;
	}
	
	public boolean transfer(double amount, AccountInterface target){
		if (this.withdraw(amount)){
			return target.deposit(amount);
		} else return false;
	}
	
	public void monthlyAdjustment(){
		this.balance -= fee;
	}
	
	public double getFee(){
		return fee;
	}
}
