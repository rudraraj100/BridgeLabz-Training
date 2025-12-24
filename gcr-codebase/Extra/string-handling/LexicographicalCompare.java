// Write a Java program to compare two strings lexicographically (dictionary order) without
// using built-in compare methods.


import java.util.Scanner;

public class LexicographicalCompare {

    // Method to compare two strings lexicographically
    public static int compareStrings(String s1, String s2) {

        int minLength = s1.length() < s2.length() ? s1.length() : s2.length();

        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // If characters differ, return ASCII difference
            if (c1 != c2) {
                return c1 - c2;
            }
        }

        // If all characters matched, compare lengths
        return s1.length() - s2.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int result = compareStrings(s1, s2);

        // Interpret comparison result
        if (result == 0) {
            System.out.println("Both strings are equal.");
        } else if (result < 0) {
            System.out.println( s1 + " string comes before " + s2 + " in lexicographical order.");
        } else {
            System.out.println(s2 + " string comes before " + s1 + " in lexicographical order.");
        }

        sc.close();
    }
}
