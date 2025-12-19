/*
Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result
*/
import java.util.Scanner;

// Create class NaturalNumberSumUsingFor represents the sum of n natural number
public class NaturalNumberSumUsingFor{
   public static void main(String[] args){
      
	  // Create a scanner class to read the input
	  Scanner sc = new Scanner(System.in);
	  
	  // Accept value of n from user and assign it as int value
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  
	  // Perfrom sum of n natural numbers formula and create a variable sumByLoop and assign the value of 1
	  int sumByFormula =  n * (n+1) / 2;
	  int sumByLoop = 0;
		
		// if else statement to figure out if value of n is natural number
		if(n <= 0){
			System.out.println("Not a natural number");
		}	
		else {
			
			// apply for loop to calculate sum of natural number
			for (int i=n ; i>=1 ; i--){
				sumByLoop += i;
				
			}
			// computate both answer and display comparision
			if( sumByFormula == sumByLoop){
				System.out.println("The result from both computations was correct.");
			}
		}
	   
      // close scanner stream	   
      sc.close();
	}
}	
     	  