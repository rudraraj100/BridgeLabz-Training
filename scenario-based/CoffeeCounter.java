/*
Problem 1: The Coffee Counter Chronicles

Ravi runs a café where customers order different types of coffee with specific quantities.

Write a Java program that asks the user for the coffee type using switch, accepts quantity, 
calculates the total bill using price multiplied by quantity, adds GST using arithmetic operators, and 
continues serving customers using a while loop. The program should stop when the user types “exit”.

*/

import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Constant for GST rate (5%)
        final double GST_RATE = 0.05;

        // While loop to serve multiple customers
        while (true) {

            // Ask user for coffee type
            System.out.println("\nEnter coffee type (Espresso / Latte / Cappuccino / Americano)");
            System.out.println("Type 'exit' to stop serving customers:");
            String coffeeType = sc.nextLine();

            // Exit condition to stop the program
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Cafe closed. Thank you for visiting ☕");
                break;
            }

            // Ask for quantity
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            // Clear buffer after taking integer input
            sc.nextLine();

            // Variable to store price of coffee
            double price = 0;

            // Switch statement to decide price based on coffee type
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 100;
                    break;

                case "latte":
                    price = 150;
                    break;

                case "cappuccino":
                    price = 180;
                    break;

                case "americano":
                    price = 120;
                    break;

                // If coffee type is invalid
                default:
                    System.out.println("Invalid coffee type ❌");
                    continue; // Skip current iteration
            }

            // Calculate total cost without GST
            double total = price * quantity;

            // Calculate GST amount
            double gst = total * GST_RATE;

            // Calculate final bill amount
            double finalBill = total + gst;

            // Display bill details
            System.out.println("Base Amount: ₹" + total);
            System.out.println("GST (5%): ₹" + gst);
            System.out.println("Total Bill: ₹" + finalBill);
        }

        // Close the scanner object
        sc.close();
    }
}
