/*
Basic Calculator:
○ Write a program that performs basic mathematical operations (addition,
subtraction, multiplication, division) based on user input.
○ Each operation should be performed in its own function, and the program should
prompt the user to choose which operation to perform.
*/

import java.util.Scanner;

public class BasicCalculator {

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Choose an operation (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result = 0;

        switch (choice) {
            case 1 -> result = add(num1, num2);
            case 2 -> result = subtract(num1, num2);
            case 3 -> result = multiply(num1, num2);
            case 4 -> result = divide(num1, num2);
            default -> System.out.println("Invalid choice!");
        }

        if (choice >= 1 && choice <= 4) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
