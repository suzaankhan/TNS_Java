package com.test;

public class EncapsulationLogic {

	// Access modifiers
		// restrict karta hai access of data and method
		// 1. private 2. public 3. protected 4. default
		
		//default
		int defaultVariable;
		
		//private
		private int pvtVariable;
		
		//protected
		protected int prtdVariable;
		
		//public
		public int pub_variable;
		
		
		public void sayHello() {
			System.out.println("Hello World from Encapsulation_logic");
		}
		
		// getter function - indirect access ( mai sirf door se dekh raha hu )
		public int get_pvtVariable() {
			return pvtVariable;
		}
		
		//setter
		public void set_pvtVariable(int pvtVariable) {
			this.pvtVariable = pvtVariable;
			System.out.println("Setted pvt var to 123");
		}
		
		private void pvt_method() {
			System.out.println("This is a private method");
		}
	
}
