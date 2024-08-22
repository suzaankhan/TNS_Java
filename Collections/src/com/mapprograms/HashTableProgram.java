package com.mapprograms;

import java.util.Hashtable;
import java.util.Map;

public class HashTableProgram {

	public static void main(String[] args) {
		
		Map<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(1, "Mumbai");
		hashtable.put(2,  "chennai");
		hashtable.put(3,  "kolkata");
		hashtable.put(4,  "assam");
		hashtable.put(5,  "gujrat");
		hashtable.put(6,  "Banglore");
		
		System.out.println(hashtable);
		
		System.out.println(hashtable.get(3));
		System.out.println(hashtable.get(2));
		
		System.out.println("Is EMpty? "+hashtable.isEmpty());
		System.out.println("Size = "+hashtable.size());
		
		hashtable.remove(5);
		hashtable.remove(3);
		
		System.out.println("After removing---------------");
		System.out.println(hashtable);
		
		// updating values
		hashtable.put(2, "Madhya Pradesh");
		hashtable.put(1,  "Navi mumbai");
		
		// adding null key and values
//		hashtable.put(null, null); // error since hashtable doesnt take null key or values
		
		hashtable.forEach((key, value) -> System.out.println(key + " " + value));
		
		Map<Integer, String> test = new Hashtable<>();
		test.put(78,  "India");
		test.put(4, "Bhopal");
		
		hashtable.putAll(test);
		System.out.println(hashtable);
		
		System.out.println(hashtable.get(78));
		
		System.out.println(hashtable.containsKey(5));
		System.out.println(hashtable.containsValue("Bhopal"));
		
		for(Map.Entry<Integer, String> entry: hashtable.entrySet()) {
			System.out.println("Key : "+entry.getKey());
			System.out.println("Value : "+entry.getValue());
		}
	}
	
}
