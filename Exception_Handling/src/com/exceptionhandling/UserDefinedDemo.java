package com.exceptionhandling;

import java.util.Scanner;

public class UserDefinedDemo {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter yur age:");
//		UserDefined.age = sc.nextInt();
		
		try {
			UserDefined.validate(6);
		}
		catch(Age e) {
			System.out.println("Exception is caught " + e.getMessage());
		}
		
	}
	
}
