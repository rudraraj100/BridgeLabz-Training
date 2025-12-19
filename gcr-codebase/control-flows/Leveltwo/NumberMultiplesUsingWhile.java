/*
Rewrite the program to find all the multiples of a number below 100 using while loop.
Hint => 
Get the input value for a variable named number. Check the number is a positive integer and less than 100.
Create a counter variable and assign counter = number - 1; Use a while till the counter is > 1
Inside the loop, check if the counter perfectly divides the number. If true, print the number and continue the loop.
*/
import java.util.Scanner;

// create a class NumberMultiplesUsingWhile represents multiples of number taksen as input
public class NumberMultiplesUsingWhile{
   public static void main(String[] args){
      
	  
	  // create scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept an input from user and assign it int type and create a variable counter with value n-1
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  int counter = n - 1;
	  
		//if else statement to identify the nnumber is positive and below 100
		if(n > 0 && n < 100){
			
			
			// apply while loop to display multiplication of number in each iteration
			while (counter > 1){
				if( n % counter == 0){
					System.out.println(counter);
					counter = counter - 1;
				}
				else{
					counter = counter - 1;
				}	
			}
		}	
		else{
			System.out.println("invalid input");
		}
      .
	  // close scanner stream
      sc.close();
	}
}	