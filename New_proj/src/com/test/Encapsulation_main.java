package com.test;

public class Encapsulation_main {
	
	public static void main(String[] args) {
		// Creating object
		Encapsulation_logic obj = new Encapsulation_logic();
		
		obj.sayHello();
		// haath mai leke access karra hu
		
		//setter
		obj.set_pvtVariable(123);
		System.out.println("Setted pvt var to 123");
		
		//getters - (to get some data)
		System.out.println(obj.get_pvtVariable());
		
	}
}
