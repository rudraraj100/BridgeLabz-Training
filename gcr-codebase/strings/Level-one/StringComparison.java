/*
Write a program to compare two strings using the charAt() method 
and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 
*/

import java.util.Scanner;

public class StringComparison{
	
	// method to comapre string using charAt
	public static boolean stringComparisionUsingCharAt(String one, String two){
	
		boolean compare = true;
		
		if(one.length() != two.length()){
			return compare = false;
		}	
		
		for( int i = 0; i < one.length() ; i++){
			if( one.charAt(i) == two.charAt(i)){
				compare = true;
			}
			else{
				return compare = false;
			}
		}
		return compare;
	}	
	// method to compare string using in built method
	public static boolean stringComparisionUsingEqual(String one , String two){
		
		boolean compare = one.equals(two);
		
		return compare;
		
	}
	// main method
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Write your first string: ");
		String one = sc.next();
		System.out.println("Write your second string: ");
		String two = sc.next();
		
		boolean compareUsingCharAt = stringComparisionUsingCharAt(one , two);
		boolean compareUsingEquals = stringComparisionUsingEqual(one , two);
		
		System.out.println("Are both the strings same using CharAt? " + compareUsingCharAt);
		System.out.println("Are both the strings same using Equals? " + compareUsingCharAt);
		
		System.out.println("----------------------------------------------------------");
		
		if( compareUsingCharAt == compareUsingEquals){
			System.out.println("Both answer are same.");
		}
		else{
			System.out.println("Both answer are not same.");	
		}
		
		// close scanner 
		sc.close();
	}
}	