package com.day9.ecommerceproductinventory;

public class Product {
	
	private String SKU;
	private String name;
	private String manufactureDate;
	private double price;
	
	public Product( String name, String SKU, String manufactureDate, double price) {
		
		this.SKU = SKU;
		this.name = name;
		this.manufactureDate = manufactureDate;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSKU() {
		return SKU;
	}

	public String getName() {
		return name;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}
	
	
	
	
	
	

}
