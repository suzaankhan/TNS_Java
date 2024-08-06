package com.genericprograms;

public class Student implements Person{
	
	private String name;
	private int age;
	private int cls;
	
	public Student(String name, int age, int cls) {
		this.name = name;
		this.age = age;
		this.cls = cls;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "Name: "+name+" Age: "+age+" Class: "+cls;
	}
	
}
