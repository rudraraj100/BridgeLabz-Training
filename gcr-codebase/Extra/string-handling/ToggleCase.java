// Write a Java program to toggle the case of each character in a given string. 
// Convert uppercase letters to lowercase and vice versa.

import java.util.Scanner;

public class ToggleCase {

    // Method to toggle case of each character in a string
    public static String toggleCase(String text) {

        String result = "";

        // Traverse each character in the string
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Convert uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char) (ch + 32);
            }
            // Convert lowercase to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                result = result + (char) (ch - 32);
            }
            // Keep other characters unchanged
            else {
                result = result + ch;
            }
        }

        return result; // Return toggled string
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call method to toggle case
        String output = toggleCase(text);

        System.out.println("String after toggling case: " + output);

        sc.close();
    }
}
