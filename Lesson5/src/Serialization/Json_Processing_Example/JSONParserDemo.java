package Serialization.Json_Processing_Example;

import javax.json.*;
import java.io.FileReader;

public class JSONParserDemo {

    // itne bare bare chhakke simple sawal poochh rahi hai who are you
    // pata nahi and i am great

    public static void main(String[] args) throws Exception {


        // Create the josnReader object with the file location
        JsonReader jsonReader = Json.createReader(new FileReader("data/Student.json"));

        // Creates the json tree structure
        JsonStructure jsonStructure = jsonReader.read();
        JsonObject jsonObject = (JsonObject) jsonStructure;

        // to navigate the The tree we will use a
        // custom method that recursively navigates
        // the complete structure.
        navigateTree(jsonStructure, "Student");



    }

    public static void navigateTree(JsonValue jsonValue, String key) {

        if (key != null) {
            System.out.println("Key: " + key + ": ");

            // Get the element value type, and
            // And depending on the type
            // will execute the code of the matching
            // condition of the switch statement.
            switch (jsonValue.getValueType()) {
                case OBJECT:
                    System.out.println("OBJECT");
                    JsonObject jsonObject = (JsonObject) jsonValue;
                    for (String name: jsonObject.keySet())
                        navigateTree(jsonObject.get(name), name);
                    break;
                case ARRAY:
                    System.out.println("ARRAY");
                    JsonArray jsonArray = (JsonArray) jsonValue;
                    for (JsonValue _jsonValue: jsonArray)
                        navigateTree(_jsonValue, null);
                    break;
                case STRING:
                    JsonString jsonString = (JsonString) jsonValue;
                    System.out.println("STRING" + jsonString.getString());
                    break;
                case NUMBER:
                    JsonNumber jsonNumber = (JsonNumber) jsonValue;
                    System.out.println("NUMBER: " + jsonNumber.toString());
                    break;
                case TRUE:
                case FALSE:
                case NULL:
                    System.out.println(jsonValue.getValueType().toString());
                    break;

            }

        }
    }
}
