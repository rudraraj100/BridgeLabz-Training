package com.algorithm.utilityclasses.challenge;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;

public class PerformanceComparison {
    public static void main(String[] args) {
        // Path to the large file
        String filePath = "C:\\Users\\Rudra Raj\\OneDrive\\Desktop\\Java workspace\\java-dsa-practice\\gcr-codebase\\JavaDSAConcept\\src\\com\\algorithm\\utilityclasses\\challenge\\LargeFile.txt";

        // Strings for concatenation test
        String sample = "hello";

        // --------------------------
        // 1. StringBuilder Test
        // --------------------------
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append(sample);
        }
        long endTime = System.currentTimeMillis();
        double sbTime = (endTime - startTime) / 1000.0;
        System.out.println("Time taken by StringBuilder: " + sbTime + " seconds");

        // --------------------------
        // 2. StringBuffer Test
        // --------------------------
        startTime = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < 1_000_000; i++) {
            sbuf.append(sample);
        }
        endTime = System.currentTimeMillis();
        double sbufTime = (endTime - startTime) / 1000.0;
        System.out.println("Time taken by StringBuffer: " + sbufTime + " seconds");

        // --------------------------
        // 3. FileReader Test
        // --------------------------
        int wordCountFR = 0;
        startTime = System.currentTimeMillis();
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                // Split by whitespace and count words
                String[] words = line.split("\\s+");
                wordCountFR += words.length;
            }

        } catch (IOException e) {
            System.out.println("Error reading file with FileReader: " + e.getMessage());
        }
        endTime = System.currentTimeMillis();
        double frTime = (endTime - startTime) / 1000.0;
        System.out.println("FileReader: Word count = " + wordCountFR + ", Time = " + frTime + " seconds");

        // --------------------------
        // 4. InputStreamReader Test
        // --------------------------
        int wordCountISR = 0;
        startTime = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCountISR += words.length;
            }

        } catch (IOException e) {
            System.out.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
        endTime = System.currentTimeMillis();
        double isrTime = (endTime - startTime) / 1000.0;
        System.out.println("InputStreamReader: Word count = " + wordCountISR + ", Time = " + isrTime + " seconds");
    }
}