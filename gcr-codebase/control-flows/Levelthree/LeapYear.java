/*
Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. So ensure to check for the same. 
Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by 400. E.g. 1800 is not a Leap Year and 2000 is a Leap Year.
Write code having multiple if else statements based on conditions provided above and a second part having only one if statement and multiple logical 
*/
import java.util.Scanner;

// create class LeapYear represents the year is a leap year or not
public class LeapYear{
   public static void main(String[] args){
	   
	   // create scanner class to read input and accept input from user
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Input a year");
	   int y = sc.nextInt();
	    
	   
	   // evaluate if it is leap year or not and display
	   if ( y % 4 == 0 && y % 100 != 0){
			System.out.println("It is a leap year");
	   }

		else if ( y % 400 == 0){
				System.out.println("It is a leap year");
		}

		else {
			System.out.println("It is not a leap year");
		}
   	  // close scanner stream	
	  sc.close();	
   }
}   