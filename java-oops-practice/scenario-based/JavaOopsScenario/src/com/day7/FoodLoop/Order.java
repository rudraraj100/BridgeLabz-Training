package com.day7.FoodLoop;

import java.util.ArrayList;

public class Order implements IOrderable {
	private double total = 0;
	private ArrayList<FoodItem> items = new ArrayList<>();
	
	
	public void addItem(FoodItem item) {
		if(item.isAvailability()) {
			items.add(item);
			total += item.getPrice();
			
			item.reduceStock();
		}
	}
	@Override
	public void placeOrder() {
		
		double finalTotal = total;
		for(FoodItem item : items) {
			finalTotal = item.applyDiscount(finalTotal);
		}
		System.out.println("Order placed. Total = " + finalTotal); 
		
	}
	
	@Override
	public void cancelOrder() {
		items.clear();
		total = 0;
		System.out.println("Ordeer cancelled.");
	}
	

}
;