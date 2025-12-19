/*
Create a program to find the multiplication table of a number entered by the user from 6 to 9.
Hint => 
Take integer input and store it in the variable number
Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = 
*/
import java.util.Scanner;

// create class MultiplicationTables represents table between 6 to 9
public class MultiplicationTable{
   public static void main(String[] args){
      
	  // create a scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept a input number between 6 to 9 from the user and assign it int type
	  System.out.println("Input a number between 6 to 9");
	  int n = sc.nextInt();
	  
	  // apply for loop to display the multiplication
		for( int i = 1 ; i <=10 ; i++){
			int multiplication = n * i ;
			System.out.println(n + " * " + i + " = " + multiplication);
		}
	  
	  // close scanner stream
	  sc.close();
    }
}	