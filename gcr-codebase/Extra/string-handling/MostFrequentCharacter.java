// Write a Java program to find the most frequent character in a string.

import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find the most frequent character in a string
    public static char findMostFrequentChar(String text) {

        int[] freq = new int[256]; // Frequency array for ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') { // Ignore spaces
                freq[ch]++;
            }
        }

        char mostFrequent = '\0';
        int maxCount = 0;

        // Find character with maximum frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ' && freq[ch] > maxCount) {
                maxCount = freq[ch];
                mostFrequent = ch;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = findMostFrequentChar(text);

        System.out.println("Most frequent character: " + result);

        sc.close();
    }
}
