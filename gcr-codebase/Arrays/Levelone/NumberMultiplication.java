/*
Create a program to print a multiplication table of a number.
Hint => 
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i =
*/

import java.util.Scanner;

   
public class NumberMultiplication{   
   public static void main(String[] args){
		
		// create scanner class to read input, accept int input from user and create an array of size 10
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int[] result = new int[10];
		
			// display multiplication from 6 to 9
			for(int i = 1 ; i <= 10 ; i++){
				result[i-1] = n * i;
				System.out.println(n + " * " + i + " = " + result[i-1]);
			}
		
        // close scanner stream		
		sc.close();	
	}	
}	
				