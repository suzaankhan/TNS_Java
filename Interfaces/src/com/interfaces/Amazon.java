package com.interfaces;

public interface Amazon {
	
	void makePayment(double payment);
	void refundPayment(double payment);
	
	default void showDetails() {
		System.out.println("Hello");
	}

}
