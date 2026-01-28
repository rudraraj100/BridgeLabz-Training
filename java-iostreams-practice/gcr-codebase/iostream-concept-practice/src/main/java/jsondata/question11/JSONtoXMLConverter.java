package jsondata.question11;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class JSONtoXMLConverter {

    public static void main(String[] args) {
        try {
            ObjectMapper jsonMapper = new ObjectMapper();
            XmlMapper xmlMapper = new XmlMapper();

            // Read JSON
            File jsonFile = new File(
                "C:\\Users\\Rudra Raj\\OneDrive\\Desktop\\Java workspace\\java-iostreams-practice\\gcr-codebase\\iostream-concept-practice\\src\\main\\resources\\students.json"
            );

            JsonNode jsonNode = jsonMapper.readTree(jsonFile);

            // Wrap array inside a single root
            ObjectNode rootNode = jsonMapper.createObjectNode();
            rootNode.set("students", jsonNode);

            // Convert to XML
            String xmlContent =
                    xmlMapper.writerWithDefaultPrettyPrinter()
                             .writeValueAsString(rootNode);

            System.out.println("Converted XML:");
            System.out.println(xmlContent);

            // Save XML
            File xmlFile = new File(
                "C:\\Users\\Rudra Raj\\OneDrive\\Desktop\\Java workspace\\java-iostreams-practice\\gcr-codebase\\iostream-concept-practice\\src\\main\\resources\\students_merged.xml"
            );

            xmlMapper.writerWithDefaultPrettyPrinter()
                     .writeValue(xmlFile, rootNode);

            System.out.println("XML saved successfully at:");
            System.out.println(xmlFile.getAbsolutePath());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
