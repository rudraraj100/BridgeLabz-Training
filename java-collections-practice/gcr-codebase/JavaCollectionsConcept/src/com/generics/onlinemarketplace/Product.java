package com.generics.onlinemarketplace;

public class Product<T> {
   
	String name;
    double price;
    T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void displayProduct() {
        System.out.println("Product: " + name + ", Price: " + price + ", Category: " + category);
    }
}
