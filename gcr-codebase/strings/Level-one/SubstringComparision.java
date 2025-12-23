/*
Write a program to create a substring from a String using the charAt() method. 
Also, use the String built-in method substring() to find the substring of the text. 
Finally Compare the the two strings and display the results
Hint => 
Take user input using the  Scanner next() method to take the String variable and
also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
*/

import java.util.Scanner;

public class SubstringComparision{
	
	// method to create sub string
	public static String createSubstring(String a, int i , int j){
	
		String sub = a.substring(i , j);
		
		return sub;
	}
	
	// method to create subtring using charAt
	public static String createSubstringUsingCharAt(String a , int i , int j){
		
		String sub = "";
		for( int k = i ; k < j ; k++){
			
			sub += a.charAt(k);
		}

		return sub;
	}
    // method to compare both substring methop results
	public static void compareBoth( String sub1 , String sub2){
		
		if( sub1.equals(sub2)){
			System.out.println("Both answer are same.");
		}
		else{
			System.out.println("Both answer are not same.");
			}
	}		
	// main method		
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String a = sc.next();
		
		System.out.println("Enter the value of i and j for substring");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		String sub1 = createSubstringUsingCharAt(a , i , j);
		String sub2 = createSubstring(a , i , j);
		
		System.out.println(sub1);
		System.out.println(sub2);
		
		compareBoth(sub1 , sub2);
		
		// close scanner
		sc.close();
		
	}
}	