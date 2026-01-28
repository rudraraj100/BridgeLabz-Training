package jsondata.question10;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

import java.io.File;

public class MergeJSONFiles {

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Read JSON files
            JsonNode json1 = mapper.readTree(new File(
                "C:\\Users\\Rudra Raj\\OneDrive\\Desktop\\Java workspace\\java-iostreams-practice\\gcr-codebase\\iostream-concept-practice\\src\\main\\resources\\student_list.json"
            ));

            JsonNode json2 = mapper.readTree(new File(
                "C:\\Users\\Rudra Raj\\OneDrive\\Desktop\\Java workspace\\java-iostreams-practice\\gcr-codebase\\iostream-concept-practice\\src\\main\\resources\\students_list.json"
            ));

            // Ensure both are arrays
            ArrayNode mergedArray = mapper.createArrayNode();

            mergedArray.addAll((ArrayNode) json1);
            mergedArray.addAll((ArrayNode) json2);

            // Print merged JSON
            System.out.println("Merged JSON:");
            System.out.println(
                mapper.writerWithDefaultPrettyPrinter()
                      .writeValueAsString(mergedArray)
            );

            // Save merged JSON
            File mergedFile = new File(
                "C:\\Users\\Rudra Raj\\OneDrive\\Desktop\\Java workspace\\java-iostreams-practice\\gcr-codebase\\iostream-concept-practice\\src\\main\\resources\\student_merged.json"
            );

            mapper.writerWithDefaultPrettyPrinter()
                  .writeValue(mergedFile, mergedArray);

            System.out.println("Merged JSON saved to:");
            System.out.println(mergedFile.getAbsolutePath());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
