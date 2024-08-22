package com.mapprograms;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {

	public static void main(String[] args) {
		
		Map<Integer, String> map =  new HashMap<>();
		
		map.put(1, "Suzaan");
		map.put(2, "Gates");
		map.put(3, "Saboo");
		map.put(4,  "Mira road");
		
		System.out.println(map);
		
		map.remove(2);
		System.out.println(map);
		
		System.out.println(map.size());
		
		System.out.println(map.get(4));
		System.out.println(map.isEmpty());
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key:"+entry.getKey() + "  "+ "Value: " + entry.getValue());
		}
		
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("Saboo"));
		
		map.clear();
		
		map.put(1, "Suzaan" );
		map.put(2,  "Ajay");
		map.put(null, null);
		map.put(null, "Value");
		map.put(null, "NEw value"); // null key value gets over written
		map.put(3,  null);
		
		System.out.println(map);
		
	}
	
}
