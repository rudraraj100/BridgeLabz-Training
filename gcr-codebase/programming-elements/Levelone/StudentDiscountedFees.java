/*
Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___
*/

import java.util.Scanner;

// Class StudentDiscountedFees represents fee discount calculation
public class StudentDiscountedFees{
   public static void main(String[] args){
	  
      // Create Scanner object to read input	  
	  Scanner sc = new Scanner(System.in);
      
	  // take input of student fee amount and university discount percentage
	  System.out.println("Input the fees: ");
	  float fees = sc.nextFloat()
	  System.out.println("Input the university discount percentage ");
	  float discountPercent = sc.nextFloat();
	  
	  // Calculate discount amount and calculate final fee after discount
	  float discount = fees * (discountPercent/100);
	  float discountPrice = fees - discount;
	  
	  
	  
	  // Display discount amount and final payable fee
	  System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountPrice);
	}
}	