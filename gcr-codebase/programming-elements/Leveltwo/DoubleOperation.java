/*
Similarly, write the DoubleOpt program by taking double values and doing the same operations.
*/

import java.util.Scanner;

// Class DoubleOperation represents arithmetic operations with double values
public class DoubleOperation{ 
   public static void main(String[] args){
      //Create Scanner object to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // Accept three double values from user
	  System.out.println("Input variable a");
	  double a = sc.nextDouble();
	  System.out.println("Input variable b");
	  double b = sc.nextDouble();
	  System.out.println("Input variable c");
	  double c = sc.nextDouble();
	  
	  // Perform arthimetic operations
	  double operation1 = a + b * c;
	  double operation2 = a * b + c;
	  double operation3 = c + a / b;
	  double operation4 = a % b + c;
	  
	  // Display the results of all operations
	  System.out.println("The result of the operations are " + operation1 + ", " + operation2 + ", "+ operation3 + " and " + operation4);
	}
}	