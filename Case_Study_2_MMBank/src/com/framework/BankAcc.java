package com.framework;

public abstract class BankAcc {

	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal) {
		this.accBal = accBal;
		this.accNm = accNm;
		this.accNo = accNo;
	}
	
	public int getAccNo() {
		return accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	public abstract void withdraw(float amt);
	public abstract void deposit(float amt);

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + "]";
	}

	
	
}
