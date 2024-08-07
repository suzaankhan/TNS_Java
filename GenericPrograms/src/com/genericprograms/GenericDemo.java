package com.genericprograms;

public class GenericDemo<T1> {
	
	private T1 message;
	
	public void setMessage(T1 message) {
		this.message = message;
	}
	
	public T1 getMessage() {
		return message;
	}
	
	public <T1, T2, T3> void printData(T1 var1, T2 var2, T3 var3) {
		System.out.println("var1 is " + var1);
		System.out.println("var2 is " + var2);
		System.out.println("var3 is " + var3);
	}
	
	public <T> void printArray(T[] array) {
		for(T element : array) {
			System.out.println(element);
		}
	}
	
}
