package com.assignment11;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends Product> {

	private List<T> productList; // List is an interface
	
	public Inventory() {
		productList = new ArrayList();
	}
	
	public void addProduct(T product) {
		productList.add(product);
	}
	
	public void removeProduct(T product) {
		productList.remove(product);
	}
	
	public void removeByID(String id) {
		boolean hadId = false;
		for(T product: productList) {
			if(product.getId() == id) {
				productList.remove(product);
				System.out.println("Product with id " + id+ " removed successfully");
				hadId = true;
				return;
			}
		}
		System.out.println("No product has such ID");
	}
	
	public void displayProducts() {
		for(T product: productList) {
			System.out.println(product.toString());
		}
	}
}
