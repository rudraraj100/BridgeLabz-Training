package com.encapsulation.onlinefooddelivery;

//Non-vegetarian food item with extra charges
public class NonVegItem extends FoodItem implements Discountable {

 private static final double NON_VEG_CHARGE = 50; // extra charge per item

 public NonVegItem(String itemName, double price, int quantity) {
     super(itemName, price, quantity);
 }

 // Total price including non-veg charges
 @Override
 public double calculateTotalPrice() {
     return (getPrice() * getQuantity()) + (NON_VEG_CHARGE * getQuantity());
 }

 // 5% discount on non-veg items
 @Override
 public double applyDiscount() {
     return calculateTotalPrice() * 0.05;
 }

 @Override
 public String getDiscountDetails() {
     return "Non-Veg Item Discount: 5%";
 }
}
