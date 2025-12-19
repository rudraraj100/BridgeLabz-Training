/*
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony 
based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
*/

import java.util.Scanner;

// create class YoungestAndTallest represents the youngest and tallest among 3 friends
public class YoungestAndTallest{
   public static void main(String[] args){
      
	  // create a scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept the input of age and height of three friend and assign them int and float type respectively
	  System.out.println("Input Amar's age");
	  int amarAge = sc.nextInt();
	  System.out.println("Input Amar's height");
	  float amarHeight = sc.nextFloat();
	  
	  System.out.println("Input Akbar's age");
	  int akbarAge = sc.nextInt();
	  System.out.println("Input Akbar's height");
	  float akbarHeight = sc.nextFloat();
	  
	  System.out.println("Input Anthony's age");
	  int anthonyAge = sc.nextInt();
	  System.out.println("Input Anthony's height");
	  float anthonyHeight = sc.nextFloat();
	  
	  // assume Amar is the yongest 
	  String youngest = "Amar";
	  int minAge = amarAge;
	  
		// apply if statement to idnetify the assumption true or false if false then modify the youngest
		if(akbarAge < minAge){
			minAge = akbarAge;
			youngest = "Akbar";
		}
		
		// apply if statement to idnetify the assumption true or false if false then modify the youngest
		if(anthonyAge < minAge){
			youngest = "Anthony";
		}
      
	  // assume Amar is the tallest 
      String tallest = "Amar";
	  float maxHeight = amarHeight;
		
		// apply if statement to idnetify the assumption true or false if false then modify the tallest
		if(akbarHeight > maxHeight){
			maxHeight = akbarHeight;
			tallest = "Akbar";
		}
        
		// apply if statement to idnetify the assumption true or false if false then modify the tallest
		if( anthonyHeight > maxHeight){
			tallest = "Anthony";
		}

	  // display the youngest and tallest among the three
      System.out.println("The youngest friend " + youngest);
	  System.out.println("The tallest friend " + tallest);
	  
	  // close scanner stream
	  sc.close();
	  
	}
}	
	  		
			