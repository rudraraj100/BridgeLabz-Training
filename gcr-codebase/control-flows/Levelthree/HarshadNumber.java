/*
Create a program to check if a number taken from the user is a Harshad Number.
Hint => 
A Harshad number is an integer which is divisible by the sum of its digits. 
For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Create a while loop to access each digit of the number.
Inside the loop, add each digit of the number to sum.
Check if the number is perfectly divisible by the sum.
If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.
*/
import java.util.Scanner;

// create class HarshadNumber represents the harshad number
public class HarshadNumber{
   public static void main(String[] args){
      
	  // create scanner class to read input and accept input from user and create a variable sum and assign it 0
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Input a number");
	  int orginalNum = sc.nextInt();
	  int sum = 0;
	  int n = orginalNum;
	  
        // apply while loop to get sum of the number's digit	  
		while(n > 0){
			int digit = n % 10;
			n /= 10;
			sum += digit;
			
		} 
		// evaluate if it is a harshad number or not
		if(orginalNum % sum == 0){
			System.out.println("It is a harshad number.");
		}
		else{
			System.out.println("It is not a harshad number.");
		}
	  // close scanner stream	  
      sc.close();
	}
}	