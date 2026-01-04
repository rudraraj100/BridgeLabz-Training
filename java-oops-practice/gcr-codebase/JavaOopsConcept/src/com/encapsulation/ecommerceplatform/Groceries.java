package com.encapsulation.ecommerceplatform;

//Grocery product with discount but no tax
public class Groceries extends Product {

 public Groceries(int productId, String name, double price) {
     super(productId, name, price);
 }

 // 5% discount on groceries
 @Override
 public double calculateDiscount() {
     return getPrice() * 0.05;
 }
}
