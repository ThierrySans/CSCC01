package com.example.main;

import com.example.accounts.CheckingAccount;
import com.example.accounts.SavingsAccount;
import com.example.bank.Bank;

public class Main {

	public static void main(String[] args) {

		Bank myBank = new Bank();
		
		SavingsAccount aliceSaving = new SavingsAccount(2000);
		myBank.createAccount("Alice", aliceSaving);
		aliceSaving.withdraw(1000);
	    
		CheckingAccount bobChecking = new CheckingAccount(500);
		myBank.createAccount("Bob", bobChecking);
		bobChecking.deposit(200);
		
		myBank.doAllMonthlyAdjustement();
		
		System.out.println(aliceSaving.getBalance());
		System.out.println(bobChecking.getBalance());
		
	}

}
