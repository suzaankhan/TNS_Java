package com.lambdaexpression;

import java.util.ArrayList;

public class LambdaDemo {

	public static void main(String[] args) {
	
//		Cube c = (a) -> {
//			return a*a*a;
//		};
		
//		System.out.println(c.cal(5));
		
		Cube m = (a,b) -> { return (a>b) ? a : b;};
		
		System.out.println(m.max(5,7));
		
		ArrayList<Integer> li = new ArrayList<Integer>();
		
		li.add(5);
		li.add(8);
		li.add(56);
		
		li.forEach(element -> System.out.println(element));
	}

	
	
}
