
package jsondata.question9;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

import java.util.Set;
import java.io.File;
import java.net.URI;
@SuppressWarnings("deprecation")
public class ValidateEmailNoMaven {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // 1️⃣ Read JSON file
            JsonNode jsonNode = mapper.readTree(new File("C:\\\\Users\\\\Rudra Raj\\\\OneDrive\\\\Desktop\\\\Java workspace\\\\java-iostreams-practice\\\\gcr-codebase\\\\iostream-concept-practice\\\\src\\\\main\\\\resources\\\\students.json"));

            // 2️⃣ Load JSON Schema
            JsonSchemaFactory schemaFactory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);
            JsonSchema schema = schemaFactory.getSchema(new File("C:\\Users\\Rudra Raj\\OneDrive\\Desktop\\Java workspace\\java-iostreams-practice\\gcr-codebase\\iostream-concept-practice\\src\\main\\resources\\student_schema.json").toURI());

            // 3️⃣ Validate JSON against schema
            Set<ValidationMessage> errors = schema.validate(jsonNode);

            if (errors.isEmpty()) {
                System.out.println("JSON is valid! Email is correct.");
            } else {
                System.out.println("JSON validation errors:");
                errors.forEach(System.out::println);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
