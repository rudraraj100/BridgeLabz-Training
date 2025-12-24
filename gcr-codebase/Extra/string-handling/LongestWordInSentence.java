// Write a Java program that takes a sentence as input and returns the longest word in the sentence.

import java.util.Scanner;

public class LongestWordInSentence {

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {

        String longestWord = "";
        String currentWord = "";

        // Traverse each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            // Build word until space is found
            if (ch != ' ') {
                currentWord = currentWord + ch;
            } else {
                // Compare lengths when a word ends
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = ""; // Reset for next word
            }
        }

        // Final check for the last word
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }

        return longestWord;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Call method to find longest word
        String result = findLongestWord(sentence);

        System.out.println("Longest word: " + result);

        sc.close();
    }
}