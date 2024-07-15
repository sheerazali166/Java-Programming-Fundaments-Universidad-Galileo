package IO_Example_Of_Files_And_IO;

import java.io.*;

public class BufferReaders {

    public static void main(String[] args) {

        BufferedReader bufferedReaderInput = null;
        BufferedWriter bufferedWriterOutput = null;

        String pathInput = "/Users/sheeraz/Desktop/JAVA/Lesson3/src/IO_Example_Of_Files_And_IO/listofFigures.txt";
        String pathOutput = "/Users/sheeraz/Desktop/JAVA/Lesson3/src/IO_Example_Of_Files_And_IO/listofFigures_out.txt";

        // Byte per Byte
        try {

            bufferedReaderInput = new BufferedReader(new FileReader(pathInput));
            bufferedWriterOutput = new BufferedWriter(new FileWriter(pathOutput));

            int character;

            while ((character = bufferedReaderInput.read()) != -1) {

                System.out.printf("0x%02X", character);
                System.out.println("\n");
                bufferedWriterOutput.write(character);

            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            if (bufferedReaderInput != null) {

                try {
                    bufferedReaderInput.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (bufferedWriterOutput != null) {
                try {
                    bufferedReaderInput.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }



    }
}
