// user defined exception class
package com.exceptionhandling;

public class Age extends Exception{

	public Age(String str) {
		super(str);  // this is necessary or else we will get error
		System.out.println(str);
	}
}
