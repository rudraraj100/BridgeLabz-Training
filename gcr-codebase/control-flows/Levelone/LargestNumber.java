/*
Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P => 
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___
*/

import java.util.Scanner;

// Create class LargestNumber represents to print largest number between three numbers
public class LargestNumber{
   public static void main(String[] args){
      
	  // create scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // Accept the input like number1, number2 and number3 from user
	  System.out.println("Input a number1");
	  int number1 = sc.nextInt();
	  System.out.println("Input a number2");
	  int number2 = sc.nextInt();
	  System.out.println("Input a number3");
	  int number3 = sc.nextInt();
	  
	  
	  // Display the result of largest number
	  System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3));
      System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3)); 
      System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2));
	  
	  
	  // close scanner stream
	  sc.close();
	  
	}
}	