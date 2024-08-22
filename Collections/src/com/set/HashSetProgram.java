package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetProgram {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		List<String> l = new ArrayList<String>();
		
		s.add("Apple");
		s.add("Black");
		s.add("Blue");
		s.add("White");
		
		l.add("Suzaan");
		l.add("Khan");
		
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.addAll(l));
		System.out.println(s);
		System.out.println(s.containsAll(l));
		System.out.println(l.containsAll(s));
		
	}
	
}
