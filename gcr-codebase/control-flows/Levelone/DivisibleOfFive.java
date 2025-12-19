/*
Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5?
*/

import java.util.Scanner;

// Create class DivisibleOfFive that represents any number is divisible by 5
public class DivisibleOfFive{
   public static void main(String[] args){
      
	  // Create scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // Accept the number from the user and assign it int data type
	  System.out.println("Input a number");
	  int number = sc.nextInt();
	  
	  
	  // Display the result in true or false
	  System.out.println("Is the number " + number + " divisible by 5? " + ( number % 5 == 0));
	  
	  // close the scanner stream
	  sc.close();
	}
}	
	  