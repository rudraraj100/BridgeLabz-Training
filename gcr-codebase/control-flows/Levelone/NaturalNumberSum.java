/*
Write a program to check for the natural number and write the sum of n natural numbers 
Hint => 
A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
A sum of n natural numbers is n * (n+1) / 2 
I/P => number
O/P => If the number is a positive integer then the output is
The sum of ___ natural numbers is ___
Otherwise 
The number ___ is not a natural number
*/

import java.util.Scanner;

// Create class NaturalNumberSum represents the sum of n natural number
public class NaturalNumberSum{
   public static void main(String[] args){
      
      // Create a scanner class to read the input	  
	  Scanner sc = new Scanner(System.in);
	  
	  // Accept value of n from user and assign it as int value
	  System.out.println("Input the value of n");
	  int n = sc.nextInt();
	  
	  // Perfrom sum of n natural numbers formula
	  int sum = n * (n+1) / 2 ;
	  
		
		// apply if else statement if value of n is positive then print it's sum otherwise not a natural number
		if( n > 0 ){
			System.out.println("The sum of " + n + " natural numbers is " + sum);
		}
		else{
			System.out.println("The number " + n + " is not a natural number");
		}
	  
      // close the scanner stream 	  
	  sc.close();
	}
}	
	   
	 