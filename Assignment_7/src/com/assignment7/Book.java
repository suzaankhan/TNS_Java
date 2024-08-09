package com.assignment7;

public class Book {

	private String title;
	private String author;
	private int cost;
	private int year;
	
	public Book() {
		this.author = "unknown";
		this.title = "unknown";
		this.cost = 0;
		this.year = 0;
	}
	
	public Book(String author, String title) {
		this.author = author;
		this.title = title;
		this.cost = 0;
		this.year = 0;
	}
	
	public Book(String author, String title, int cost, int year) {
		this.author = author;
		this.title = title;
		this.cost = cost;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", cost=" + cost + ", year=" + year + "]";
	}
	
	
}
