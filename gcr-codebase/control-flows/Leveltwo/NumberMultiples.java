/*
Create a program to find all the multiples of a number taken as user input below 100.
Hint => 
Get the input value for a variable named number. Check the number is a positive integer and less than 100.
Run a for loop backward: from i = 100 to i = 1.
Inside the loop, check if i perfectly divide the number. If true, print the number and continue the loop.
*/

import java.util.Scanner;

// create a class NumberMultiples represents multiples of number taksen as input
public class NumberMultiples{
   public static void main(String[] args){
      
	  // create scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept an input from user and assign it int type
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  
	  
		// if else statement to identify the nnumber is positive and below 100
		if(n > 0 && n < 100){
			
			// apply for loop to display multiplication of number in each iteration
			for (int i = 100 ; i > 0 ; i--){
				if(n % i == 0){
					System.out.println(i);
				}
			}
		}	
		else{
			System.out.println("invalid input");
		}
      
	  // close scanner stream
      sc.close();
	}
}	