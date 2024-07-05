package com.exceptionhandling;
import java.util.*;

public class UserDefined {

	public static int age;
	
	public static void validate(int age) throws Age{
		
		if(age < 18) {
			throw new Age("You cant vote");
		}
		else {
			System.out.println("you can vote");
		}
	}
	
}
