package com.day7.FoodLoop;

public class VegItem extends FoodItem {
	

	public VegItem(String name, double price, int stock) {
		super(name, "Veg", price, stock);
	}

	@Override
	public double applyDiscount(double total) {
		if(total >= 500) {
		double discount = total * 0.2;
		total -= discount;
		return total;
		}else {
			System.out.println("Your order is not eligible for discount");
			return total;
		}
	}
	
	
	
	

}



