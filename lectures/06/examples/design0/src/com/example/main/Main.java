package com.example.main;

import com.example.accounts.CheckingAccount;
import com.example.accounts.SavingsAccount;
import com.example.bank.Bank;

public class Main {

	public static void main(String[] args) {

		Bank myBank = new Bank();
		
		myBank.createSavingsAccount("Alice", 2000);
		
		myBank.createCheckingAccount("Bob", 500);
		
		SavingsAccount aliceSavings = myBank.getSavingsAccount("Alice");
	    aliceSavings.withdraw(1000);
	    
		CheckingAccount bobChecking = myBank.getCheckingAccount("Bob");
		bobChecking.deposit(200);
		
		myBank.doAllMonthlyAdjustement();
		
		System.out.println(aliceSavings.getBalance());
		System.out.println(bobChecking.getBalance());
		
	}

}
