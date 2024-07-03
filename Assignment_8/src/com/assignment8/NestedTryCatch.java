package com.assignment8;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		// outer try block
		try {
			System.out.println("Entered outer try block");  // no exception
			String name = "Suzaan";   // no exception
			try {
				System.out.println("Entered inner try block"); // no exception
				int a = 3/0; //we get an exception over here
			}
			catch(Exception e) {
				// this catch gets executed
				System.out.println("Inner try exception: " + e.getMessage());
			}
		}
		catch(Exception e) {
			System.out.println("Outer try exception: " + e.getMessage());
		}
		
	}
	
}

