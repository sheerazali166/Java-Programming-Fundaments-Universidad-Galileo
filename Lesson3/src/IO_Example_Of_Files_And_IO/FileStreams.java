package IO_Example_Of_Files_And_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Just reading bytes
public class FileStreams {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        String pathInput = "/Users/sheeraz/Desktop/JAVA/Lesson3/src/IO_Example_Of_Files_And_IO/listofFigures.txt";
        String pathOutput = "/Users/sheeraz/Desktop/JAVA/Lesson3/src/IO_Example_Of_Files_And_IO/listofFigures_out.txt";

        // Byte per Byte
        try {
            fileInputStream = new FileInputStream(pathInput);
            fileOutputStream = new FileOutputStream(pathOutput);

            int character;

            while ((character = fileInputStream.read()) != -1) {
                System.out.printf("0x%02X", character);
                System.out.println("\n");
                fileOutputStream.write(character);

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream != null) {
                fileInputStream.close();
            }
        }

    }

}
