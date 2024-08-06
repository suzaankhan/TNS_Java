package com.assignment6;

public class Transaction {
	
	static Account sav = new SavingsAccount();
	static Account chk = new CheckingAccount();
	
	// value of fee cannot be changed
	public final int fee = 2;
	
	// this method now cannot be overridden
	public static final void performTransaction(Bank obj, int input) {
		if(input == 1) {
			sav.deposit(obj);
		}
		else if (input == 2) {
			chk.deposit(obj);
		}
		else if(input == 3) {
			sav.withdraw(obj);
		}
		else if(input == 4) {
			chk.withdraw(obj);
		}
		else if(input == 5) {
			Account.showDetails(obj);
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
