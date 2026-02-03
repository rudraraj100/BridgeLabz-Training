package com.funtionalinterface.unitconversion;

import java.util.Scanner;

// Scenario: Logistics software needs standard unit conversions (km to miles, kg to lbs).
// ○ Task: Implement conversions as static interface methods.

public class Conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in km");
		double dKm = sc.nextDouble();
		
		System.out.println(Tool.kmTomiles(dKm) + " in miles");
		
		System.out.println("Enter weight in kg");
		double wkg = sc.nextDouble();
		
		System.out.println(Tool.kgTolbs(wkg) + " in lbs");
		
		sc.close();

	}

}
