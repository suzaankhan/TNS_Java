package com.assignment6;

public abstract class Account{
	// abstract methods - this MUSt be inherited in subclass
	public abstract void deposit(Bank obj);
	public abstract void withdraw(Bank obj);
	public abstract void getTotalBalance(Bank obj);
	
	// concrete methods
	public static void showDetails(Bank obj) {
		System.out.println("Account number:" + obj.getAccNo());
		System.out.println("IFSC Code: " + obj.getIfsc());
		System.out.println("Savings Account: " + obj.getSavAccBal());
		System.out.println("Checking Account: " + obj.getChkAccBal());
	}
	
}
