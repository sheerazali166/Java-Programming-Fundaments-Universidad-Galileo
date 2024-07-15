package IO_Example_Of_Files_And_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//Search for Tokens, delimited
public class ScannerFile {

    public static void main(String[] args) {

        Scanner scannerInput = null;

        String pathInput = "/Users/sheeraz/Desktop/JAVA/Lesson3/src/IO_Example_Of_Files_And_IO/listofFigures.txt";

        //Token per Token
        try {
            scannerInput = new Scanner(new BufferedReader(new FileReader(pathInput)));

            while (scannerInput.hasNext()) {
                System.out.print(" > " + scannerInput.next() + "\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (scannerInput != null) {
                scannerInput.close();
            }
        }

    }





}
