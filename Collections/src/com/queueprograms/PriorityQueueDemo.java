package com.queueprograms;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		
		System.out.println(pq.isEmpty());
		
		pq.add("Mumbai");
		pq.add("Matheran");
		pq.add("Borivali");
		pq.add("Andheri");
		pq.add("Vasai");
		
		System.out.println(pq.isEmpty());
		System.out.println(pq.size());
		
		System.out.println(pq);
		
		System.out.println(pq.remove()); // gives exception if queue is empty
		System.out.println(pq.poll()); // gives null if queue is empty
		
		System.out.println(pq);
		System.out.println(pq.contains("Thane"));
		
		pq.add("Andheri");
		System.out.println(pq);
		
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
		pq2.add(6);
		pq2.add(1);
		pq2.add(3);
		pq2.add(3);
	
		System.out.println(pq2);
		
		System.out.println(pq2.peek());
		System.out.println(pq2.remove());
		
		pq2.offer(2);
		System.out.println(pq2);
		
	}
	
}
