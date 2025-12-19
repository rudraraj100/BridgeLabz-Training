/*
Create a program to find the power of a number.
Hint => 
Get integer input for two variables - number and power and check for positive integer
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result
*/

import java.util.Scanner;

// create class NumberPower represents power of a number taken as input
public class NumberPower{
   public static void main(String[] args){
      
	  // create scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept an input of number from user and assign it int type
	  System.out.println("input the number");
	  int n = sc.nextInt();
	  
	  // accept an input of power from user and assign it int type and create variable result with value 1
	  System.out.println("input the power");
	  int p = sc.nextInt();
	  int result = 1;
	  
		// if else statement to identify both the variable are positive
		if( n > 0 && p > 0){
			
			// apply for loop to display the result with power
			for(int i = 1 ; i <= p ; i++){
				result = result * n;
			}
			System.out.println(result);
		}
		else {
			System.out.println("Invalid input");
		}
      	
      //close scanner stream		
      sc.close();
    }
}	
		
	  
	  
	  