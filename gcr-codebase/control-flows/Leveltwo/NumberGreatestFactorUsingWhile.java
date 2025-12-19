/*
Rewrite the above program to print the greatest factor of a number beside itself using a while loop.
Hint => 
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a variable counter and assign counter = number - 1; Use the while loop till the counter is equal to 1.
Inside the loop, check if the number is perfectly divisible by the counter then assign the counter to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop
*/
import java.util.Scanner;

// create a class NumberGreatestFactor represents factors of number takes as an input
public class NumberGreatestFactorUsingWhile{
   public static void main(String[] args){
      
	  
	  // create scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	   /* accept an input from user and assign it int type and create variable greatestFactor with initial value 1
	      create varaible i with value n-1
	   */	  
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  int i = n-1;
	  int greatestFactor = 1;
	  
		// apply while loop to display factor of the number and break when we get greatestFactor
		while(i >= 1){
			
			if(n % i == 0){
				greatestFactor = i;
				i = i - 1;
				
				break;
			}
			
			i = i - 1;
				
		}
	  // display the result	
	  System.out.println("Greatest factor is: " + greatestFactor);
      	  
      // close scanner stream
      sc.close();
	}
}	