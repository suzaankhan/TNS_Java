package com.genericinterfaceexample;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository implements GenericRepository<Student>{

	Map<Integer, Student> studentdatabase = new HashMap<>();
	private int id = 1;
	
	@Override
	public void save(Student object) {
		// TODO Auto-generated method stub
		studentdatabase.put(id++,  object);
		System.out.println("Student with id " + (id-1) + " was added");
	}

	@Override
	public Student find(int id) {
		// TODO Auto-generated method stub
		return studentdatabase.get(id);
	}


}
