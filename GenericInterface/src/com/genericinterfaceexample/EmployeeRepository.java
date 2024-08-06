package com.genericinterfaceexample;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository implements GenericRepository<Employee> {

	Map<Integer, Employee> employeedatabase = new HashMap<>();
	private int currId = 1;
	
	@Override
	public void save(Employee object) {
		// TODO Auto-generated method stub
		employeedatabase.put(currId++, object);
		System.out.println("Employee with id " + (currId-1) + " was added");
	}

	@Override
	public Employee find(int id) {
		// TODO Auto-generated method stub
		return employeedatabase.get(id); // returns object
	}


}
