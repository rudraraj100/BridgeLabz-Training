/*
Write a program to check whether a number is positive, negative, or zero.
Hint => 
Get integer input from the user and store it in the number variable.
If the number is positive, print positive.
If the number is negative, print negative.
If the number is zero, print zero. 
*/

import java.util.Scanner;

// create a class NumberCharacter represents if a number is positive, negative or zero
public class NumberCharacter{
   public static void main(String[] args){
      
	  // create Scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept a number as an input from the user
	  System.out.println("Input a number");
	  int number = sc.nextInt();
	  
		
		// if else if and else condition to display the number is positive, negative or zero 
		if(number > 0){
			System.out.println("The number is positive.");
		}
		else if(number == 0){
			System.out.println("The number is zero.");
		}
		else{
			System.out.println("The number is negative.");
		}
	  
	  // close scanner stream
      sc.close();
	}
}	
			
	  