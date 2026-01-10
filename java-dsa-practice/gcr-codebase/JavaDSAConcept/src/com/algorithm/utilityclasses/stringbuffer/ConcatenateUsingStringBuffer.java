package com.algorithm.utilityclasses.stringbuffer;
public class ConcatenateUsingStringBuffer {
    public static void main(String[] args) {

        String[] words = {"Java", " ", "Full", " ", "Stack", " ", "Developer"};

        // Step 1: Create StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Step 2: Append each string
        for (String word : words) {
            sb.append(word);
        }

        // Step 3: Convert to String
        String result = sb.toString();

        System.out.println("Concatenated String: " + result);
    }
}