/*
Temperature Converter:
○ Write a program that converts temperatures between Fahrenheit and Celsius. ○
The program should have separate functions for converting from Fahrenheit to
Celsius and from Celsius to Fahrenheit.
*/

import java.util.Scanner;

public class TemperatureConverter {

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (choice == 1) {
            double celsius = fahrenheitToCelsius(temp);
            System.out.printf("%.2f °F = %.2f °C%n", temp, celsius);
        } else if (choice == 2) {
            double fahrenheit = celsiusToFahrenheit(temp);
            System.out.printf("%.2f °C = %.2f °F%n", temp, fahrenheit);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
