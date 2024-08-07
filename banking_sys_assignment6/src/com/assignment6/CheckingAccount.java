package com.assignment6;

import java.util.Scanner;

public class CheckingAccount extends Account{

	Scanner sc = new Scanner(System.in);
	double amt;
	
	@Override
	public void deposit(Bank obj) {
		// TODO Auto-generated method stub
		System.out.println("Enter amount you want to deposit: ");
		if(sc.hasNextDouble()) {
			amt = sc.nextDouble();
			obj.setChkAccBal(amt + obj.getChkAccBal());
			System.out.println(amt + "Rs successfully deposited in checking Account");
		}
		else {
			System.out.println("Transaction Failed!");
		}
	}

	@Override
	public void withdraw(Bank obj) {
		// TODO Auto-generated method stub
		System.out.println("Enter amount you want to Withdraw: ");
		if(sc.hasNextDouble()) {
			amt = sc.nextDouble();
			if(amt > obj.getChkAccBal()) {
				System.out.println("Not enought balance!");
				return;
			}
			obj.setChkAccBal(obj.getChkAccBal() - amt);
			System.out.println(amt + "Rs successfully Withdrawn from checking account");
		}
		else {
			System.out.println("Transaction Failed!");
		}
	}

	@Override
	public void getTotalBalance(Bank obj) {
		// TODO Auto-generated method stub
		System.out.println("Saving Account: " + obj.getSavAccBal());
		System.out.println("Checking Account: " + obj.getChkAccBal());
		System.out.println("Total: " + obj.getChkAccBal() + obj.getSavAccBal());
	}

}
