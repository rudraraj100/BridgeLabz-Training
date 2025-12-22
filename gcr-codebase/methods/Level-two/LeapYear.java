/*
Write a program that takes a year as input and outputs the Year is a Leap Year or not 
*/

import java.util.Scanner;

public class LeapYear{
     // Method to check whether year is a leap year
	public static void isLeapYear(int y){
	     // Display result in main method
		if ( y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
			System.out.println("It is a leap year.");
	   }
         
		else {
			System.out.println("It is not a leap year.");
		}
	}

	public static void main(String[] args){
		// Accepting input and read through scanner class
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the year: ");
		int y = sc.nextInt();
		
        isLeapYear(y);
		// Close scanner
		sc.close();
	}	
}			