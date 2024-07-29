// program to understand inheritance
package com.tnsif.daySix;

public class Citizen {
	
	private String name;
	private long adhaarNo;
	private long phno;
	private String address;
	
	public static void main(String[] args) {
		Citizen cone = new Citizen();
		Student std = new Student();
	}
	
	public Citizen(String name, long adhaarNo, long phno) {
		super();
		this.name = name;
		this.adhaarNo = adhaarNo;
		this.phno = phno;
	}

	public Citizen() {
		super();
		System.out.println("Citizen Constructor was called");
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAdhaarNo() {
		return adhaarNo;
	}

	public void setAdhaarNo(long adhaarNo) {
		this.adhaarNo = adhaarNo;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adhaarNo=" + adhaarNo + ", phno=" + phno + "]";
	}
	
}
