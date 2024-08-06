package com.polymorphism_tns;

public class MethodOverloadingDemo {
	
	public static void main(String[] args) {
		System.out.println("Addition of two integers " + Overloading.addition(5, 7));
		System.out.println("Addition of two floats " + Overloading.addition(5.5f, 7.4f));
		System.out.println("Addition of one int one float integers " + Overloading.addition(5, 7.14f));
		System.out.println("Concatenation of two strings " + Overloading.addition("suzaan ", "khan"));
	}
	
}
