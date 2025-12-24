// Write a Java program to remove all occurrences of a specific character from a string.


import java.util.Scanner;

public class RemoveCharacter {

    // Method to remove all occurrences of a given character
    public static String removeCharacter(String text, char removeChar) {

        String result = "";

        // Traverse each character in the string
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Add character only if it is not the one to remove
            if (ch != removeChar) {
                result = result + ch;
            }
        }

        return result; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char removeChar = sc.next().charAt(0);

        // Call method to remove character
        String output = removeCharacter(text, removeChar);

        System.out.println("String after removal: " + output);

        sc.close();
    }
}
