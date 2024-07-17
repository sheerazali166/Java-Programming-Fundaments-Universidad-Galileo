package Serialization.SAX_Parse_Code_Example;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.ArrayList;
import java.util.List;

public class SAXParserDemo {

    public static void main(String[] args) throws Exception {

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        // you can't protect currupt doggi mama spelling should be correct
        SAXHAndler saxhAndler = new SAXHAndler();

        saxParser.parse(ClassLoader.getSystemResourceAsStream("data/Student.xml"), saxhAndler);

    }

}

/**
 * The Handler for SAX Events.
*/
class SAXHAndler extends DefaultHandler {

    List<Student> studentList;
    Student student;
    String content = null;

    public void startDocument() throws SAXException {
        studentList = new ArrayList<>();
    }

    //Triggered when the start of tag is found.
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        switch (qName) {
            //Create a new Student object when the start tag is found
            case "student":
                student = new Student();
                student.id = attributes.getValue("id");
                student.active = attributes.getValue("active");
                break;

        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        switch (qName) {
            //Add the Student to list once end tag is found
            case "student":
                studentList.add(student);
                break;
            // For all other end tags the Student has to be updated.
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

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    @Override
    public void endDocument() throws SAXException {
        //Printing the list of Students obtained from XML
        for (Student _student: studentList) {
            System.out.println(_student);
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