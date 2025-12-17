/*
Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/
import java.util.Scanner;

// Class HeightConversion represents height unit conversion
public class HeightConversion{
   public static void main(String[] args){
      
	  // Create Scanner object to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // Accept height in centimeters from user
	  System.out.println("Input your height in cm: ");
	  double height = sc.nextDouble();
	  
	  // Convert height from centimeters to inches and inches to feet
	  double heightInInch = height / 2.54;
	  double heightInFeet = heightInInch / 12;
	  
	  
	  // Display height in centimeters, feet, and inches
	  System.out.println("Your Height in cm is " + height + " while in feet is " + heightInFeet + " and inches is " + heightInInch);
	}
}	