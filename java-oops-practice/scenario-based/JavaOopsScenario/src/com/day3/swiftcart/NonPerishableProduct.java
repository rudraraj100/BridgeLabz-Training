package com.day3.swiftcart;

//Non-perishable products like rice, oil
public class NonPerishableProduct extends Product {

 public NonPerishableProduct(String name, double price, String category) {
     super(name, price, category);
 }

 // Lower discount
 @Override
 public double getDiscount() {
     return 0.05; // 5% discount
 }
}

