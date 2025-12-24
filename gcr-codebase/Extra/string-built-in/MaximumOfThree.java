/*
Maximum of Three Numbers:
○ Write a program that takes three integer inputs from the user and finds the
maximum of the three numbers.
○ Ensure your program follows best practices for organizing code into modular
functions, such as separate functions for taking input and calculating the
maximum value.
*/

import java.util.Scanner;

public class MaximumOfThree {

    // Method to take an integer input from the user
    public static int takeInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    // Method to find the maximum of three numbers
    public static int findMaximum(int a, int b, int c) {

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max; // Return the maximum value
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take inputs
        int num1 = takeInput(sc, "Enter first number: ");
        int num2 = takeInput(sc, "Enter second number: ");
        int num3 = takeInput(sc, "Enter third number: ");

        // Find maximum
        int max = findMaximum(num1, num2, num3);

        // Display result
        System.out.println("Maximum of the three numbers is: " + max);

        sc.close();
    }
}
