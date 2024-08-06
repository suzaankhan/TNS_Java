package com.genericprograms;

public class Employee implements Person{

	private String name;
	private int salary;
	private String location;
	
	public Employee(String name, int salary, String location) {
		this.name = name;
		this.salary = salary;
		this.location = location;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Name: "+name+" Salary: "+salary+" Location: "+location;
	}
	
	public String getInfo() {
		return "hi";
	}

}
	
	

