/*
Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
*/

import java.util.*;

public class LargestSmallestNumber{

    // Method to find largest number 
	public static int largeComparision(int a , int b , int c){
	
		int largestNum = a;
		if( a < b){
			largestNum = b;
			if(b < c){
				largestNum = c;
			}
		}
		
		return largestNum;
		
	}
	// Method to find smallest number
	public static int smallComparision(int a , int b , int c){
		
		int smallestNum = c;
		if( c > b){
			smallestNum = b;
			if(b > a){
				smallestNum = a;
			}
		}
		return smallestNum;
	}	
			
	public static void main(String[] args){
		
		// Accepting input in main method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		
		int largestResult = largeComparision(a , b , c);
		int smallestResult = smallComparision(a , b , c);
		
		// Display result
		System.out.println("The largest number is: " + largestResult);
		System.out.println("The smallest number is: " + smallestResult);
		
		// Scanner close
		sc.close();
		
    }	
}	