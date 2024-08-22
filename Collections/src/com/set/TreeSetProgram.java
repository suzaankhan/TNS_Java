package com.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
		
		Set<String> ts = new TreeSet<String>();
		Set<String> hs = new HashSet<String>();
		hs.add("Hashset");
		hs.add("Java2");
		
		System.out.println(ts.size());
		
		ts.add("Suzaan");
		ts.add("Elon musk");
		ts.add("Java");
		
		System.out.println(ts);
		System.out.println(ts.size());
		
//		ts.add(null); // cannot add null value in TreeSet
//		ts.add(null);
		
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		
		System.out.print(ts.containsAll(hs));
		
		ts.addAll(hs);
		System.out.println(ts);
		hs.add("Python");
		System.out.println(hs);
		
		System.out.println(ts.containsAll(hs));
		
		ts.removeAll(hs);
		
		System.out.println(ts);
		
		Set<Integer> obj = new TreeSet<Integer>();
		
		obj.add(1);
		obj.add(4);
		obj.add(6);
		obj.add(9);
		obj.add(15);
		obj.add(-6);
		
		System.out.println(obj);
	}
	
}
