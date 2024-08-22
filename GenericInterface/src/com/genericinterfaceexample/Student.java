package com.genericinterfaceexample;

public class Student {
    private String name;
    private String major;
    private int year;

    public Student(String name, String major, int year) {
        this.name = name;
        this.major = major;
        this.year = year;
    }

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public int getYear() {
		return year;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", major=" + major + ", year=" + year + "]";
	}

    
}
