/*
Rewrite program 14 using for loop
Hint => 
Take the integer input, check for natural number and 
determine the factorial using for loop and 
finally print the result. 
*/

import java.util.Scanner;

// create a class FactorialSum to calculate the factorial of user define input
public class FactorialSumUsingFor{
   public static void main(String[] args){
      
	  // create a scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept an input from user and assign it int type and create a factorial variable
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  int factorial = 1;
	    
        // if else statement use to check if it is a natural number		
		if (n <= 0){
			
			System.out.println("Its not a natural number");
		}
		else{
			
			// apply for loop to get factorial of the given input
			for (int i = 1; i <= n ; i++){
			factorial = factorial * i;
			
			}	
		}
		
		// display the result
		System.out.println(factorial);
	
      // close scanner stream	
      sc.close();
	}
}	