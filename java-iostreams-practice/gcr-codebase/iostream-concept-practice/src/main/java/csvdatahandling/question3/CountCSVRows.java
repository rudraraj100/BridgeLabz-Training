
package csvdatahandling.question3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Rudra Raj\\OneDrive\\Desktop\\Java workspace\\java-iostreams-practice\\gcr-codebase\\iostream-concept-practice\\src\\main\\java\\csvdatahandling\\question1\\Student.csv"; // CSV file path

        int rowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Skip the header row
            if ((line = br.readLine()) != null) {
                System.out.println("Header: " + line);
            }

            // Count remaining lines
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) { // skip blank lines
                    rowCount++;
                }
            }


            System.out.println(" Number of records (excluding header): " + rowCount);

        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
