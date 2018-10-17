package com.example.bank;

import java.util.HashMap;

import com.example.accounts.CheckingAccount;
import com.example.accounts.SavingsAccount;

public class Bank {
	
	private HashMap<String, SavingsAccount> savings;
	private HashMap<String, CheckingAccount> checkings;
	
	public Bank(){
		this.savings = new HashMap<String, SavingsAccount>();
		this.checkings = new HashMap<String, CheckingAccount>();
	}
	
	public boolean createSavingsAccount(String username, int amount){
		if (!savings.containsKey(username)){
			savings.put(username, new SavingsAccount(amount));
			return true;
		}
		return false;
	}
	
	public boolean createCheckingAccount(String username, int amount){
		if (!checkings.containsKey(username)){
			checkings.put(username, new CheckingAccount(amount));
			return true;
		}
		return false;
	}
	
	public SavingsAccount getSavingsAccount(String username){
		return savings.get(username);
	}
	
	public CheckingAccount getCheckingAccount(String username){
		return checkings.get(username);
	}
	
	public void doAllMonthlyAdjustement(){
		for (String username : savings.keySet()) {
			SavingsAccount account = savings.get(username);
			account.deposit(account.getBalance() * account.getInterestRate() / 100);
		}
		for (String username : checkings.keySet()) {
			CheckingAccount account = checkings.get(username);
			account.withdraw(account.getFee());
		}
	}
	
}
