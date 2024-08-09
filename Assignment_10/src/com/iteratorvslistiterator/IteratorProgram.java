package com.iteratorvslistiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorProgram {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("watermelon");
		fruits.add("orange");
		fruits.add("pineapple");
		fruits.add("dragon fruit");
		
		Iterator<String> itr = fruits.iterator();
		
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
			if(element.equals("pineapple")) {
				itr.remove();
				System.out.println(element + " was removed");
			}
		}
		
		System.out.println(fruits);
		
		itr.remove();
		
		System.out.println("itr.remove() was performed");
		
//		itr.remove();  // this will again give error because we
//		cannot use remove() for current itr state again, we can only 
//		use remove() once per call to next
		System.out.println(fruits);
	}
	
}
