/*
Write a program to demonstrate NumberFormatException
*/

import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    static void generateException(String text) {
        // Trying to convert non-numeric text into number
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException
    static void handleException(String text) {
        try {
            // Trying to convert non-numeric text into number
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input as String
        System.out.print("Enter a value: ");
        String input = sc.nextLine();

        // Calling method that generates exception
        generateException(input);

        // Calling method that handles exception
        handleException(input);
		
		// Close scanner
		sc.close();
    }
}