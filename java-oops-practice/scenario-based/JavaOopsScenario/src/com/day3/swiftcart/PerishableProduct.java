package com.day3.swiftcart;

//Perishable products like fruits, vegetables
public class PerishableProduct extends Product {

 public PerishableProduct(String name, double price, String category) {
     super(name, price, category);
 }

 // Higher discount due to expiry
 @Override
 public double getDiscount() {
     return 0.10; // 10% discount
 }
}
