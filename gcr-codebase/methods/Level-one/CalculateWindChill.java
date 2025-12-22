/*
Write a program calculate the wind chill temperature given the temperature and wind speed
Hint => 
Write a method to calculate the wind chill temperature using the formula 
windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
*/

import java.util.*;

public class calculateWindChill{
	
    // Method to calculate wind chill  
	public static double findWindChill(double temp , double windSpeed){
		
		double windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed *0.16;
		
		return windChill;
	}

	public static void main(String[] args){
		
		// Accepting input in main method
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the temperature value ");
		double temp = sc.nextDouble();
		
		System.out.println("Enter the wind speed: ");
		double windSpeed = sc.nextDouble();
	
		double totalWindChill = findWindChill(temp , windSpeed);
		
		// Display result
		System.out.println("Total wind chill temperature : " + totalWindChill);
		
		// Scanner close
		sc.close();
		
	}
}	