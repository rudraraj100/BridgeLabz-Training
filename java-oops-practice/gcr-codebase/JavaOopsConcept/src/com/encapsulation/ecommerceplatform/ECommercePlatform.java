package com.encapsulation.ecommerceplatform;

import java.util.*;

//Main class to test polymorphism
public class ECommercePlatform {

 // Polymorphic method to calculate final price
 public static void printFinalPrice(List<Product> products) {

     for (Product product : products) {

         double tax = 0;

         // Tax applied only if product is Taxable
         if (product instanceof Taxable) {
             tax = ((Taxable) product).calculateTax();
         }

         double discount = product.calculateDiscount();
         double finalPrice = product.getPrice() + tax - discount;

         System.out.println(product.getName() + " Final Price: ₹" + finalPrice);
     }
 }

 public static void main(String[] args) {

     List<Product> products = new ArrayList<>();

     products.add(new Electronics(101, "Laptop", 60000));
     products.add(new Clothing(102, "T-Shirt", 2000));
     products.add(new Groceries(103, "Wheat Flour", 1200));

     printFinalPrice(products);
 }
}
