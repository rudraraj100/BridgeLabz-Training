/*
Write a Program to check if the given number is a prime number or not
Hint => 
A number that can be divided exactly only by itself and 1 are Prime Numbers,
Prime Numbers checks are done for numbers greater than 1
Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
Use the isPrime boolean variable to store the result
*/

import java.util.Scanner;

// create class PrimeNumber represents the number is prime number or not
public class PrimeNumber{
   public static void main(String[] args){
      
	  // create scanner class to read input and accept input from user and create a boolean variable called it true
      Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  boolean isPrime = true;
	  
	  // evaluate if inumbetr is positive and greater than 1 
	  if( n > 1){
		  
		// apply an operation to identify if it not a prime number 
		for(int i = 2 ; i <= n/2 ; i++){
			
			if(n % i == 0){
				isPrime = false;
				break;	
			}
			else{
				isPrime = true;
			}	
			
		}
	  }	
	  // display the result
	  System.out.println(" Is it a prime number? " + isPrime );
		
	  // close scanner stream	
	  sc.close();	
	}
}	
	  