package com.day5.bookbazaar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        ArrayList<Book> inventory = new ArrayList<>();

        inventory.add(new EBook("Atomic Habits", "James Clear", 500, 10));
        inventory.add(new PrintedBook("Wings of Fire", "A P J Abdul Kalam", 350, 5));
        inventory.add(new PrintedBook("The Blue Umbrella", "Ruskin Bond", 250, 8));

        // Apply discounts once
        for (Book b : inventory) {
            ((IDiscountable) b).applyDiscount();
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book name: ");
        String name = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        Book selected = null;

        //  Search by name
        for (Book b : inventory) {
            if (b.getTitle().equalsIgnoreCase(name)) {
                selected = b;
                break;
            }
        }

        if (selected == null) {
            System.out.println("Book not found");
        } else {
            Order order = new Order(selected, qty);
            order.confirmOrder();
            order.show();
        }

        sc.close();
    }
}
