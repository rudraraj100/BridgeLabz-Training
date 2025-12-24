// Write a Java program to check if a given string is a palindrome (a string that reads the same forward and backward).

import java.util.Scanner;

public class PalindromeCheck{

	public static boolean isPalindrome(String text){
		
		int left = 0;
		int right = text.length() - 1;
		
		while (left < right){
		
			char leftChar = text.charAt(left);
			char rightChar = text.charAt(right);

				// Skip spaces
			if (leftChar == ' ') {
				left++;
				continue;
			}
			if (rightChar == ' ') {
				right--;
				continue;
			}

			// Convert to lowercase (ASCII logic)
			if (leftChar >= 'A' && leftChar <= 'Z') {
				leftChar = (char) (leftChar + 32);
			}
			if (rightChar >= 'A' && rightChar <= 'Z') {
				rightChar = (char) (rightChar + 32);
			}

			if (leftChar != rightChar) {
				return false;
			}
			right--;
			left++;
		}
		return true;
	}	
	

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your text: ");
		
		String text = sc.nextLine();
		
		boolean result = isPalindrome(text);
		
		System.out.println("is the text palindrome? " + result);
		
		sc.close();
	}	
}		
			
		