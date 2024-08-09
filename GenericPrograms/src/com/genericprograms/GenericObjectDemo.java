package com.genericprograms;

public class GenericObjectDemo {

	public static void main(String[] args) {
		
		GenericObjectDemo demo = new GenericObjectDemo();
		Employee emp = new Employee("Bill Gates", 50000, "America");
		Student std = new Student("Suzaan",21, 16);
		
		demo.printDetails(emp);
		demo.printDetails(std);
		
		demo.print("Suzaan", 0.2f, 0.45, 55, true, null);
	}
	
	public <T extends Person> void printDetails(T object) {
		System.out.println(object.getDetails());
	}
	
	public <t1, t2, t3, t4, t5, t6> void print(t1 a , t2 b, t3 c, t4 d, t5 e, t6 f) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
	
	
}
