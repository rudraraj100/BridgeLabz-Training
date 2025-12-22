/*
Write a program to find the sum of n natural numbers 
using recursive method and compare the result 
with the formulae n*(n+1)/2 and show 
the result from both computations 
is correct. 
*/

import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to calculate sum
    public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + recursiveSum(n - 1);
    }

    // Formula method
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Accept input from user 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int sumByRecursion = recursiveSum(n);
        int sumByFormula = formulaSum(n);

        System.out.println("\nSum using Recursion: " + sumByRecursion);
        System.out.println("Sum using Formula: " + sumByFormula);
        
		// Comparision between both method
        if (sumByRecursion == sumByFormula) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results do not match.");
        }
        
        //close scanner stream		
        sc.close();
    }
}