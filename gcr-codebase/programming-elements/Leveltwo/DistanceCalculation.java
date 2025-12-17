/*
Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

import java.util.Scanner;

// Class DistanceCalculation represents distance unit conversion
public class DistanceCalculation{
   public static void main(String[] args){
     
	 // Create Scanner object to read input
	 Scanner sc = new Scanner(System.in);
	 
	 // Take input of distance in feet from user
	 System.out.println("Input the distance in feets");
	 float distanceFeet = sc.nextFloat();
	 
	 // Convert feet to yards and yards to miles
	 float distanceYard = distanceFeet / 3;
	 float distanceMile = distanceYard / 1760;
	 
	 
	 // Display distance in yards and miles
	 System.out.println("The distance in yards is " + distanceYard + " and in miles is " + distanceMile);
	}
}	