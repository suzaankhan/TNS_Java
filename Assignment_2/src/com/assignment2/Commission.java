package com.assignment2;

public class Commission {

	private String name;
	private String address;
	private String phnNo;
	private double sales_amt;
	
	public void takeDetails(String  name, String address, String phnNo, double sales_amt) {
		this.name = name;
		this.address = address;
		this.phnNo = phnNo;
		this.sales_amt = sales_amt;
	}
	
	public void calculateCommission() {
		
		if(sales_amt < 30000) {
			System.out.println("No commission");
		}
		else if(sales_amt >= 100000) {
			System.out.println("Commission is " + sales_amt*0.1);
		}
		else if(30000 <= sales_amt && sales_amt < 50000) {
			System.out.println("Commission is " + sales_amt*0.03);
		}
		else if(50000 <= sales_amt && sales_amt < 100000) {
			System.out.println("Commission is " + sales_amt*0.05);
		}
		
	} 
	
}
