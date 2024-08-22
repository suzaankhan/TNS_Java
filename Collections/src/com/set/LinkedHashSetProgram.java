package com.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		
		Set<String> lhs = new LinkedHashSet<String>();
		List<String> l = new ArrayList<String>();
		l.add("orange");
		l.add("melon");
		
		System.out.println(lhs.size());
		
		lhs.add("Banana");
		lhs.add("apple");
		lhs.add("cherry");
		lhs.add("watermelon");
		
		System.out.println(lhs);
		
		System.out.println(lhs.size());
		
		lhs.remove("cherry");
		System.out.println(lhs);
		System.out.println(l);
		
		System.out.println(lhs.isEmpty());
		
		System.out.println(lhs.containsAll(l));
		lhs.addAll(l);
		System.out.println(lhs);
		System.out.println(lhs.containsAll(l));
		lhs.removeAll(l);
		System.out.println(lhs);
		System.out.println(lhs.containsAll(l));
	}
	
}
