/*
Write a program to take user input for 5 numbers and 
check whether a number is positive or negative. 
Further for positive numbers check if the number is even or odd. 
Finally compare the first and last elements of the array and 
display if they are equal, greater, or less
*/

import java.util.Scanner;

public class NumberAnalysis {

    // Method to take input
    public static void takeInput(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    // Method to check positive/negative and even/odd
    public static void analyzeNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                System.out.print(arr[i] + " is Positive");
                if (arr[i] % 2 == 0) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }
            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }
    }

    // Method to compare first and last elements
    public static void compareFirstLast(int[] arr) {
        int first = arr[0];
        int last = arr[arr.length - 1];

        System.out.println("\nComparison of first and last elements:");
        if (first == last) {
            System.out.println("First and Last elements are Equal");
        } else if (first > last) {
            System.out.println("First element is Greater than Last");
        } else {
            System.out.println("First element is Less than Last");
        }
    }

    public static void main(String[] args) {

        int[] numbers = new int[5];

        takeInput(numbers);
        System.out.println();
        analyzeNumbers(numbers);
        compareFirstLast(numbers);
    }
}