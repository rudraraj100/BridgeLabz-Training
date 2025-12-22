/*
Write a program SpringSeason that takes two int values month and 
day from the command line and prints “Its a Spring Season” 
otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. 
Write a Method to check for Spring season and return a boolean true or false
*/

import java.util.*;

import java.util.Scanner;

// create a class SpringSeason represents which month with date is spring season
public class SpringSeason{
	
	// Method to identify the spring season
	public static boolean isSpring( int month , int date){
		
		if( month == 3 && date >=20 ){
			return true;
		}	
		else if( month == 4 && date >=1 && date <=30 || month == 5 && date >= 1 && date <= 31  ){
				return true;
		}		
		else if( month == 6 && date <= 20){
				return true;
		}
		else{
			return false;
		}
    } 

	public static void main(String[] args){
      
	  // create a scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept input for month from user
	  int month = Integer.parseInt(args[0]);
	  
	  // accept input for date from user
	  int date = Integer.parseInt(args[1]);
	  
	    boolean isSpringSeason = isSpring( month , date);
		
		// Display the result
		if(isSpringSeason){
			System.out.println("It is a spring season.");
		}
		else{
			System.out.println("It is not spring season.");
		}
		
      // close scanner stream		
	  sc.close();
	}
}	