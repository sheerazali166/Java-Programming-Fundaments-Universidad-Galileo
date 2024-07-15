package IO_Example_Of_Files_And_IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Just reading bytes
public class FileReaders {

    public static void main(String[] args) {

        FileReader fileReaderInput = null;
        FileWriter fileWriterOutput = null;

        String pathInput = "/Users/sheeraz/Desktop/JAVA/Lesson3/src/IO_Example_Of_Files_And_IO/listofFigures.txt";
        String pathOutput = "/Users/sheeraz/Desktop/JAVA/Lesson3/src/IO_Example_Of_Files_And_IO/listofFigures_out.txt";


        // Byte per byte
        try {
            fileReaderInput = new FileReader(pathInput);
            fileWriterOutput = new FileWriter(pathOutput);

            int character;

            while ((character = fileReaderInput.read()) != -1) {
                System.out.printf("0x%02X", character);
                System.out.print("\n");
                fileWriterOutput.write(character);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (fileReaderInput != null) {
                try {
                    fileReaderInput.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fileWriterOutput != null) {
                try {
                    fileWriterOutput.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}
