package com.day4.zipzipmart;

public class Sales {
	
	private String purchaseDate;
	private double price;
	
	public Sales(String purchaseDate, double price) {
		super();
		this.purchaseDate = purchaseDate;
		this.price = price;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return purchaseDate + " | " + price;
	}


	
	
	

}
