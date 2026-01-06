package com.day3.swiftcart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.println("Welcome to SwiftCart");
        System.out.println("How many products do you want to add?");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {

            System.out.println("\nProduct " + i + " details");

            System.out.println("Enter product name:");
            String name = sc.nextLine();

            System.out.println("Enter product price:");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter product category:");
            String category = sc.nextLine();

            System.out.println("Enter product type (1 = Perishable, 2 = Non-Perishable):");
            int type = sc.nextInt();

            System.out.println("Enter quantity:");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product;

            // Inheritance + polymorphism
            if (type == 1) {
                product = new PerishableProduct(name, price, category);
            } else {
                product = new NonPerishableProduct(name, price, category);
            }

            // Only Cart updates price (encapsulation)
            cart.addProduct(product, quantity);
        }

        // Apply discount (polymorphic behavior)
        cart.applyDiscount();

        // Generate final bill
        System.out.println();
        cart.generateBill();

        sc.close();
    }
}
