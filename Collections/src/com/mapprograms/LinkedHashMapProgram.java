package com.mapprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapProgram {

	public static void main(String[] args) {
		
		Map<Integer, String> linkedhashmap = new LinkedHashMap<>();
		linkedhashmap.put(1, "Mumbai");
		linkedhashmap.put(2,  "chennai");
		linkedhashmap.put(3,  "kolkata");
		linkedhashmap.put(4,  "assam");
		linkedhashmap.put(5,  "gujrat");
		linkedhashmap.put(6,  "Banglore");
		linkedhashmap.put(7,  "gujrat");
		
		// order is maintained
		for(Map.Entry<Integer, String> entry: linkedhashmap.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " +key + " Value: " + value);
		}
		
		// adding new entries
		linkedhashmap.put(8, "Uttar Pradesh");
		
		// updating entries
		linkedhashmap.put(7, "tamil nadu");
		linkedhashmap.put(4, "Assam Tea");
		
		System.out.println(linkedhashmap);
		
		// size and isEmpty
		System.out.println(linkedhashmap.size());
		System.out.println(linkedhashmap.isEmpty());
		
		// accessing
		System.out.println(linkedhashmap.get(7));
		System.out.println(linkedhashmap.get(5));
		
		// containsKey and containsValue
		System.out.println(linkedhashmap.containsKey(4));
		System.out.println(linkedhashmap.containsValue("Uttar Pradesh"));
		
		Map<Integer, String> test = new LinkedHashMap<>();
		test.put(1, "Mumbai");
		test.put(89, "Pune");
		
		System.out.println(test);
		
		// putAll()
		System.out.println("Adding test to linkedhashmap");
		linkedhashmap.putAll(test);
		
		System.out.println(linkedhashmap);
		
		linkedhashmap.clear();
		
		System.out.println(linkedhashmap);
		
	}
	
}
