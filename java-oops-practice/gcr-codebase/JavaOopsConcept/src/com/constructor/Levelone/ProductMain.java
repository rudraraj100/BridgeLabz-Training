package com.constructor.levelone;

public class ProductMain {
	// main method to test class product
	public static void main(String[] args) {
		Product p1 = new Product( "Facewash" , 200);
		Product p2 = new Product ("Bat" , 2500);
		Product p3 = new Product("Pillow" , 300);
		
		p1.displayProductDetails();
		
		p2.displayProductDetails();
		
		// display total product
		Product.displayTotalProducts();

	}

}
