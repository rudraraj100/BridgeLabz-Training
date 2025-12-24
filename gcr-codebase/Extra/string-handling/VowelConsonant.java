// Write a Java program to count the number of vowels and consonants in a given string.


import java.util.Scanner;

public class VowelConsonant{
	// method to find vowels and consonant in text
	public static void findVowelConsonant(String text){
	
		int vowel = 0;
		int consonant = 0;
		
		for( int i = 0 ; i < text.length() ; i++){
			
			char ch = text.charAt(i);
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u'){
				vowel++;
			} else {
				consonant++;
			}
		}	
		// print number of vowels ans consonants
		System.out.println("Total vowels in text: " + vowel);
		System.out.println("Total consonants in text: " + consonant);
		
	}	
	// main method
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your text: ");
		String text = sc.nextLine();
		
		findVowelConsonant(text);
		// close scanner
		sc.close();
	}
}	