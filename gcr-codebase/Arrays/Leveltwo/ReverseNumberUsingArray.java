/*
Create a program to take a number as input and reverse the number. 
To do this, store the digits of the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order  
*/

import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
          
        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
           
        int temp = number;
        int count = 0;
           
        // Count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
            
        // Array to store digits
        int[] digits = new int[count];
          
        temp = number;
        int index = 0;
           
        // Store digits in array
        while (temp != 0) {
            digits[index] = temp % 10;
            temp = temp / 10;
            index++;
        }
             
        // Array to store reversed digits
        int[] reverse = new int[count];
            
        // Copy in reverse order
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }
              
        // Display reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }
        
        // close scanner stream		
        sc.close();
    }
}