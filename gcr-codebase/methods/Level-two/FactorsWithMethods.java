/*
Create a program to find the factors of a number taken as user input, 
store the factors in an array, and display the factors. Also find the sum, 
sum of square of factors and product of the factors and display the results
*/

import java.util.Scanner;

public class FactorsWithMethods {

    // Method to find and return factors
    public static int[] findFactors(int number) {

        int count = 0;

        // Count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to calculate sum of factors
    public static int getSum(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to calculate sum of squares of factors
    public static int getSumOfSquares(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f * f;
        }
        return sum;
    }

    // Method to calculate product of factors
    public static long getProduct(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.println("\nFactors of " + number + ":");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\n\nSum of factors: " + getSum(factors));
        System.out.println("Sum of squares of factors: " + getSumOfSquares(factors));
        System.out.println("Product of factors: " + getProduct(factors));

        sc.close();
    }
}