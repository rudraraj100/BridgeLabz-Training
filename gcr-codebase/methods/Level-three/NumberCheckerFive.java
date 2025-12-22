/*
Extend or Create a NumberChecker utility class and perform following task. 
Call from main() method the different methods and display results. 
Make sure all are static methods
*/

import java.util.Scanner;

public class NumberCheckerFive {
       
    // Method to check Perfect Number
    public static boolean isPerfect(int num) {
        int sum = 0;
         
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
      
    // Method to check Abundant Number
    public static boolean isAbundant(int num) {
        int sum = 0;
          
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }
      
    // Method to check Deficient Number
    public static boolean isDeficient(int num) {
        int sum = 0;
         
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum < num;
    }
          
    // Method to calculate factorial
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }
       
    // Method to check Strong Number
    public static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;
          
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }
         
    // Main Method
    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
          
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
         // Display results 
        System.out.println("\nRESULTS:");
          
        System.out.println("Perfect Number: " + isPerfect(number));
        System.out.println("Abundant Number: " + isAbundant(number));
        System.out.println("Deficient Number: " + isDeficient(number));
        System.out.println("Strong Number: " + isStrong(number));
         // close scanner
        sc.close();
    }
}
