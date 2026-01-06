package com.day3.swiftcart;

import java.util.HashMap;
import java.util.Map;

// Cart controls all price logic
public class Cart implements ICheckout {

    private Map<Product, Integer> items; // Product + Quantity
    private double totalPrice;

    public Cart() {
        items = new HashMap<>();
        totalPrice = 0;
    }

    // Only Cart can update prices
    public void addProduct(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
        totalPrice += product.getPrice() * quantity;
    }

    // Polymorphic discount application
    @Override
    public void applyDiscount() {
        double discountAmount = 0;

        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product p = entry.getKey();
            int qty = entry.getValue();

            discountAmount += (p.getPrice() * qty) * p.getDiscount();
        }

        totalPrice = totalPrice - discountAmount;
    }

    @Override
    public void generateBill() {
        System.out.println("----- SwiftCart Bill  -----");
        System.out.println("Item\tPrice\tQty\tSubtotal");

        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            Product p = entry.getKey();
            int qty = entry.getValue();
            double subTotal = p.getPrice() * qty;

            System.out.println(
                p.getName() + "\t₹" + p.getPrice() + "\t" + qty + "\t₹" + subTotal
            );
        }

        System.out.println("----------------------------");
        System.out.println("Total Payable: ₹" + totalPrice);
    }
}

