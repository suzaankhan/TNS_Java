package com.assignment11;

public class Main {

	public static void main(String[] args) {
		
		Product prd1 = new Product("123", "Laptop", 45000);
		Product prd2 = new Product("4578", "Microwave", 25000);
		Product prd3 = new Product("4889", "Washing Machine", 18570);
		
		Inventory<Product> productInventory1 = new Inventory<Product>();
		
		productInventory1.addProduct(prd1);
		productInventory1.addProduct(prd2);
		productInventory1.addProduct(prd3);
		
		productInventory1.displayProducts();
		
		System.out.println("Adding a new product now-------------");
		Product prd4 = new Product("965", "Frying Pan", 1500);
		
		productInventory1.addProduct(prd4);
		
		productInventory1.displayProducts();
		
		System.out.println("Removing two products now---------------");
		productInventory1.removeProduct(prd1);
		productInventory1.removeProduct(prd4);
		
		productInventory1.displayProducts();
		
		System.out.println("Removing product by its ID-------------");
		productInventory1.removeByID("4889");
		productInventory1.removeByID("1122");
		
		System.out.println("Displaying the products now-------------");
		productInventory1.displayProducts();
		
		SmartPhone smt1 = new SmartPhone("659", "Iphone 14", 62000, 1.5f);
		
		System.out.println("Added Smartphone---------------");
		productInventory1.addProduct(smt1);
		productInventory1.displayProducts();
	}
	
}
