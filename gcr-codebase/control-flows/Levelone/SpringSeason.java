/*
Write a program SpringSeason that takes 
two int values month and day from the command line and 
prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => 
Spring Season is from March 20 to June 20
*/

import java.util.Scanner;

// create a class SpringSeason represents which month with date is spring season
public class SpringSeason{
   public static void main(String[] args){
      
	  // create a scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept input for month from user
	  int month = Integer.parseInt(args[0]);
	  
	  // accept input for date from user
	  int date = Integer.parseInt(args[1]);
	  
	    // if else if and else statement to divide month and date condition to figure out the spring season and display them
		if( month == 3 && date >=20 ){
			System.out.println("Its a Spring Season");
		}	
		else if( month == 4 && date >=1 && date <=30 || month == 5 && date >= 1 && date <= 31  ){
				System.out.println("Its a Spring Season");
		}		
		else if( month == 6 && date <= 20){
				System.out.println("Its a Spring Season");
		}
		else{
			System.out.println("Not a Spring Season");
		}
		
      // close scanner stream		
	  sc.close();
	}
}	