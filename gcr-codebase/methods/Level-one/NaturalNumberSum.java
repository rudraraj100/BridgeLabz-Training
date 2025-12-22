/*
Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. 
Write a Method to find the sum of n natural numbers using loop 
*/
import java.util.*;

// Create class NaturalNumberSum represents the sum of n natural number
public class NaturalNumberSum{
	public static int sumNumber(int n){
		
		int sumByFormula =  n * (n+1) / 2;
			
		return sumByFormula;	

    }
	public static void main(String[] args){
      
	  // Create a scanner class to read the input
	  Scanner sc = new Scanner(System.in);
	  
	  // Accept value of n from user and assign it as int value
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  
	  int numberSum = sumNumber(n);
	  
	  System.out.println("The sum of natural number: " + numberSum);
	   
      // close scanner 	   
      sc.close();
	}
}	