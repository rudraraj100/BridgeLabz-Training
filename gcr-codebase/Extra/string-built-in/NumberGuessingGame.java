/*
Number Guessing Game:
○ Write a Java program where the user thinks of a number between 1 and 100, and
the computer tries to guess the number by generating random guesses.
○ The user provides feedback by indicating whether the guess is high, low, or
correct. The program should be modular, with different functions for generating
guesses, receiving user feedback, and determining the next guess.
*/

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Method to generate a random guess within range
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    // Method to get user feedback
    public static char getUserFeedback(Scanner sc) {
        System.out.print("Is the guess High (h), Low (l), or Correct (c)? ");
        return sc.next().charAt(0);
    }

    // Method to update range based on feedback
    public static void updateRange(char feedback, int guess, int[] range) {
        if (feedback == 'h') {
            range[1] = guess - 1; // Reduce upper bound
        } else if (feedback == 'l') {
            range[0] = guess + 1; // Increase lower bound
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        int attempts = 0;

        System.out.println("Think of a number between 1 and 100 and type ready when you are.");
        System.out.println("I will try to guess it!");
		
		String ready = sc.next();

        while (true) {

            int guess = generateGuess(low, high);
            attempts++;

            System.out.println("My guess: " + guess);

            char feedback = getUserFeedback(sc);

            if (feedback == 'c') {
                System.out.println("I guessed it right in " + attempts + " attempts!");
                break;
            }

            int[] range = { low, high };
            updateRange(feedback, guess, range);

            low = range[0];
            high = range[1];
        }

        sc.close();
    }
}
