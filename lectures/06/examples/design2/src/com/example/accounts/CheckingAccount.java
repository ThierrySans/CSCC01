package com.example.accounts;

public class CheckingAccount extends Account implements AccountInterface, CheckingAccountInterface{
	private static double fee = 50;
	
	public CheckingAccount(double amount){
		super(amount);
	}
	
	public void monthlyAdjustment(){
		this.balance -= fee;
	}
	
	public double getFee(){
		return fee;
	}

	@Override
	public boolean transfer(double amount, AccountInterface target) {
		// TODO Auto-generated method stub
		return super.transfer(amount, (Account) target);
	}

}
