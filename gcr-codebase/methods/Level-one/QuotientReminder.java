/*
Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor) 
*/

import java.util.*;

public class QuotientReminder{
    // Method to find the reminder of the number 
	public static int findReminder(int a , int d){
		
		int reminder = a % d;
		
		return reminder;
	}
	// Method to find the quotient of the number
	public static int findQuoteint(int a , int d){
		
		int quotient = a / d;
		
		return quotient;
	}
	
	public static void main(String[] args){
		// Accepting input and read through scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the divisor: ");
		int d = sc.nextInt();
	
		int quotient = findQuoteint(a , d);
		int reminder = findReminder(a , d);
		
		// Display the result
		System.out.println("The quotient: " + quotient);
		System.out.println("The reminder: " + reminder);
		
		// close scanner
		sc.close();
		
	}
}	
	