/*
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
*/

import java.util.Scanner;

// Class MaximumHandshakes represents handshake calculation
public class MaximumHandshakes{
  public static void main(String[] args){
     
	 // Create Scanner object to read input
	 Scanner sc = new Scanner(System.in);
	 
	 // Take input of total number of students
	 System.out.println(" Total Number of students");
	 int n = sc.nextInt();
	 
	 // Calculate maximum possible handshakes using formula
	 int maximumHandshake = (n * (n - 1) / 2);
	 
	 
	 // Display the result
	 System.out.println("The possible number of handshakes are " + maximumHandshake);
	}
}	
	 
	 