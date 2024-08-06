package com.tnsif.daySix;

public class Student extends Citizen{
	
	private int rollno;
	private String clgName;
	
	public Student() {
		// invokes the parent class constructor
//		super(name, adhaarNo, phno, address);
		super();
		System.out.println("Student constructor was called");
//		this.rollno = rollno;
//		this.clgName = clgName;
	}
	
	
}
