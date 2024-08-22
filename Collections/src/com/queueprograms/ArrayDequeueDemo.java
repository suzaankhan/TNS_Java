package com.queueprograms;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.add(6);
		adq.add(1);
		adq.add(3);
		adq.add(3);
		
		System.out.println(adq);
		
		adq.addFirst(9);
		adq.addLast(15);
		
		System.out.println(adq);
		
		System.out.println(adq.peekLast());
		System.out.println(adq.peekFirst());
		
		System.out.println(adq.poll());
		System.out.println(adq.remove());
		
		System.out.println(adq);
		
		System.out.println(adq.removeFirst());
		System.out.println(adq);
		adq.addFirst(78);
		adq.addFirst(3);
		adq.addFirst(12);
		System.out.println(adq);
		
		System.out.println(adq.removeLastOccurrence(3));
		System.out.println(adq.removeFirstOccurrence(3));
		System.out.println(adq.removeFirstOccurrence(96));
		
		System.out.println(adq.offer(100));
		System.out.println(adq.offerFirst(150));
		System.out.println(adq.offerLast(620));
		adq.add(null);
		
		System.out.println(adq);
	}

}
