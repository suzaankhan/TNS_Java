package com.listprograms;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListProgram {

	public static void main(String[] args) {
		
		List<Integer> li = new LinkedList<Integer>();
		List<Integer> li2 = new Vector<Integer>();
		
		li2.add(32);
		li2.add(653);
		li.add(1);
		li.add(2);
		li.add(7);
		li.add(31);
		
		System.out.println(li);
		li.clear();
		
		li.add(1);
		li.add(2);
		li.add(65);
		li.add(3);
	
		System.out.println(li.indexOf(7));
		
		li.add(20);
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
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.addFirst(7);
		linkedlist.addFirst(78);
		linkedlist.add(1, 8);
		linkedlist.addLast(100);
		System.out.println(linkedlist.peek());
		LinkedList<Integer> cloneli = (LinkedList<Integer>) linkedlist.clone();
//		cloneli.clear();
//		System.out.println(li.get(1)); // gives error
		System.out.println(linkedlist.remove(Integer.valueOf(100)));
		System.out.println(linkedlist.peek());
		System.out.println(linkedlist.poll());
		System.out.println(linkedlist.pollLast());
		linkedlist.addLast(120);
		linkedlist.addFirst(45);
		System.out.println(linkedlist);
		System.out.println(cloneli);
		
		
	}
	
}
