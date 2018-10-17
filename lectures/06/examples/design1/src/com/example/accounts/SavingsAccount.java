package com.example.accounts;

public class SavingsAccount implements AccountInterface{
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
	
	public boolean transfer(double amount, AccountInterface target){
		if (this.withdraw(amount)){
			target.deposit(amount);
			return true;
		} else return false;
	}
	
	public void monthlyAdjustment(){
		this.balance += this.balance * interest /100;
	}
	
	public double getInterestRate(){
		return interest;
	}
}
