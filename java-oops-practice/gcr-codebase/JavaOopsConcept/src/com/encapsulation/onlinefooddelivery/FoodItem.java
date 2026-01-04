package com.encapsulation.onlinefooddelivery;

//Abstract base class for all food items
public abstract class FoodItem {

 // Encapsulated fields
 private String itemName;
 private double price;
 private int quantity;

 // Constructor
 public FoodItem(String itemName, double price, int quantity) {
     this.itemName = itemName;
     this.price = price;
     this.quantity = quantity;
 }

 // Getter for price
 protected double getPrice() {
     return price;
 }

 // Getter for quantity
 protected int getQuantity() {
     return quantity;
 }

 // Concrete method to display item details
 public void getItemDetails() {
     System.out.println("Item: " + itemName);
     System.out.println("Quantity: " + quantity);
 }

 // Abstract method to calculate total price
 public abstract double calculateTotalPrice();
}

