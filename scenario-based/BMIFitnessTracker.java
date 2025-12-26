/*
Problem 2: Maya’s BMI Fitness Tracker

Maya is a fitness coach who wants to calculate BMI for her clients.

Write a Java program that takes height and weight as input, calculates BMI using the formula BMI = weight / (height * height), and prints the BMI category as Underweight, Normal, or Overweight using if-else conditions. 
Use meaningful variable names and proper comments to maintain clean code.
*/

import java.util.Scanner;

public class BMIFitnessTracker {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Taking height input in meters
        System.out.print("Enter height in meters: ");
        double heightInMeters = sc.nextDouble();

        // Taking weight input in kilograms
        System.out.print("Enter weight in kilograms: ");
        double weightInKg = sc.nextDouble();

        // Calculating BMI using the formula
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Display calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Checking BMI category using if-else conditions
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } 
        else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } 
        else {
            System.out.println("BMI Category: Overweight");
        }

        // Closing scanner object
        sc.close();
    }
}
