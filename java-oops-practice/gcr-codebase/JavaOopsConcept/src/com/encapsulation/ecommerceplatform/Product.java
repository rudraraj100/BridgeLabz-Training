package com.encapsulation.ecommerceplatform;

//Abstract base class for all products
public abstract class Product {
	
	// Encapsulated fields
	
	private int productId;
	private String name;
	private double price;
	
	// Constructor for initializing product
	
	public Product(int productId, String name, double price) {
		
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	// Getter for price
	 public double getPrice() {
	        return price;
	    }
	 
	// Setter to update price safely
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	// Getter for product name
	public String getName() {
		return name;
	}
	
	// Abstract method to be implemented by subclasses
	
	public abstract double calculateDiscount();
	

}
