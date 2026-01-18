package com.generics.onlinemarketplace;

public class Main {
    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory("Education"));
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 1200, new ClothingCategory("Men Wear"));
        Product<GadgetCategory> phone = new Product<>("iPhone", 80000, new GadgetCategory("Apple"));

        Catalog catalog = new Catalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("Before Discount:");
        catalog.displayCatalog();

        DiscountUtils.applyDiscount(book, 10);
        DiscountUtils.applyDiscount(phone, 5);

        System.out.println("\nAfter Discount:");
        catalog.displayCatalog();
    }
}
