package com.mapprograms;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapProgram {

	public static void main(String[] args) {
		
		Map<Integer, String> treemap = new TreeMap<>();
		// order is maintained base upon the key
		treemap.put(5, "Mumbai");
		treemap.put(2,  "chennai");
		treemap.put(7,  "kolkata");
		treemap.put(4,  "assam");
		treemap.put(1,  "gujrat");
		treemap.put(6,  "Banglore");
		treemap.put(3,  "gujrat");
		
		System.out.println(treemap.isEmpty());
		System.out.println(treemap.size());
		
		for(Map.Entry<Integer, String> entry: treemap.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + " Value: " + value);
		}
		
//		treemap.put(null, "Matheran");// error, no null keys allowed
		System.out.println(treemap);
		// updating 
		treemap.put(1,  "Mira Road");
		treemap.put(3, "borivali");
		System.out.println("After updating---------------");
		System.out.println(treemap);
		
		// remove
		treemap.remove(6);
		treemap.remove(2);
		System.out.println("After removing---------------");
		System.out.println(treemap);
		
		// putAll()
		Map<Integer, String> test = new TreeMap<>();
		test.put(2,  "Vasai");
		test.put(98,  "Andheri");
		treemap.putAll(test);
		System.out.println("After putAll()----------------");
		System.out.println(treemap);
		
		// containsKey and containsValue
		System.out.println(treemap.containsKey(78));
		System.out.println(treemap.containsValue("borivali"));
		
		// putIfAbsent()
		treemap.putIfAbsent(45, "Dahisar");
		
		System.out.println(treemap);
		
		treemap.clear();
		
		System.out.println(treemap);
		
	}
	
}
