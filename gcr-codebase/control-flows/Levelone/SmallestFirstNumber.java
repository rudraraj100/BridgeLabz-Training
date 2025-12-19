/*
Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest?
*/

import java.util.Scanner;

// create a class smallestFirstNumber represents is it true that first number smallest betwwen 3 numbers
public class SmallestFirstNumber{
   public static void main(String[] args){
      
	  // create a scanner class to read the input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept three numbers number1, number2 and number3 from the user
	  System.out.println("Input a number1");
	  int number1 = sc.nextInt();
	  System.out.println("Input a number2");
	  int number2 = sc.nextInt();
	  System.out.println("Input a number3");
	  int number3 = sc.nextInt();
	  
	  
	  // display boolean expreesion on statement that first number is smallest or not
	  System.out.println("Is the first number the smallest? " + (number1 < number2 && number1 < number3));
	  
	  // close the scanner stream
	  sc.close();
	}
}	
			
	  