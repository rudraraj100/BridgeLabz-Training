/*
Create a program to find the factors of a number taken as user input.
Hint => 
Get the input value for a variable named number and check if it is a positive integer.
Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. 
If true, print the value of i.
*/
import java.util.Scanner;

// create a class NumberFactor represents factors of number takes as an input 
public class NumberFactor{
   public static void main(String[] args){
      
	  // create scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept an input from user and assign it int type
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  
		// apply for loop to display factor of the number
		for(int i = 1 ; i <= n/2 ; i++ ){
			
			if(n % i == 0){
				System.out.println(i);
			}
		}
      
	  // close scanner stream
      sc.close();
	}
}	
	