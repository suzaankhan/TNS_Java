package com.interfaces;

public class Main {

	public static void main(String[] args) {
		
		Amazon obj_prime = new PrimeAccount();
		
		obj_prime.showDetails();
		
		obj_prime.makePayment(450);
		obj_prime.refundPayment(650);
		
		Amazon obj_nonprime = new NonPrimeAccount();
		
		obj_nonprime.makePayment(450);
		obj_nonprime.refundPayment(451);
		
		obj_nonprime.showDetails();
		
		
		
	}
	
}
