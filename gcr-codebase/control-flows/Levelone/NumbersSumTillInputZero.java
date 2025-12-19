/*
Write a program to find the sum of numbers until the user enters 0
Hint => 
Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
Use the while loop to check if the user entered is 0
If the user entered value is not 0 then inside the while block add user entered value to the total and ask the user to input again
The loop will continue till the user enters zero and outside the loop display the total value
*/

import java.util.Scanner;

// create a class NumbersSumTillInputZero represents addition of input variable until 0 is call
public class NumbersSumTillInputZero{
   public static void main(String[] args){;
      
	  // create scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept an input from user and assign it double type and create double variable of 0 value
	  System.out.println("Input the number");
	  double variable = sc.nextDouble();
	  double sum = 0;
	  
	    // apply while loop to perform addition of each input until 0 is call
		while(variable != 0){
			
			sum = sum + variable;
			System.out.println("Total value : " + sum);
			variable = sc.nextDouble();
		}
	  
	  // display the result
	  System.out.println("Final total value : " + sum);
	  
	  // close scanner stream
	  sc.close();
	}
}	
			
		