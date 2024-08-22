package com.listprograms;

import java.util.ArrayList;
import java.util.Stack;

public class StackPrograms {
	
	public static void main(String[] args) {
		
		Stack<Integer> stk = new Stack<Integer>();
		Stack<Integer> stk2 = new Stack<Integer>();
		stk2.add(5121);
		stk2.add(41599);
		
		stk.push(1);
		stk.push(2);
		stk.push(3);
		stk.push(4);
		stk.push(78);
		
		System.out.println(stk.peek());
		System.out.println(stk.pop());
		System.out.println(stk.capacity());
		System.out.println(stk.size());
		System.out.println(stk.addAll(stk2));
		
		System.out.println(stk);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(6);
		arr.add(41);
		ArrayList<Integer> clone = (ArrayList<Integer>) arr.clone();
		System.out.println("Clone testing below, Stack above");
		System.out.println(arr);
		System.out.println(clone);
		clone.set(1, 526);
		System.out.println(arr);
		System.out.println(clone);
		
	}

}
