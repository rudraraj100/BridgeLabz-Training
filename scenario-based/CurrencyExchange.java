/*
Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.Scanner;

public class CurrencyExchange{

// static scanner to read input
static Scanner sc = new Scanner(System.in);
	
	// method to exchange amount value based on currency
	public static void currencyExchange(double amount){
	
		System.out.println("In which currency you want your amount: (USD / EURO / AUD / CAD)");
		String currency = sc.nextLine().trim().toLowerCase();
		double exchangeAmount = 0;
	
		switch(currency){
			
			case "usd":
				
				exchangeAmount = amount / 89.6;
				System.out.println("\nThe amount in USD currency: " + exchangeAmount);
				break;
				
			case "euro":
				
				exchangeAmount = amount / 105.3;
				System.out.println("\nThe amount in Euro currency: " + exchangeAmount);
				break;

					
			case "aud":
				
				exchangeAmount = amount / 60;
				System.out.println("\nThe amount in Australlian currency: " + exchangeAmount);
				break;	
				
			case "cad":
				
				exchangeAmount = amount / 65.5;
				System.out.println("\nThe amount in Cananda currency: " + exchangeAmount);
				break;
				
			default:
				System.out.println("Invalid currency name");
				
		}
	}	
	// main method 
	public static void main(String[] args){
		
		String choice = "";
		
		// loop for multiple conversion
		do{
		
			System.out.println("Enter the amount in INR: ");
			double amount = sc.nextInt();
			sc.nextLine();
			
			currencyExchange(amount);
			
			System.out.println("\nDo you want to do another conversion? \nyes/no ");
			choice = sc.nextLine().trim().toLowerCase();
			
		}while(choice.equals("yes"));
		
		// scanner close
		sc.close();
		
	}
		
	
}	
			
			
			