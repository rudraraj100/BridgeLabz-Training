/*
Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result
*/

public class CustomStringMethods {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] trimUsingCharAt(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "   Hello World!   ";

        // Using custom trim method
        int[] indices = trimUsingCharAt(text);
        String trimmedCustom = substringUsingCharAt(text, indices[0], indices[1]);

        // Using built-in trim method
        String trimmedBuiltIn = text.trim();

        // Compare both strings
        boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("Original text: '" + text + "'");
        System.out.println("Trimmed using charAt(): '" + trimmedCustom + "'");
        System.out.println("Trimmed using built-in trim(): '" + trimmedBuiltIn + "'");
        System.out.println("Are both equal? " + isEqual);
    }
}