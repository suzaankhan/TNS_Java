package com.assignment7;

public class Main {
	
	public static void main(String[] args) {
		
		Book bk_one = new Book();
		Book bk_two = new Book("James Will", "Theory of evolution");
		Book bk_three = new Book("William", "Time and Life", 260, 2001);
		
		System.out.println(bk_one);
		System.out.println(bk_two);
		System.out.println(bk_three);
		
	}
	
}
