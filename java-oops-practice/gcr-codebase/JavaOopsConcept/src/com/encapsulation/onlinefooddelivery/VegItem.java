package com.encapsulation.onlinefooddelivery;

//Vegetarian food item
public class VegItem extends FoodItem implements Discountable {

 public VegItem(String itemName, double price, int quantity) {
     super(itemName, price, quantity);
 }

 // Total price calculation for veg item
 @Override
 public double calculateTotalPrice() {
     return getPrice() * getQuantity();
 }

 // 10% discount on veg items
 @Override
 public double applyDiscount() {
     return calculateTotalPrice() * 0.10;
 }

 @Override
 public String getDiscountDetails() {
     return "Veg Item Discount: 10%";
 }
}

