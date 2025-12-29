/*
Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/

import java.util.Scanner;

public class DiscountDashboard{
	
	public static void main(String[] args){
		// Scanner object to take user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Total items: ");
		int totalItems = sc.nextInt();
		
		final String gstRate = "5%";
		// Array to store price of each item
		double[] lists = new double[totalItems];
		double totalPrice = 0;
		
			// Loop to take price of each item and calculate total price
			for(int i = 0 ; i < totalItems ; i++){
				System.out.println("Price of " + (i+1) + ":" );
				lists[i] = sc.nextDouble();
				totalPrice += lists[i];
			}
		// Variable to store discount amount
		double discountPrice = 0;
		// Apply discount based on total price
		if( totalPrice >= 499 && totalPrice < 1498  ){
			System.out.println("Congrats you are eligible for 10% offer.");
			discountPrice = totalPrice * 0.1;
		}
		else if(totalPrice >= 1499 && totalPrice < 3498 ){
				System.out.println("Congrats you are eligible for 25% offer.");
				discountPrice = totalPrice * 0.25;
		}
		else if(totalPrice >= 3499 && totalPrice < 8998 ){
				System.out.println("Congrats you are eligible for 35% offer.");
				discountPrice = totalPrice * 0.35;
		}
		else if(totalPrice >= 8999){
				System.out.println("Congrats you are eligible for 50% offer.");
				discountPrice = totalPrice * 0.5;
		}else{
			System.out.println("Sorry, you are not eligible for any offer.");
			discountPrice = 0;
		}
		// Display final bill	
        System.out.println();
		System.out.println("--------The Bill---------");
		System.out.println("Total items      :" + totalItems);
		System.out.println("Total price      :" + totalPrice);
		System.out.println("Discounted price :" + discountPrice);
		System.out.println("Gst rate         :" + gstRate);                
		
		// Final payable amount after discount and GST (5%)
		System.out.println("Total cash to pay:" + ((totalPrice - discountPrice)*0.95));
		System.out.println("-------------------------");
		
		sc.close();
	}
}	
				
				
				
				
				

