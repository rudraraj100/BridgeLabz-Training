/*
Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint => 
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break;
*/

import java.util.Scanner;

// create a class NumbersSumUsingBreak represents addition of input variable until 0 is call
public class NumbersSumUsingBreak{
   public static void main(String[] args){;
      
	  // create scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept an input from user and assign it double type and create double variable of 0 value
	  System.out.println("Input the number");
	  double variable = sc.nextDouble();
	  double sum = 0;
		
		// apply while loop to perform addition of each input
		while(true){
			
			sum = sum + variable;
			System.out.println("Total value : " + sum);
			variable = sc.nextDouble();
				
				// if statement to use break when variable is equal to zero
				if(variable <= 0){
					break;
				}	
		}
	  
	  // display the result
	  System.out.println("Final total value : " + sum);
	  
	  // close scanner stream
	  sc.close();
	}
}