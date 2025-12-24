/*
Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result
*/

import java.util.Scanner;

public class StringLength {

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            // Infinite loop
            while (true) {
                text.charAt(count); // will throw exception at invalid index
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception caught when index exceeds string length
            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input using next()
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Calling user-defined method
        int customLength = findLength(input);

        // Using built-in method
        int builtInLength = input.length();

        // Displaying results
        System.out.println("Length without using length(): " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);
		
		// Close scanner
		sc.close();
    }
}