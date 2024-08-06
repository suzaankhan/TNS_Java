package com.genericinterfaceexample;

public class Main {

	public static void main(String[] args) {
		
		GenericRepository<Employee> repo = new EmployeeRepository();
		GenericRepository<Student> stdrepo = new StudentRepository();
		
		Employee emp1 = new Employee("Gates", 21000, "Mumbai");
		Employee emp2  = new Employee("Sam", 25000, "Goa");
		
		Student s1 = new Student("suzaan", "CSE", 2025);
		Student s2 = new Student("Laana", "Bio", 2026);
		
		repo.save(emp1);
		repo.save(emp2);
		
		stdrepo.save(s1);
		stdrepo.save(s2);
	
		System.out.println(repo.find(1).toString());
		System.out.println(stdrepo.find(2).toString());
		
	}
	
}
