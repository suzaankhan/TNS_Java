package com.assignment9;

public class UserForm {
	
	private String name;
	private int age;
	private String phnno;
	private double weight;
	
	public UserForm(String name, int age, String phnno, double weight) throws 
	NameException, AgeException, PhnNoException, WeightException{
		setName(name);
		setAge(age);
		setPhnno(phnno);
		setWeight(weight);
	}

	public void setName(String name) throws NameException{
		if (name == null || name.isEmpty()) {
            throw new NameException("Name cannot be null or empty");
        }
		this.name = name;
	}

	public void setAge(int age) throws AgeException{
		if(age < 0) {
			throw new AgeException("Age must be a positive value");
		}
		this.age = age;
	}

	public void setPhnno(String phnno) throws PhnNoException{
		if(phnno == null || phnno.length() != 10 || !phnno.matches("\\d+")) {
			throw new PhnNoException("Phone number must be of 10-digit");
		}
		this.phnno = phnno;
	}

	public void setWeight(double weight) throws WeightException{
		if(weight < 0) {
			throw new WeightException("Weight must be a positive number");
		}
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "UserForm [name=" + name + ", age=" + age + ", phnno=" + phnno + ", weight=" + weight + "]";
	}
	
	

}
