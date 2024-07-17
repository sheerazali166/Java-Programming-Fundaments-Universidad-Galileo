package Serialization.DOM_Parser_Example;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.List;

public class DOMParser {

    public static void main(String[] args) throws Exception{

        // Get the DOM Builder Factory
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        // Get the DOM Builder
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        // Load and Parse the XML document
        // Object document contains the complete XML as a Tree.
        Document document = documentBuilder.parse(ClassLoader.getSystemResourceAsStream("data/Student.xml"));

        List<Student> studentList = new ArrayList<>();

        // Iterating through the nodes list and extracting the data.
        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {

            // We have encountered an <Student> tag.
            Node node = nodeList.item(i);

            // Check if the current node is an instance of element
            if (node instanceof Element) {
                Student student = new Student();

                // Check if the current node is a student tag
                if (node.getNodeName() == "student") {
                    NamedNodeMap namedNodeMap = node.getAttributes();

                    // get the student id & active attributes
                    student.id = namedNodeMap.getNamedItem("id").getNodeValue();
                    student.active = namedNodeMap.getNamedItem("active").getNodeValue();

                }

                // We get a list of the child nodes of student element
                NodeList nodeListChildNodes = node.getChildNodes();

                for (int j = 0; j < nodeListChildNodes.getLength(); j++) {
                    Node innerNode = nodeListChildNodes.item(j);

                    // Identifying the child tag of Student encountered.
                    if (innerNode instanceof Element) {

                        // We get the last child of the current tag,
                        // the last child will be the text node
                        String content = innerNode.getLastChild().getNodeValue().trim();

                        switch (innerNode.getNodeName()) {
                            case "firstName":
                                student.firstName = content;
                                break;
                            case "lastName":
                                student.lastName = content;
                                break;
                            case "location":
                                student.location = content;
                                break;
                        }
                    }

                }

                studentList.add(student);

            }

        }

        // Printing the Student list populated.
        for (Student student: studentList) {
            System.out.println(student);
        }

    }

}

class Student {

    String id;
    String active;
    String firstName;
    String lastName;
    String location;

    @Override
    public String toString() {
        return firstName + " " + lastName + "(" + id + ")" + location + " Active: " + active;
    }
}
