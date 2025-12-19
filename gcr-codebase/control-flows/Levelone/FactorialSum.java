/*
Write a Program to find the factorial of an integer entered by the user.
Hint => 
For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
Using a while loop, compute the factorial.
Print the factorial at the end.
*/

import java.util.Scanner;

// create a class FactorialSum to calculate the factorial of user define input
public class FactorialSum{
   public static void main(String[] args){
      
	  // create scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept an input from user and assign it int type and create a factorial variable
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  int factorial = 1;
	  
		// apply while loop to get factorial of the given input
		while (n != 0){
			factorial = factorial * n;
			n = n - 1;	
		}
		
		// display the result
		System.out.println(factorial);
	  
      // close scanner stream	  
      sc.close();
	}
}	