/*
Rewrite the above program 7 to find the factors of a number using the while loop
Hint => 
Get the input value for a variable named number and check if it is a positive integer.
Create a counter variable and run the _**while**_ loop till the counter is less than the user input number. 
In each iteration of the loop, check if the number is perfectly divisible by the counter. 
If true, print the value of the counter.
*/
import java.util.Scanner;

// create a class NumberFactorUsingWhile represents factors of number takes as an input 
public class NumberFactorUsingWhile{
   public static void main(String[] args){
      
	  // create scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept an input from user and assign it int type and create variable i with initial value 1
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  int i = 1;
		
		// apply while loop to display factor of the number
		while(i<= n/2){
			
			if(n % i == 0){
				System.out.println(i);
			}
			i = i + 1;
		    	
		}
      
	  //close scanner stream
      sc.close();
	}
}	
	