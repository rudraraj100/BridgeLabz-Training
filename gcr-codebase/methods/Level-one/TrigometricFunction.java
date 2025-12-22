/*
Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, 
Firstly convert to radians and then use Math function to find sine, cosine and tangent.
*/

import java.util.*;

public class TrigometricFunction{
    // Method to calculate trigometric function
	public static void calculateTrigo(double degree){
	
		double radians = Math.toRadians(degree); 
		
		// To display the result in main method
		System.out.println("sine:" + degree +": " + Math.sin(radians));
		System.out.println("cos:" + degree + ": " + Math.cos(radians));
		System.out.println("tan:" + degree + ": " + Math.tan(radians));
		
	}
	
	public static void main(String[] args){
		// Accepting input and read through scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the degree of angle: ");
		double degree = sc.nextDouble();

		calculateTrigo(degree);
		// Close scanner
		sc.close();
	}
}	