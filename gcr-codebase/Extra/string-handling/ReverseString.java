// Write a Java program to reverse a given string without using any built-in reverse functions.

import java.util.Scanner;

public class ReverseString{
	
	// Method to create reverse of the string
	public static String reverseString(String text){
	
		String reverse = "";
		
		for(int i = text.length() - 1 ; i >= 0 ; i--){
			reverse = reverse + text.charAt(i);
		}

		return reverse;
	}	
	// main method	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your text: ");
		String text = sc.nextLine();
		
		String newString = reverseString(text);
		
		System.out.println("Reverse text : " + newString);
		
		// close scanner;
		sc.close();
	}
}	
		
		