package com.exceptionhandling;

public class Demo {

	public static void main(String[] args) {
		
		try {
			ThrowKeywordTutorial.validateAge(5);
		}
		catch(Exception e ) {
			System.out.println(e);
		}
		
	}
	
}
