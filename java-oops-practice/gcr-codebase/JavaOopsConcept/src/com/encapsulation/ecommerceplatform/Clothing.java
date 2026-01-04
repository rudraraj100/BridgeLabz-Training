package com.encapsulation.ecommerceplatform;

//Clothing product with tax and discount
public class Clothing extends Product implements Taxable {

 public Clothing(int productId, String name, double price) {
     super(productId, name, price);
 }

 // 20% discount on clothing
 @Override
 public double calculateDiscount() {
     return getPrice() * 0.20;
 }

 // 12% GST on clothing
 @Override
 public double calculateTax() {
     return getPrice() * 0.12;
 }

 @Override
 public String getTaxDetails() {
     return "Clothing GST: 12%";
 }
}

