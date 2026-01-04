package com.encapsulation.onlinefooddelivery;

//Interface for food items eligible for discount
public interface Discountable {

 // Apply discount on total price
 double applyDiscount();

 // Return discount information
 String getDiscountDetails();
}
