/*
Write a program FizzBuzz, take a number as user input and 
if it is a positive integer loop from 0 to the number 
and save the number, but for multiples of 3 save "Fizz" instead of the number, 
for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". 
Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint => 
Create a String Array to save the results and 
Finally, loop again to show the results of the array based on the index position
*/

import java.util.Scanner;

// create a class FizzBuzzIndication represents fizzbuzz if a number is divisible by 3 or 5 or both 
public class FizzBuzzIndication{
   public static void main(String[] args){
      
	  // create a scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept the input from user and assign them as int value
	  System.out.println("Enter the number : ");
	  int number = sc.nextInt();
	  String[] result = new String[number];
	  
	  
	   if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
	  //Printing fizzbuzz according to operation
		
		for (int i =1; i <= number ; i++){
			if ( i % 3 == 0 && i % 5 == 0){
				result[i] = "FizzBuzz";
			}
			else if(i % 3 == 0) {
                result[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else {
                result[i - 1] = String.valueOf(i);
            }
        }

        // Printing results
        for (int i = 0; i < result.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + result[i]);
        }

        // close scanner input
		sc.close();
    }
}	