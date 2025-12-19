/*
Rewrite the program 4 FizzBuzz using the while loop 
*/
import java.util.Scanner;

// create a class FizzBuzz represents fizz, buzz and fizzbuzz based on condition
public class FizzBuzzUsingWhile{
   public static void main(String[] args){
	   
      // create a scanner class to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // accept the input from user and assign it int type and craete a variable with value of 1
	  System.out.println("Input a number");
	  int n = sc.nextInt();
	  int i = 1;
		
		// if else statement for indentify it is a positive number or not
		if(n < 0){
			System.out.println("It is not a positive number");
		}
		else{
			
			// apply while loop to display fizz, buzz and fizzbuss based on prior condition
			while(i <=n ){
				if( i % 3 == 0 && i % 5 == 0){
					System.out.println("FizzBuzz");
				}
				else if ( i % 3 == 0){
					System.out.println("Fizz");
				}	
				else if ( i % 5 == 0){
					System.out.println("Buzz");
				}
				else{
					System.out.println(i);
				}
			    i = i + 1;		
			}  
			
		}
		
	  // close scanner stream	
	  sc.close();		
	}
}	