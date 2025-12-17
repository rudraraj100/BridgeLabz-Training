/*
Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/

import java.util.Scanner;

// Class SquarePerimeter represents calculation of square side
public class SquarePerimeter{
   public static void main(String[] args){
     
	 // Create Scanner object to read input
	 Scanner sc = new Scanner(System.in);
	 
	 // Take input of perimeter of the square from user
	 System.out.println("Input a side of square");
	 float perimeter = sc.nextFloat();
	 
	 // Calculate side length
	 float side  = perimeter / 4;
	 
	 
	 // Display the side length and perimeter
	 System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
	}
}	