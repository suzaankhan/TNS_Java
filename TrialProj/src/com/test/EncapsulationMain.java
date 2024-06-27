package com.test;

public class EncapsulationMain {

	public static void main(String[] args) {
		// Creating object
		EncapsulationLogic obj = new EncapsulationLogic();
		
		obj.sayHello();
		// haath mai leke access karra hu
		
		//setter
		obj.set_pvtVariable(123);
		
		//getters - (to get some data)
		System.out.println(obj.get_pvtVariable());
		
	}
	
}
