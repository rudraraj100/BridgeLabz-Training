/*
Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint => 
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number
*/

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
           
        // create Scanner class to read input
		Scanner sc = new Scanner(System.in);
            
        // Take input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
         
        long temp = number;
        int count = 0;
          
        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Array to store digits
        int[] digits = new int[count];
        int index = 0;
             
        // Extract digits and store in array
        while (number != 0) {
            digits[index] = (int)(number % 10);
            number /= 10;
            index++;
        }
            
        // Frequency array (0–9)
        int[] frequency = new int[10];
             
        // Count frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }
          
        // Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }    
        // close scanner stream      
        sc.close();
    }
}