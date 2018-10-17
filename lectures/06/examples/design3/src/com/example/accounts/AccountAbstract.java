package com.example.accounts;

public abstract class AccountAbstract implements AccountInterface{
	protected double balance;
	
	public AccountAbstract(double balance){
		this.balance = balance;
	}
	
	public AccountAbstract(){
		this.balance = 0;
	}
	
	public final double getBalance(){
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
	
	public abstract void monthlyAdjustment();
}
