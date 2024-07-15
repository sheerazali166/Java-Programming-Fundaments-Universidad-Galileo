package DataStructures.Screencast_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Bananas");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input EXIT when you are finished");
        String item = "";

        do {
            item = scanner.next();

            if (!arrayList.contains(item) && !item.contains("EXIT")){
                arrayList.add(item);
            }
        } while (!item.equals("EXIT"));

        System.out.println(arrayList);

    }

}
