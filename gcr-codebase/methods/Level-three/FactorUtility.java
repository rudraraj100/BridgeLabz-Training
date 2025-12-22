/*
Write a program to find the factors of a number and perform various tasks using the factors array
Hint => 
Method to find factors of a number and return them as an array. Note there are 2 for loops: one for the count and another for finding the factor and storing in the array
Method to find the greatest factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find the product of the cube of the factors using the factors array. Use Math.pow() 
*/

import java.util.Scanner;

public class FactorUtility {
       
    // Method to find factors and return array
    public static int[] findFactors(int number) {
          
        // First loop to count factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
          
        // Create array
        int[] factors = new int[count];
        int index = 0;
           
        // Second loop to store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
            
        return factors;
    }
          
    // Method to find greatest factor
    public static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int f : factors) {
            if (f > max) {
                max = f;
            }
        }
        return max;
    }
         
    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
        
    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }
          
    // Method to find product of cube of factors
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
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
        
        // Display the result		
        System.out.println("\n\nGreatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
         // close scanner 
        sc.close();
    }
}