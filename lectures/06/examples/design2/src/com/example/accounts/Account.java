package com.example.accounts;

public class Account implements AccountInterface{
	protected double balance;
	
	public Account(double balance){
		this.balance = balance;
	}
	
	public Account(){
		new Account(0);
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
		
	}	
}
