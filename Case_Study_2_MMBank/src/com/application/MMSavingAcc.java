package com.application;

import com.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}

	@Override
	public void deposit(float amt) {
		// TODO Auto-generated method stub
		System.out.println("Prevous balance: " + this.getAccBal());
		this.setAccBal(this.getAccBal() + amt);
		System.out.println("Dear user " + amt + " has been deposited to your Saving account");
		System.out.println("Balance now is " + this.getAccBal());
	}
	
	@Override
	public void withdraw(float amt) {
		if(this.getAccBal() - amt < getMINBAL()) {
			System.out.println("Not enough Balance!");
			return;
		}
		this.setAccBal(this.getAccBal() - amt);
		System.out.println(amt + "rs withdrawn from your Saving Account");
		System.out.println("Saving balance: " + getAccBal());
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried()=" + isSalaried() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
