package com.application;

import com.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	@Override
	public void deposit(float amt) {
		// TODO Auto-generated method stub
		System.out.println("Prevous balance: " + this.getAccBal());
		this.setAccBal(this.getAccBal() + amt);
		System.out.println("Dear user " + amt + " has been deposited to your Current account");
		System.out.println("Balance now is " + this.getAccBal());
	}
	

	@Override
	public void withdraw(float amt) {
		if(amt > this.getCreditLimit()) {
			System.out.println("Credit Limit exceeded!");
			return;
		}
		this.setAccBal(this.getAccBal() - amt);
		System.out.println(amt + "rs withdrawn from your Current Account");
		System.out.println("Current balance: " + getAccBal());
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
