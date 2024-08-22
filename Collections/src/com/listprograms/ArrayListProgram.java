package com.listprograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProgram {

	// Array list is a dynamic collection
	// In array list if arrays becomes full then its size is increased by 50%
	// we can use get in List 
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(78);
		li2.add(45);
		
		li.add(1);
		li.add(2);
		li.add(7);
		li.add(3);
		
		System.out.println(li);
		li.clear();
		
		li.add(1);
		li.add(2);
		li.add(7);
		li.add(3);
	
		System.out.println(li.indexOf(7));
		
		li.add(7);
		System.out.println(li);
		System.out.println(li.lastIndexOf(7));
		
		li.addAll(2, li2);
		System.out.println(li);
		
		li.addAll(li2);
		System.out.println(li);
		
		System.out.println(li.containsAll(li2));
		
		System.out.println(li.contains(5));
		System.out.println(li.contains(78));
		
		System.out.println(li.equals(li2));
		
		System.out.println(li.isEmpty());
		
		System.out.println(li.size());
		
		li.clear();
		
		System.out.println(li.size());
		
	}
	
}
