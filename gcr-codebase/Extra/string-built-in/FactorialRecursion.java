/*
Factorial Using Recursion:
○ Write a program that calculates the factorial of a number using a recursive
function.
○ Include modular code to separate input, calculation, and output processes.
*/

import java.util.Scanner;

public class FactorialRecursion {

    // Method to calculate factorial using recursion
    public static long factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }

    // Method to take user input
    public static int getInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Method to display output
    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = getInput(sc);
        long result = factorial(number);
        displayResult(number, result);

        sc.close();
    }
}
