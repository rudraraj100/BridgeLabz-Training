/*
Create a program to convert distance in kilometers to miles.
Hint => 
Create a variable km and assign type as double as in double km;
Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
Use Scanner Object to take user input for km as in km = input.nextInt();
Use 1 mile = 1.6 km formulae to calculate miles and show the output
I/P => km
O/P => The total miles is ___ mile for the given ___ km
*/

import java.util.Scanner;

// Class KilometersToMiles represents distance conversion
  public class KilometersToMiles{
     public static void main(String[] args){ 
		 
       // Create Scanner object to read input
       Scanner sc = new Scanner(System.in);
	    
	   // Accept distance in kilometers from user	
	   System.out.println("input the distance in kilometers: ");
	   double distanceKilometers = sc.nextDouble();
	   
	   // Convert kilometers to miles
	   double distanceMiles = distanceKilometers * 0.6;
	   
	   
	   // Display the converted distance
	   System.out.println("The total miles is " + distanceMiles + " mile for the given " + distanceKilometers + " km");
	 }
  }	