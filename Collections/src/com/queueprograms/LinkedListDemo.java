package com.queueprograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		
		System.out.println(q.isEmpty());
		
		q.add("Mumbai");
		q.add("Matheran");
		q.add("Borivali");
		q.add("Andheri");
		q.add("Vasai");
		
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		
		List<String> li = new ArrayList<>();
		li.add("Mira road");
		li.add("Dahisar");
		
		q.addAll(li);
		System.out.println(li);
		System.out.println(q);
		
		System.out.println(q.contains("Mira road"));
		System.out.println(q.containsAll(li));
		
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.remove("Andheri"));
		System.out.println(q);
		
		System.out.println(q.poll());
		q.offer("Japan");
		System.out.println(q);
		
		LinkedList<String> dq = (LinkedList<String>) q;
		
		System.out.println(dq);
		
		dq.addFirst("Mumbai");
		dq.addLast("Thane");
		
		System.out.println(dq.getFirst());
		System.out.println(dq.getLast());
		
		System.out.println(dq);
		
		dq.removeFirst();
		dq.removeLast();
		
		System.out.println(dq);
		
		LinkedList<Integer> pq2 = new LinkedList<Integer>();
		pq2.add(6);
		pq2.add(1);
		pq2.add(3);
		pq2.add(3);
		pq2.add(null);
		System.out.println(pq2);
		System.out.println(pq2.get(2));
		
		
	}
	
}
