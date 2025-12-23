/*
Write a program to return all the characters in a string using the user-defined method,  
compare the result with the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, 
compare the 2 arrays, and finally display the result
*/

import java.util.Scanner;

public class StringCharacter{
	// method to create string array
	public static char[] createStringArray(String a){
	
		int strLength = a.length();
		char[] str = new char[strLength];
		for( int i = 0 ; i < strLength ;  i++){
			str[i] = a.charAt(i);
		}
		return str;
	}
	
	// Method to create string array using char array	
	public static char[] createStringArrayUsingToCharArray(String a){
		
		char [] charArray = a.toCharArray();
		
		return charArray;
	}	
	// Boolean method to check if each char in both string are equal 
	public static boolean compare(char[] str1 , char[] str2 , String a ){
		
		int strLength = a.length();
		boolean isSame = true;
		for(int i = 0 ; i < strLength ; i++){
			
			if(str1[i] != str2[i]){
				isSame = false;
				return isSame;
			}
		}
		return isSame;		
				
	}			
	// main method
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String a = sc.nextLine();
		
		char[] str1 = createStringArray(a);
		char[] str2 = createStringArrayUsingToCharArray(a);
		
		boolean isSame = compare(str1 , str2 , a);
		
		System.out.println("Are both the result same? " + isSame);
		
		// close scanner
		sc.close();
	}
}	
		