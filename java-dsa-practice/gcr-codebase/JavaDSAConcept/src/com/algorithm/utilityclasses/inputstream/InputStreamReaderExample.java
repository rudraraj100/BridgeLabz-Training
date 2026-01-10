package com.algorithm.utilityclasses.inputstream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class InputStreamReaderExample {
    public static void main(String[] args) {
        // Full path to your file
        String filePath = "C:\\Users\\Rudra Raj\\OneDrive\\Desktop\\Java workspace\\java-dsa-practice\\gcr-codebase\\JavaDSAConcept\\src\\com\\algorithm\\utilityclasses\\inputstream\\example.txt";

        try (
            // Create a FileInputStream to read bytes from the file
            FileInputStream fis = new FileInputStream(filePath);
            // Wrap the byte stream in InputStreamReader to convert bytes to characters
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            // Wrap InputStreamReader in BufferedReader for efficient reading
            BufferedReader br = new BufferedReader(isr)
        ) {
            String line;
            // Read the file line by line and print it
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}