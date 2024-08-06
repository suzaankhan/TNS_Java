package com.genericinterfaceexample;

public class Main {

	public static void main(String[] args) {
		
		GenericRepository<Employee> repo = new EmployeeRepository();
		
		Employee emp1 = new Employee("Gates", 21000, "Mumbai");
		Employee emp2  = new Employee("Sam", 25000, "Goa");
		
		repo.save(emp1);
		repo.save(emp2);
	
		System.out.println(repo.find(1).getName());
		
	}
	
}
