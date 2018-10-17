package com.example.accounts;


public class SavingsAccount extends AccountAbstract implements SavingsAccountInterface{
	private static double interest = 4;
	
	public SavingsAccount(double amount){
		super(amount);
	}
	
	public boolean withdraw(double amount){
		if (this.getBalance() >= amount){
			return super.withdraw(amount);
		}else return false;
	}
	
	public void monthlyAdjustment(){
		this.balance += this.balance * interest /100;
	}
	
	public double getInterestRate(){
		return interest;
	}

	public boolean transfer(double amount, AccountInterface target) {
		return super.transfer(amount, (AccountAbstract) target);
	}
}
