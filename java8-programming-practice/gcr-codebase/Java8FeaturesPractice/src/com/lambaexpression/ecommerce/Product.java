package com.lambaexpression.ecommerce;

public class Product {
	
	public double price, rating, discount;

	public Product(double price, double rating, double discount) {
		
		this.price = price;
		this.rating = rating;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return " - [price=" + price + ", rating=" + rating + ", discount=" + discount + "% ]";
	}
	
	
	
	

}
