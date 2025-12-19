/*
Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch
Hint => 
Create a variable counter to take user inputted value for the countdown.
Use the while loop to check if the counter is 1
Inside a while loop, print the value of the counter and decrement the counter.
*/

import java.util.Scanner;

// create a class CountDown represents the countdown start from user given input value
public class CountDown{
   public static void main(String[] args){
      
	  // create a scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept input number from user and assign int type
	  System.out.println("Put a number from which to start the countdown");
	  int counter = sc.nextInt();
	    
		// apply while loop to display the countdown
		while( counter >= 1 ){
			System.out.println(counter);
			counter = counter - 1;
		}
	  
      // close scanner stream    	  
	  sc.close();
	}
}	