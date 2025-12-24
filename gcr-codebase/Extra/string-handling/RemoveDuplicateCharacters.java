//Write a Java program to remove all duplicate characters from a given string and return the modified string.


import java.util.Scanner;

public class RemoveDuplicateCharacters {

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String text) {

        String result = ""; // Stores characters without duplicates

        // Traverse each character of the input string
        for (int i = 0; i < text.length(); i++) {

            char currentChar = text.charAt(i);
            boolean isDuplicate = false; // Flag to check duplication

            // Check if character already exists in result
            for (int j = 0; j < result.length(); j++) {
                if (currentChar == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            // Add character only if it is not a duplicate
            if (!isDuplicate) {
                result = result + currentChar;
            }
        }

        return result; // Return final string
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call method to remove duplicates
        String output = removeDuplicates(text);

        System.out.println("String after removing duplicates: " + output);

        sc.close(); // Close scanner
    }
}
