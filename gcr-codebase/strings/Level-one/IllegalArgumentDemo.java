/*
Write a program to demonstrate IllegalArgumentException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    static void generateException(String str) {
        // start index > end index → Runtime Exception
        System.out.println(str.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    static void handleException(String str) {
        try {
            // start index > end index → Runtime Exception
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Calling method that generates exception
        generateException(input);

        // Calling method that handles exception
        handleException(input);
		
		// Close scanner
		sc.close();
	}		
}






