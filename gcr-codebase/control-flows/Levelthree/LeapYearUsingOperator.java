/*
Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
*/

import java.util.Scanner;

// create class LeapYearUsingOperator represents the year is a leap year or not
public class LeapYearUsingOperator{

   public static void main(String[] args){
	   
	   // create scanner class to read input and accept input from user
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Input a year");
	   int y = sc.nextInt();
	   .
       // evaluate if it is leap year or not and display	   
	   if ( y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
			System.out.println("It is a leap year.");
	   }

		else {
			System.out.println("It is not a leap year.");
		}
   	  //close scanner stream
	  sc.close();	
   }
}   