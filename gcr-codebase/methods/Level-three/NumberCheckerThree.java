/*
Extend or Create a NumberChecker utility class and perform following task. 
Call from main() method the different methods and display results. Make sure all are static methods
 
*/

import java.util.Scanner;
import java.util.Arrays;

public class NumberCheckerThree {
     
    // Method to count digits
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
      
    // Method to store digits in array
    public static int[] storeDigits(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
       
    // Method to reverse digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
     
    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
           
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
        
    // Method to check palindrome number
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }
       
    // Method to check duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
        
    // Main method
    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
           
        int[] digits = storeDigits(number);
        int[] reversed = reverseArray(digits);
         // display the result 
        System.out.println("\nDigits Array: " + Arrays.toString(digits));
        System.out.println("Reversed Digits Array: " + Arrays.toString(reversed));
          
        System.out.println("\nCount of digits: " + countDigits(number));
        System.out.println("Arrays Equal: " + compareArrays(digits, reversed));
             
        System.out.println("Palindrome Number: " + isPalindrome(number));
        System.out.println("Duck Number: " + isDuckNumber(digits));
         // close scanner  
        sc.close();
    }
}
