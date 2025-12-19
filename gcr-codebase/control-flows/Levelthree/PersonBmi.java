/*
Create a program to find the BMI of a person
Hint => 
Take user input in double for the
weight (in kg) of the person and 
height (in cm) for the person and 
store it in the corresponding variable.
Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Use the table to determine the weight status of the person
*/

import java.util.Scanner;

// create class PersonBmi represents the bmi of the person
public class PersonBmi{
   public static void main(String[] args){
      
	  // create scanner class to read input and accept input from user about height and weight
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Input your weight in kg");
	  double weight = sc.nextDouble();
	  
	  System.out.println("Input your height in cm");
	  double height = sc.nextDouble();
	  height = height / 100;
	  
	  double bmiIndex = weight / (height * height);
	  
	    // evaluate and display the bmi value into different categories  
		if (bmiIndex >= 40.0){
			System.out.println("You are obese.");
		}
		
		if (bmiIndex >= 25.0 && bmiIndex <= 39.9){
			System.out.println("You are overweight.");
		}	
		
		if( bmiIndex >=18.5 && bmiIndex <= 24.9 ){
			System.out.println("You are normal.");
		}
			
			
		if (bmiIndex <= 18.4){
			System.out.println("Your are underweight.");
		}
		
	  // close scanner	stream
	  sc.close();
	}
}	
					
	  