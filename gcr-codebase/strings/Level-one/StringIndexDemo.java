/*
Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.Scanner;

public class StringIndexDemo {

    // Method to generate StringIndexOutOfBoundsException
    static void generateException(String str) {
        // Accessing index beyond string length
        System.out.println("Character at invalid index: " + str.charAt(str.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    static void handleException(String str) {
        try {
            // Accessing index beyond string length
            System.out.println("Character at invalid index: " + str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
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