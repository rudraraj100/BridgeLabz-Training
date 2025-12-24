/*
Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
*/

import java.util.Scanner;

public class ShortestLongestWords {

    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
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
                if (!temp.isEmpty()) {
                    words[wordIndex++] = temp;
                    temp = "";
                }
            } else {
                temp += ch;
            }
        }

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

    // Method to find shortest and longest words; returns indices in the array
    public static int[] findShortestLongest(String[][] data) {
        if (data.length == 0) return new int[]{-1, -1};

        int minIndex = 0;
        int maxIndex = 0;
        int minLen = Integer.parseInt(data[0][1]);
        int maxLen = Integer.parseInt(data[0][1]);

        for (int i = 1; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = getWords(text);
        String[][] wordsWithLength = getWordsWithLength(words);
        int[] indices = findShortestLongest(wordsWithLength);

        if (indices[0] != -1) {
            System.out.println("Shortest word: " + wordsWithLength[indices[0]][0] +
                               " (Length: " + wordsWithLength[indices[0]][1] + ")");
            System.out.println("Longest word: " + wordsWithLength[indices[1]][0] +
                               " (Length: " + wordsWithLength[indices[1]][1] + ")");
        } else {
            System.out.println("No words found in the input.");
        }

        sc.close();
    }
}
















