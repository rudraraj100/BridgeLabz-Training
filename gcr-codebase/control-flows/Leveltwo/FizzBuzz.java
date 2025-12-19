/*
Write a program FizzBuzz, take a number as user input, and 
check for a positive integer. If positive integer, loop and 
print the number, but for multiples of 3 print "Fizz" instead of the number, 
for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
Hint => 
Take the user input number, check for a positive integer, and use for loop to display
*/

import java.util.Scanner;

// create a class FizzBuzz represents fizz, buzz and fizzbuzz based on condition
public class FizzBuzz{
   public static void main(String[] args){
      
	  // create a scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept the input from user and assign it int type
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  
		// if else statement for indentify it is a positive number or not
		if(n < 0){
			System.out.println("It is not a positive number");
		}
		else{
			
			// apply for loop to display fizz, buzz and fizzbuss based on prior condition
			for( int i = 1 ; i <= n ; i++){
				if( i % 3 == 0 && i % 5 == 0){
					System.out.println("FizzBuzz");
				}
				else if ( i % 3 == 0){
					System.out.println("Fizz");
				}	
				else if ( i % 5 == 0){
					System.out.println("Buzz");
				}
				else{
					System.out.println(i);
				}
			}
		}
		
	  // close scanner stream	
	  sc.close();		
	}
}	