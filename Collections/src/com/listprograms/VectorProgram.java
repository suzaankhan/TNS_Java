package com.listprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = new Vector<Integer>();
		List<Integer> li2 = new ArrayList<Integer>();
		List<String> v = new Vector<String>();
		
		li2.add(32);
		li2.add(40);
		li.add(1);
		li.add(2);
		li.add(7);
		li.add(3);
		v.add("Hello");
		v.add("Mumbai");
		v.add( 1 ,"Thane");
		System.out.println(v);
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
