/*
Create a program to check if a number is armstrong or not. Use the hints to show the steps clearly in the code
Hint => 
Armstrong Number is a number whose Sum of cubes of each 
digit results in the original number as in for e.g. 153 = 1^3 + 5^3 + 3^3
Get an integer input and store it in the number variable and 
define sum variable, initialize it to zero and originalNumber variable and assign it to input number variable
Use the while loop till the originalNumber is not equal to zero
In the while loop find each digit which is the reminder of the modulus operation number % 10. 
Find the cube of the number and add it to the sum variable
Again in while loop find the quotient of the number using the division operation number/10 and 
assign it to the original number. This removes the last digit of the original number.
Finally check if the number and the sum are the same, if same its an Armstrong number else not. 
So display accordingly
*/

import java.util.Scanner;

// create class ArmstrongNumber represents the number is an Armstrong number or not
public class ArmstrongNumber{
   public static void main(String[] args){
      
	  // Create scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept an input from user and create variable name originalNumber
	  System.out.println("Input a number");
	  int number = sc.nextInt();
	  int sum = 0;
	  int originalNumber = number;
	  
		// apply while loop to get total sum of number with assign power
		while(originalNumber > 0){
			int digit = originalNumber % 10;
			sum += (int)Math.pow(digit, 3);
			originalNumber /= 10;
		}
		// apply if statement to evaluate if the number is Armstrong number or not
		if(number == sum){
			System.out.println("It is an armstrong number.");
		}
		else{
			System.out.println("It is not an armstrong number.");
		}
		
	  // close scanner stream	
      sc.close();
    }
}  
		