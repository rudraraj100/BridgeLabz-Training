/*Create a program to print odd and even numbers between 1 to the number entered by the user.
Hint => 
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
In each iteration of the loop, print the number is odd or even number
*/
import java.util.Scanner;

// create a class OddEvenNumbers represents even and odd number between 1 and input given by user
public class OddEvenNumber{
   public static void main(String[] args){
      
	  // create a scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept an input number from user and assign int type
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  
	    // apply for loop to run operation to identify odd and even number   
		for(int i= 1 ; i<=n ; i++){
			if( i % 2 == 0){
				// display the result
				System.out.println(i + " is an even number.");
			}	
			else{
				// display the result
				System.out.println(i + " is an odd number.");
			}
		
		}
	  // close scanner stream
      sc.close();
	}
}	