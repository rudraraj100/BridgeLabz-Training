package com.funtionalinterface.stringlength;


// Scenario: Check if a message exceeds character limit.
// ○ Task: Use Function<String, Integer>.

import java.util.Scanner;
import java.util.function.Function;


public class LengthChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Function<String, Integer> length = x ->  x.length();
		
		System.out.println("Enter the message: ");
		String s = sc.nextLine();
		
		if(length.apply(s) < 10) {
			System.out.println("Length of mesaage: " + length.apply(s));
			System.out.println("Message not exceed the length.");
		}
		else {
			System.err.println("Length of mesaage: " + length.apply(s));
			System.out.println("Limit exceeded!");
		}
		
		sc.close();
		

	}

}
