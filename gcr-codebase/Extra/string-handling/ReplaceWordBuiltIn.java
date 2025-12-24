// Write a replace method in Java that replaces a given word with another word in a sentence:

import java.util.Scanner;

public class ReplaceWordBuiltIn {

    public static void main(String[] args) {
		// create scanner class to read input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();

        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();

        // Replace all occurrences of oldWord with newWord
        String result = sentence.replace(oldWord, newWord);

        System.out.println("Updated sentence: " + result);

        sc.close();
    }
}
