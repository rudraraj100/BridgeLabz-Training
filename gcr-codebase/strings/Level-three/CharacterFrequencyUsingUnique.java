/*
Write a program to find the frequency of characters in a string using unique characters and display the result
Hint => 
Create a method to Find unique characters in a string using the charAt() method and return them as a 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of characters are used as indexes in the array to store the frequency of each character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies. 
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays result.  
*/

import java.util.Scanner;

public class CharacterFrequencyUsingUnique {

    // Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Nested loop to check duplicates
            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count] = ch;
                count++;
            }
        }

        // Create exact-sized array for unique characters
        char[] uniqueChars = new char[count];
        for (int i = 0; i < count; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency using unique characters
    public static String[][] findFrequency(String text) {

        // Step 1: Frequency array (ASCII)
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Step 2: Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Step 3: Create 2D String array
        String[][] result = new String[uniqueChars.length][2];

        // Step 4: Store characters and their frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequency = findFrequency(input);

        System.out.println("\nCharacter Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + " -> " + frequency[i][1]);
        }

        sc.close();
    }
}
