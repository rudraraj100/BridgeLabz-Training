/*
Write an IntOperation program by taking a, b, and c as input values and 
print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. 
Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, and c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign the result to a variable
Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___
*/

import java.util.Scanner;

// Class IntOperation represents arithmetic operations with int values
public class IntOperation{ 
   public static void main(String[] args){
	  
	  // Create Scanner object to read input
      Scanner sc = new Scanner(System.in);
	  
	  // Accept three integer values from user
	  System.out.println("Input variable a");
	  int a = sc.nextInt();
	  System.out.println("Input variable b");
	  int b = sc.nextInt();
	  System.out.println("Input variable c");
	  int c = sc.nextInt();
	  
	  // Perform different arthimetic operations
	  int operation1 = a + b * c;
	  int operation2 = a * b + c;
	  int operation3 = c + a / b;
	  int operation4 = a % b + c;
	  
	  
	  // Display the result of all the arthimetic operations
	  System.out.println("The result of the operations are " + operation1 + ", " + operation2 + ", "+ operation3 + " and " + operation4);
	}
}	  
	  


