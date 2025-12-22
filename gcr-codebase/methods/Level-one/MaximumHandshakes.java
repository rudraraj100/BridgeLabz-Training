/*
Create a program to find the maximum number of handshakes among students.
Hint => 
Get integer input for the numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
Display the number of possible handshakes.
*/

import java.util.*;

public class  MaximumHandshakes{
	
	// Method to find maximum handshakes
	public static int totalHandshakes(int n){
	
		int handshakes = (n * (n - 1)) / 2;
		return handshakes;
	}
		
	public static void main(String[] args){
		// Accepting students input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();
		
		int handshakes = totalHandshakes(n);
		
		// Display the result
		System.out.println("The number of possible handshakes: " + handshakes);
		
		// Scanner close
		sc.close();
	}
}	
		