package com.example.bank;

import java.util.HashMap;

import com.example.accounts.AccountInterface;

public class Bank {
	
	private HashMap<String, AccountInterface> accounts;
	
	public Bank(){
		this.accounts = new HashMap<String, AccountInterface>();
	}
	
	public boolean createAccount(String username, AccountInterface account){
		if (!accounts.containsKey(username)){
			accounts.put(username, account);
			return true;
		}
		return false;
	}
	
	public AccountInterface getAccount(String username){
		return accounts.get(username);
	}
	
	public void doAllMonthlyAdjustement(){
		for (String username : accounts.keySet()) {
			AccountInterface account = accounts.get(username);
            account.monthlyAdjustment();
		}
	}
	
}
