/*
Write a program to create a calculator using switch...case.
Hint => 
Create two double variables named first and second and a String variable named op.
Get input values for all variables.
The input for the operator can only be one of the four values: "+", "-", "*" or "/".
Run a for loop from i = 1 to i < number.
Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
If op is neither of those 4 values, print Invalid Operator.
*/

import java.util.Scanner;

// create class Calculator represents operations between two number
public class Calculator{
   public static void main(String[] args){
      
	  // Create scanner class to read input and 
	  // Accept input from user about first and second number and operation
	  
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Input first number");
	  int a = sc.nextInt();
	  
	  System.out.println("Input second number");
	  int b = sc.nextInt();
	  
	  System.out.println("Input the operation");
	  char op = sc.next().charAt(0);
	  
	  // apply switch to perform operations
	  switch(op){
		case '+' :
				System.out.println(a + b);
				break;
		case '-' :
				System.out.println(a - b);
				break;
		case '*' :
				System.out.println(a * b);
				break;
		case '/' :
				System.out.println(a / b);
				break;
	  }
    
	 //close scanner stream
     sc.close();
	}
}	
				