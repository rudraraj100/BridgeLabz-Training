
package jsondata.question12;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.opencsv.CSVReader;

public class CSVtoJSONConverter {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\Rudra Raj\\OneDrive\\Desktop\\Java workspace\\java-iostreams-practice\\gcr-codebase\\iostream-concept-practice\\src\\main\\resources\\students.csv";
        String jsonFile = "C:\\Users\\Rudra Raj\\OneDrive\\Desktop\\Java workspace\\java-iostreams-practice\\gcr-codebase\\iostream-concept-practice\\src\\main\\resources\\students.json";

        try {
            CSVReader reader = new CSVReader(new FileReader(csvFile));
            ObjectMapper mapper = new ObjectMapper();
            ArrayNode studentsArray = mapper.createArrayNode();

            String[] header = reader.readNext(); // Read header line
            String[] line;

            while ((line = reader.readNext()) != null) {
                ObjectNode student = mapper.createObjectNode();

                for (int i = 0; i < header.length; i++) {
                    String key = header[i];
                    String value = line[i];

                    if (key.equalsIgnoreCase("subjects")) {
                        // Split subjects by ';' into JSON array
                        student.putPOJO(key, Arrays.asList(value.split(";")));
                    } else if (key.equalsIgnoreCase("age")) {
                        student.put(key, Integer.parseInt(value));
                    } else {
                        student.put(key, value);
                    }
                }

                studentsArray.add(student);
            }

            // 1️⃣ Print JSON in console
            System.out.println("CSV converted to JSON:");
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(studentsArray));

            // 2️⃣ Save JSON to file
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(jsonFile), studentsArray);
            System.out.println("JSON saved to: " + jsonFile);

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
