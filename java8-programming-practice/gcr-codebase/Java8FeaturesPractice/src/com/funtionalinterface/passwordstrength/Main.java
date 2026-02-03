package com.funtionalinterface.passwordstrength;

// Scenario: In an insurance portal, password policy rules are centrally defined.
//○ Task: Create a static method in an interface SecurityUtils to check password strength.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your password");
		String password = sc.nextLine();
		
		boolean result = SecurityUtils.strength(password);
		
		if(result) {
			System.out.println("Strong password");
		}
		else {
			System.out.println("Weak password");
		}

	}

}
