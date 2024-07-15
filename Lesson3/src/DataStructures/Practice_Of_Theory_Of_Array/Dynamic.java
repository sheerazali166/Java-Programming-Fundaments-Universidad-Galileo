package DataStructures.Practice_Of_Theory_Of_Array;

import java.util.ArrayList;
import java.util.HashMap;

public class Dynamic {

    public static void main(String[] args) {

        System.out.println("----Dynamic Structures----\n");

        // ArrayList
        System.out.println("Empty ArrayList:");
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList);

        System.out.println("\nAdd an element to the ArrayList:");
        arrayList.add("I'm Dynamic");
        System.out.println("My size: " + arrayList.size());

        System.out.println("\nAdd a second element to the Arraylist:");
        arrayList.add("I'm Growing");

        System.out.println(arrayList);
        System.out.println("My size: " + arrayList.size());

        // String Pool
        System.out.println("\n\nCreating String I'm Growing and another one");
        String grow = "I'm Growing", other = "other";
        System.out.println("==compare the direction (pointer) of a Object");
        System.out.println(grow == arrayList.get(1));
        System.out.println(other == arrayList.get(1));
        System.out.println("The two string has the same value so,\nthe String Pool of JVM assign the same direction to the both strings\n\n\n\n");

        // Hashmap
        System.out.println("Empty HashMap:");
        HashMap<Integer, String> hashMap = new HashMap<>();
        System.out.println(hashMap);
        hashMap.put(10, "I'm dynamic");
        System.out.println(hashMap);
        hashMap.put(25,"I'm Growing");
        System.out.println(hashMap);

        // String Pool
        System.out.println("\n\nSee doesn't matter on what Structure the strings are stored");
        System.out.println("String I'm Growing: ");
        System.out.println(arrayList.get(0) == hashMap.get(10));
        // Data Generatic Machine
        // But dynamic has also two types
        System.out.println("String I'm Dynamic: ");
        System.out.println(arrayList.get(1) == hashMap.get(25));
        System.out.println("they all are just a reference to the String Pool");

    }

}
