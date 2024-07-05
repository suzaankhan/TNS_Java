package com.assignment2;

public class Main {

	public static void main(String[] args) {
		
		Student std = new Student();
		
		Commission emp_one = new Commission();
		Commission emp_two = new Commission();
		Commission emp_three = new Commission();
		Commission emp_four = new Commission();
		
		emp_one.takeDetails("Suzaan", "Mira Road", "4587125639", 2223);
		emp_two.takeDetails("Bill gates", "Vashi", "2451369784", 954213);
		emp_three.takeDetails("Jake", "Thane", "454475639", 40000);
		emp_four.takeDetails("Samay", "Churchgate", "9997125639", 75000);
		
		emp_one.calculateCommission();
		emp_two.calculateCommission();
		emp_three.calculateCommission();
		emp_four.calculateCommission();
	}
	
}
