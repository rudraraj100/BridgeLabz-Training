/*
Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. 
Further for positive numbers check if the number is even or odd. 
Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less
*/

import java.util.Scanner;

   
public class NumberCharacter{   
   public static void main(String[] args){
		
		// create scanner class to read input and create an array of size 5
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		
		// input element 
		System.out.println("Enter the five numbers");
			for(int i = 0 ; i < number.length ; i++){
			System.out.println("Enter the " + (i + 1) + " number");
			number[i] = sc.nextInt();
			}
				// evaluate through operation and dispay the result
				for(int i = 0 ; i < number.length ; i++){
					if( number[i] > 0 ){
						if( number[i] % 2 == 0){
							System.out.println("The number " + (i + 1)+ " is positive even number.");
						} else{
							System.out.println("The number " + (i + 1)+ "  is positive odd number.");
							}
					} 
					else if ( number[i] == 0){
						System.out.println("The number " + (i + 1)+ "  is Zero.");
					} 
					else {
						System.out.println("The number " + (i + 1)+ "  is negative number.");
						}
				}
				
					// display comparision betwwen first and last number
					System.out.println( number[0] + " " +  number[4]);
					if(number[0] ==  number[4]){
						System.out.println("First number and last number are equal.");
					}
					if(number[0] >  number[4]){
						System.out.println("First number is greater than last number.");
					}
					if(number[0] <  number[4]){
						System.out.println("last number is greater than first number.");		
					}
		
		//close scanner stream
		sc.close();
	}
}	
	