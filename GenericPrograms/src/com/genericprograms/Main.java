package com.genericprograms;

public class Main {

	public static void main(String[] args) {
		
		GenericDemo<String> stringobj = new GenericDemo<String>();
		GenericDemo<Integer> intobj = new GenericDemo<Integer>();
		
		stringobj.setMessage("This is a message");
		intobj.setMessage(45);
		
		System.out.println("String generic : " + stringobj.getMessage());
		System.out.println("Integer generic : " + intobj.getMessage());
		
		stringobj.printData(45.0f, "Suzaan", false);
		System.out.println("Printing array");
		Integer[] array = {10,23,65,4};
		
		stringobj.printArray(array);
		
		
	}
	
	
}
