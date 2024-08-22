package com.interfaces;

public class PrimeAccount implements Amazon{
	
	private final static int delivery_charges = 40;

	@Override
	public void makePayment(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Processing a PAYMENT of " + amt + " + " + delivery_charges+ "Rs delivery");
	}

	@Override
	public void refundPayment(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Processing a REFUND of " + amt + " + " + delivery_charges+ "Rs delivery");
	}
	
	public void childSpecificMethod() {
		System.out.println("This is specific to prime acc child");
	}
	
}
