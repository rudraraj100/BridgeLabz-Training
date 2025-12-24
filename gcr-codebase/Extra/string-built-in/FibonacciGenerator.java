/*
Fibonacci Sequence Generator:
○ Write a program that generates the Fibonacci sequence up to a specified number
of terms entered by the user.
○ Organize the code by creating a function that calculates and prints the Fibonacci
sequence.
*/

import java.util.Scanner;

public class FibonacciGenerator {

    // Method to generate and print Fibonacci sequence
    public static void generateFibonacci(int terms) {

        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int first = 0;
        int second = 1;

        // Print Fibonacci sequence
        System.out.print("Fibonacci sequence: ");

        for (int i = 1; i <= terms; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        // Call Fibonacci generator method
        generateFibonacci(terms);

        sc.close();
    }
}
