/*
Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

import java.util.Scanner;

// Class AreaOfTriangle represents triangle area calculation
public class AreaOfTriangle{
   public static void main(String[] args){
     
     // Create Scanner object to read input	 
	 Scanner sc = new Scanner(System.in);
	 
	 // Take input of base and height of the triangle
	 System.out.println("Input a base");
	 float base = sc.nextFloat();
	 System.out.println("Input a height");
	 float height = sc.nextFloat();
	 
	 // Calculate area using triangle area formula
	 float area = 1.0f/2 * base * height;
	 
	 
	 // Display the calculated area
	 System.out.println(" the area of triangle is " + area + " where base is " + base + " and height is " + height);
	}
}	
	 