/*
Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___
*/

import java.util.*;


public class SimpleInterest{
    // Method to calculate simple interest
    public static double calculateSimpleInterest(double p , double r , double t){
	
		double simpleInterest = (p * r * t) / 100;
		return simpleInterest ;
	
	}

	public static void main(String[] args){
            // Accepting input and read through Sacnner class		
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter the Principal: ");
			double p = sc.nextDouble();
			System.out.println("Enter the Rate: ");
			double r = sc.nextDouble();
			System.out.println("Enter the Time: ");
			double t = sc.nextDouble();
		
			double si = calculateSimpleInterest(p, r, t);
			
			// Display result
			System.out.println("Simple interest is: " + si);
			
			// Close Scanner
			sc.close();
	}
}	
		