package com.example.accounts;

public interface AccountInterface {
	public double getBalance();
	public boolean deposit(double amount);
	public boolean withdraw(double amount);
	public boolean transfer(double amount, AccountInterface target);
	public void monthlyAdjustment();
}
