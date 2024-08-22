package com.arraysAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,3};
		int size = 0;
		
		// Does not works in java
//		for(int i = 0 ; arr[i] != '\0'; i++) {
//			size++;
//		}
		
		System.out.println("Size of array is " + size);
		size=0;
		for(int ele : arr) {
			size++;
		}
		System.out.println("Size of array is " + size);
		System.out.println(arr.length);
		
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,6,8));
		
		a.add(78);
		a.add(54);
		
		System.out.println(a);
		
		int[] b = {2,4,6,8};
//		List<Integer> k = Arrays.asList(b);
		List<Integer> temp = Arrays.asList(2,3,5,7,8);
		System.out.println(temp);
		
		List<Double> tempdob = List.of(4.2,6.03,8.02,434.034,4.3);
		System.out.println(tempdob);
	}
	
}





















