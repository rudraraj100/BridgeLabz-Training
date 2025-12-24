// Write a Java program to count how many times a given substring occurs in a string.

import java.util.Scanner;

public class SubstringCount {

    // Method to count occurrences of a substring in a string
    public static int countSubstring(String text, String sub) {

        int count = 0;

        // Loop through main string
        for (int i = 0; i <= text.length() - sub.length(); i++) {

            boolean match = true;

            // Check substring match from current position
            for (int j = 0; j < sub.length(); j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }

            // If full substring matched
            if (match) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text = sc.nextLine();

        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();

        // Call method to count occurrences
        int result = countSubstring(text, sub);

        System.out.println("Substring occurs " + result + " times.");

        sc.close();
    }
}