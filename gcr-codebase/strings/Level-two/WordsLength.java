/*
Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
*/

import java.util.Scanner;

public class WordsLength {

    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception when index exceeds
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words without using split()
    public static String[] getWords(String text) {
        text = text.trim();
        int length = findLength(text);

        // Count spaces to determine number of words
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        String temp = "";

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (!temp.isEmpty()) { // skip multiple spaces
                    words[wordIndex++] = temp;
                    temp = "";
                }
            } else {
                temp += ch;
            }
        }

        // Last word
        if (!temp.isEmpty()) {
            words[wordIndex] = temp;
        }

        return words;
    }

    // Method to create 2D array of words and their lengths
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to display words and lengths in tabular format
    public static void displayWordsWithLength(String[][] data) {
        System.out.printf("%-15s%s%n", "Word", "Length");
        System.out.println("--------------------");
        for (int i = 0; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            System.out.printf("%-15s%d%n", data[i][0], len);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = getWords(text);                 // Split text into words
        String[][] wordsWithLength = getWordsWithLength(words); // Create 2D array
        displayWordsWithLength(wordsWithLength);        // Display table

        sc.close();
    }
}

	
	
	