/*
Create a program to find the multiplication table of a number 
entered by the user from 6 to 9 and display the result
Hint => 
Take integer input and store it in the variable number 
as well as define an integer array to store the multiplication 
result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 
and save the result in the array Finally, display the result 
from the array in the format number * i =
*/

import java.util.Scanner;

   
public class SixToNineMultiplication{   
   public static void main(String[] args){
		
		// create scanner class to read input and create an array of size 4 
		// and create a variable count with 0 assign value
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int[] result = new int[4];
		int index = 0;
		
		
			// apply multiplication from 6 to 9 using for loop
			for(int i = 6 ; i <= 9 ; i++){
				result[index] = n * i;
				System.out.println( n + " * " + i + " = " + result[index]);
				index++;
			}
		//close scanner stream	
   		sc.close();
	}
}	