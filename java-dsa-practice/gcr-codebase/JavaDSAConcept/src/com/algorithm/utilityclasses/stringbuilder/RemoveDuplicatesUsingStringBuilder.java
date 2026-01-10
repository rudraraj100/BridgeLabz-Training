package com.algorithm.utilityclasses.stringbuilder;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesUsingStringBuilder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Step 1: Create StringBuilder
        StringBuilder sb = new StringBuilder();

        // Step 2: Create HashSet to track characters
        HashSet<Character> set = new HashSet<>();

        // Step 3: Traverse each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Step 4: If not already seen, append it
            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }

        // Step 5: Convert StringBuilder to String
        String result = sb.toString();

        System.out.println("String without duplicates: " + result);
    }
}