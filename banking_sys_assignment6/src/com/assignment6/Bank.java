package com.assignment6;

public class Bank {
	
	private int accNo;
	private String ifsc;
	private double savAccBal;
	private double chkAccBal;
    
    private static int totalAccounts = 100;
    private static String bankName = "Bank of Solar System";
    
    public Bank(int accNo, String ifsc, double savAccBal, double chkAccBal) {
    	this.accNo = accNo;
    	this.ifsc = ifsc;
    	this.savAccBal = savAccBal;
    	this.chkAccBal = chkAccBal;
    }
    
    public static int getTotalAcc(){
        return totalAccounts;
    }
    
    public static String getBankName() {
    	return bankName;
    }

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public double getSavAccBal() {
		return savAccBal;
	}

	public void setSavAccBal(double savAccBal) {
		this.savAccBal = savAccBal;
	}

	public double getChkAccBal() {
		return chkAccBal;
	}

	public void setChkAccBal(double chkAccBal) {
		this.chkAccBal = chkAccBal;
	}


    
}

