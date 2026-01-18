package com.generics.smartwarehouse;

public class Groceries extends WarehouseItem {

	 String expiryDate;

	 public Groceries(String name, double price, String expiryDate) {
	        super(name, price);
	        this.expiryDate = expiryDate;
	    }

	 public void displayDetails() {
	        System.out.println("Groceries: " + name + ", Price: " + price + ", Expiry: " + expiryDate);
	 }
}
