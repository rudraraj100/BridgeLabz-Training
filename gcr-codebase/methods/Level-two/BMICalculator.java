/*
An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. 
For this create a program to find the BMI and display the height, weight, BMI and status of each individual

*/

import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Method to determine weight status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi > 18.4 && bmi < 25) {
            return "Normal";
        } else if (bmi > 24.9 && bmi < 40) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to take input
    public static void inputData(double[] weight, double[] height, Scanner sc) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (meters) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
        }
    }

    // Method to display results
    public static void displayBMI(double[] weight, double[] height) {
        System.out.println("\n--- BMI REPORT ---");
        for (int i = 0; i < 10; i++) {
            double bmi = calculateBMI(weight[i], height[i]);
            String status = getBMIStatus(bmi);

            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("Height: " + height[i] + " m");
            System.out.printf("BMI: %.2f%n", bmi);
            System.out.println("Status: " + status);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] weight = new double[10];
        double[] height = new double[10];

        inputData(weight, height, sc);
        displayBMI(weight, height);

        sc.close();
    }
}