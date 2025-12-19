/*
Rewrite the above program to find the power of a number using a while loop.
Hint => 
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
In each iteration of the loop, multiply the result by the number and assign the value to the result. Also,
increment the counter.
Finally, print the result
*/
import java.util.Scanner;

// create class NumberPower represents power of a number taken as input
public class NumberPowerUsingWhile{
   public static void main(String[] args){
      .
	  // create scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept an input of number from user and assign it int type
	  System.out.println("input the number");
	  int n = sc.nextInt();
	  
	  /* accept an input of power from user and assign it int type and create variable result with value 1
	     and create variable counter with value 1
	  */
	  System.out.println("input the power");
	  int p = sc.nextInt();
	  int result = 1;
	  int counter = 1;
	  
	  
		// if else statement to identify both the variable are positive
		if( n > 0 && p > 0){
			
			// apply while loop to display the result with power
			while(counter <= p){
				result = result * n;
				counter++;
			}
			System.out.println(result);
		}
		else {
			System.out.println("Invalid input");
		}
      // close scanner stream	  
      sc.close();
    }
}