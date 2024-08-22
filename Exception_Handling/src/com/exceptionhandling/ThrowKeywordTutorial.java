package com.exceptionhandling;

public class ThrowKeywordTutorial {
	
	public static void validateAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("Invalid Age");
		}
		else {
			System.out.println("You can vote");
		}
	}
	
}
