/*
Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/

import java.util.Scanner;

public class LuckyDraw{
	
	// main method
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		String choice = "";
		
		// loop for multiple visitors
		do{
				System.out.println("Enter any number: ");
				int n = sc.nextInt();
				sc.nextLine();
				// statement for lucky draw
				if( n % 3 == 0 && n % 5 == 0){
					System.out.println("Congratulation, you have won a lucky draw.");
					
				}
				else if (n <= 0){
					System.out.println("Invalid number, Try again!");
					continue;
				}
				else{
					System.out.println("Sorry, you didnt win any gift");
				}
				
				// asking if any next visitor
				System.out.println("Anymore vistior: yes/no");
				choice = sc.nextLine().trim().toLowerCase();
				
		}
		while(choice.equals("yes"));
		// scanner close
		sc.close();
	}
}	
					