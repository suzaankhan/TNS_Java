package com.exceptionhandling;

public class WithoutException {

	public static void main(String[] args) {
		
		int d = 0;
		try {
			int a = 42/d;
			
//			String s = 'mannu';
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage());
			// due to below line, finally will not be executed
			System.exit(0);
		}
		catch(NullPointerException e) {
			
		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		finally {
			System.out.println("Finally block executed");
		}
		
//		System.out.println("LAst statement of the program");
	}
	
}
