package com.generics.onlinemarketplace;

public class DiscountUtils {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
       
    	product.price -= (product.price * percentage / 100);
        
    	System.out.println("Discount applied. New price of " + product.name + ": " + product.price);
    }
}
