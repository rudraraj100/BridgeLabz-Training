package com.day7.FoodLoop;

public class FoodItem {
	
	private String name;
	private String category;
	private double price;
	private int stock;
	
	
	public FoodItem(String name, String category, double price, int stock) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public double getPrice() {
		return price;
	}


	public boolean isAvailability() {
		return stock > 0;
	}

	public void reduceStock() {
		stock--;
	}
	
	
	
	public double applyDiscount(double total) {
		return total;
	}

}
