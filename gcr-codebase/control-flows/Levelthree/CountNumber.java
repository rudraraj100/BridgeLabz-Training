/*
Create a program to count the number of digits in an integer.
Hint => 
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits
*/

import java.util.Scanner;

// public class CountNumber represents counting of digits in number
public class CountNumber{
   public static void main(String[] args){
      
	  // create scanner class to read input and accept input from user
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  int count = 0;
	  
		// apply while loop to get the count of digit
		while(n > 0){
			int digit = n % 10;
			n /= 10;
			count++;
		}
       
      // display the result	   
	  System.out.println(count);
	  
	  // close scanner stream
	  sc.close();
    }
}	 