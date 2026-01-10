package com.day7.FoodLoop;

public class Main {

	public static void main(String[] args) {
		
		 FoodItem veg = new VegItem("Paneer", 300, 5);
	        FoodItem nonVeg = new NonVegItem("Chicken", 400, 3);

	        Order order = new Order();
	        order.addItem(veg);
	        order.addItem(nonVeg);

	        order.placeOrder();

	}

}
