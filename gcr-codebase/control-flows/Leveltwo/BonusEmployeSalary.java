/*
Create a program to find the bonuses of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
*/
import java.util.Scanner;

// create a class BonusEmployeSalary represents total salary bonus 
public class BonusSalary{
   public static void main(String[] args){
      
	  // create a scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept the input from user and assign them as int value
	  System.out.println("Input your total year of service");
	  int service = sc.nextInt();
	  System.out.println("Input your total salary");
	  int salary = sc.nextInt();
	    
		
		// if else statement used to determine and display 5 or more years of service by user can get bonus only
		if( service >= 5){
			double bonus = salary * 0.05;
			System.out.println("The bonus amount is " + bonus);
		}
		else{
			System.out.println("You are not eligible for bonus");
	    }
	   
      // close scanner stream	   
      sc.close();
	}
}	