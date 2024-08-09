package com.iteratorvslistiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("watermelon");
		fruits.add("orange");
		fruits.add("pineapple");
		fruits.add("dragon fruit");
		
		ListIterator<String> itr = fruits.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Now going reverse-------------");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		System.out.println("Adding and modiftying stuffs");

		// adding elements 
		itr.add("Gulab Jamun");
		itr.add("Pear");
		System.out.println(fruits);
		
		itr = fruits.listIterator();
		// modifying elements
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
			if(element.equals("banana")) {
				itr.set("musk melon");
				System.out.println(element + " was removed and musk melon was added");
			}
		}
		
		// doing backward iteration
		
		while(itr.hasPrevious()) {
			String element = itr.previous();
			System.out.println(element);
			if(element.equals("musk melon")) {
				itr.set("banana");
				System.out.println(element + " removed , banana added");
			}
		}
		
		// accessing nextIndex() and previousIndex()
		
		while(itr.hasNext()) {
			System.out.println("Next index is " + itr.nextIndex());
			System.out.println("Previous index is " + itr.previousIndex());
			itr.next();
		}
		
	}

}
