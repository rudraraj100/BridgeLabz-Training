/*
Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
*/

import java.util.Scanner;

// Class TotalItemsPrice represents total price calculation
public class TotalItemsPrice{
   public static void main(String[] args){
      // Create Scanner object to read input
	  Scanner sc = new Scanner(System.in);
	  
	  // Accept quantity of items and unit price of item
	  System.out.println("Input total quantity of items");
	  int quantity = sc.nextInt();
	  System.out.println("Input the price of an item");
	  float price = sc.nextFloat();
	  
	  // Calculate total price
	  float totalPrice = quantity * price;
	  
	  
	  // Display total purchase price
	  System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + price);
	  
	}
}	
	  