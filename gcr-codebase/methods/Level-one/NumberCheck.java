/*
Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. 
Write a Method to return -1 for negative number, 1 
for positive number and 0 if number is zero
*/

import java.util.*;

public class NumberCheck{

    // Method to check the number
	public static int valueReturn(int n){
		
		
		if( n > 0){
			return 1;
		}
		 else if( n == 0){
			return 0;
		}
		else{
			return -1;
		}
		 
	}
	public static void main(String[] args){
		// Accepting input and read with scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int number = valueReturn(n);
		
		// Display the result
		System.out.println("The return value: " + number);
		
		// close scanner
		sc.close();
	}
}	