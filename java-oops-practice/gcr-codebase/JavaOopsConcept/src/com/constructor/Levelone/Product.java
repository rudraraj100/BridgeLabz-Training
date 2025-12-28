package com.constructor.levelone;

public class Product {
	// attributes
	String productName;
	double price;
	
	// total product count
	static int totalProducts = 0;
	
	// parameterized constructor
	Product(String productName , double price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	// detail product details
	void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println();
    }
	// method to display total products
	static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

}
