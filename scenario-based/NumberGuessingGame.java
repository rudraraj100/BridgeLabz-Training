/*
The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.
*/

import java.util.Scanner;

public class NumberGuessingGame{

	public static void main(String[] args){
		// scanner class to read input
		Scanner sc = new Scanner(System.in);
		
		// random number
		int randomNum = (int) (Math.random() * (100+1-1) + 1);
		int count = 1;
		System.out.println("guess number between 1 to 100: ");
		do{
			// accept input from user
			int guess = sc.nextInt();
			
			// checking the guess
			if (guess != randomNum && guess > randomNum){
				System.out.println("Your guess is high.");
			}else if (guess != randomNum && guess < randomNum){
					System.out.println("Your guess is low.");
			}else if(guess == randomNum){
				System.out.println("Congrats, You got the number ;)");
				break;
			}else{
					System.out.println("Invalid number.");
			}
			count++;
		}
		while( count < 6);
		// display if the user lose
		if (count == 6){
			System.out.println("You lost the game :( and actaul number is: " + randomNum);
		}
		// scanner close
		sc.close();	
			
				
				
	}
}	