package com.main;

import com.application.MMBankFactory;
import com.application.MMCurrentAcc;
import com.application.MMSavingAcc;

public class Main {

	public static void main(String[] args) {
		
		MMBankFactory obj = new MMBankFactory();
		
		MMCurrentAcc ca = (MMCurrentAcc)obj.getNewCurrentAccount(15, "Suzaan", 10000f, 5000f);
		
		ca.deposit(50f);
		System.out.println("\nCredit limit is " + ca.getCreditLimit());
		
		ca.deposit(1000f);
		System.out.println("Your Current Account balance is " + ca.getAccBal());
		
		ca.withdraw(6000f); // credit limit exceeded error here
		
		ca.withdraw(2500f);
		
		System.out.println("--------------------------------------------------");
		
		MMSavingAcc sa = (MMSavingAcc)obj.getNewSavingAccount(30, "Suzaan", 30000f, true );
		
		sa.deposit(300f);
		System.out.println("Saving balance is " + sa.getAccBal());
		
		sa.withdraw(1000f);
		sa.withdraw(30000f); //not enought balance here
		
	}
	
}
