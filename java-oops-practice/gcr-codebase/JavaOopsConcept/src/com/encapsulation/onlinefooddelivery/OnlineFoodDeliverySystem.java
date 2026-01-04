package com.encapsulation.onlinefooddelivery;

import java.util.*;

//Main class demonstrating polymorphism
public class OnlineFoodDeliverySystem {

 // Polymorphic order processing method
 public static void processOrder(List<FoodItem> orderItems) {

     double grandTotal = 0;

     for (FoodItem item : orderItems) {

         item.getItemDetails();

         double totalPrice = item.calculateTotalPrice();
         double discount = 0;

         if (item instanceof Discountable) {
             discount = ((Discountable) item).applyDiscount();
         }

         double finalPrice = totalPrice - discount;
         grandTotal += finalPrice;

         System.out.println("Final Price: ₹" + finalPrice);
         System.out.println("------------------------------");
     }

     System.out.println("Grand Total Amount: ₹" + grandTotal);
 }

 public static void main(String[] args) {

     List<FoodItem> order = new ArrayList<>();

     order.add(new VegItem("Paneer Butter Masala", 250, 2));
     order.add(new NonVegItem("Chicken Biryani", 300, 1));

     processOrder(order);
 }
}
