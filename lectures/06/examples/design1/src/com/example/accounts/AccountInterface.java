package com.example.accounts;

public interface AccountInterface {
	double getBalance();
	boolean deposit(double amount);
	boolean withdraw(double amount);
	boolean transfer(double amount, AccountInterface target);
	void monthlyAdjustment();
}
