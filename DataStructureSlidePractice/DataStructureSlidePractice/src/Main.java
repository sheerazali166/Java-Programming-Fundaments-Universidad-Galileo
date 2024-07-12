import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Kinza Sheikh Chocolaty");

        // Array Creation

        // Example 1
        int[] numbers = new int[3];

        // Example 2
        int[] nums = new int[3];

        int[] nums2 = new int[] { 78, 23, 41 };

        // Example 3
        int[] nums3 = new int[3];
        int[] nums4 = new int[] { 78, 23, 41 };

        int[] nums5 = { 78, 23, 41 }; // Shortcut

        System.out.println(78 + 23 + 41);
        System.out.println(41 + 23);
        System.out.println(64 - 78);

        // Array

        // Example 1
        int[] trekkies1;
        int[] trekkies2;
        int trekkies3[];
        int trekkies4[];

        // Example 2
        int[] trekkies5, trekkies6;

        // vs

        int trekkies7[], trekkies8;

        System.out.println("<<<<<<<<**********--------------**********>>>>>>>>");
        System.out.println("<<<<<<<<<*********** Example 2 ***********>>>>>>>>");
        System.out.println("<<<<<<*******---- java.util.Arrays ----******>>>>>");
        System.out.println("<<<<<<<<**********--------------**********>>>>>>>>");

        // java.util.Arrays
        String[] jlangs = {"Java", "Ceylon", "Kotlin"};
        System.out.println(jlangs.length); // 3

        System.out.println(jlangs[0]); // Java
        System.out.println(jlangs[1]); // Ceylon
        System.out.println(jlangs[2]); // Kotlin

        System.out.println("<<<<<<<<**********--------------**********>>>>>>>>");
        System.out.println("<<<<<<<<<*********** Example 2 ***********>>>>>>>>");
        System.out.println("<<<<<<**** java.util.Arrays - toString() ****>>>>>");
        System.out.println("<<<<<<<<**********--------------**********>>>>>>>>");


        // java.util.Arrays - toString()
        String[] jlangs2 = {"java", "ceylon", "kotlin"};

        for (int i = 0; i < jlangs2.length; i++) {
            System.out.println(jlangs2[i]);
        }

        System.out.println("<<<<<<<<**********--------------**********>>>>>>>>");
        System.out.println("<<<<<<<<<*********** Example 3 ***********>>>>>>>>");
        System.out.println("<<<<<<**** java.util.Arrays - toString() ****>>>>>");
        System.out.println("<<<<<<<<**********--------------**********>>>>>>>>");


        // java.util.Arrays - toString()
        String[] jlangs3 = {"java", "ceylon", "kotlin"};
        for (String lang: jlangs3) {
            System.out.println(lang);
        }

        System.out.println("<<<<<<<<**********--------------**********>>>>>>>>");
        System.out.println("<<<<<<<<<*********** Example 4 ***********>>>>>>>>");
        System.out.println("<<<<<<**** java.util.Arrays - toString() ****>>>>>");
        System.out.println("<<<<<<<<**********--------------**********>>>>>>>>");


        // java.util.Arrays - toString()
        String[] jlangs4 = {"java", "ceylon", "kotlin"};
        System.out.println(Arrays.toString(jlangs4));

        System.out.println("<<<<<<<<**********--------------**********>>>>>>>>");
        System.out.println("<<<<<<<<<*********** Example 1 ***********>>>>>>>>");
        System.out.println("<<<<<<<****** java.util.Arrays - sort ******>>>>>>");
        System.out.println("<<<<<<<<**********--------------**********>>>>>>>>");


        // java.util.Arrays - sort()
        int[] numbers2 = {6, 9, 1};
        for (int num: numbers2) {
            System.out.print(num);
        }

        System.out.print("\n");

        Arrays.sort(numbers2);



        for (int num: numbers2) {
            System.out.print(num);
        }

        System.out.print("\n");

        System.out.println(691-169);

        // java.util.Arrays - binarySearch()

        System.out.println("<<<<<<<<**********--------------**********>>>>>>>>");
        System.out.println("<<<<<<<<<*********** Example 1 ***********>>>>>>>>");
        System.out.println("<<<<<<<****** java.util.Arrays - binarySearch() ******>>>>>>");
        System.out.println("<<<<<<<<**********--------------**********>>>>>>>>");

        int[] numbers3 = {2, 7, 10, 16};

        for (int num: numbers3) System.out.print(num);

        System.out.print("\n");

        Arrays.binarySearch(numbers3, 2);

        // Multidimensional

        // Example 1
        String[][] notSoSquare = new String[3][2];

        // Example 2
        int[][] multidimensional = {{3, 4}, {9}, {6, 81, 789}};

        // Example 3
        int[][] intNumbers = new int[3][2];
        intNumbers[0][0] = 2;
        intNumbers[0][1] = 4;
//        intNumbers[0][2] = 8;
        intNumbers[1][0] = 16;
        intNumbers[1][1] = 32;
//        intNumbers[1][2] = 64;
        intNumbers[2][0] = 128;
        intNumbers[2][1] = 256;
//        intNumbers[2][2] = 512;



        for (int i = 0; i < intNumbers.length; i++) {
            for (int j = 0; j < intNumbers[i].length; j++)
                System.out.println(intNumbers[i][j] + " u");

            System.out.println(); // new row
        }

        // ArrayList

        // Example 1
        ArrayList col1 = new ArrayList();
        ArrayList col2 = new ArrayList(10); // allocate
        ArrayList col3 = new ArrayList(col2); // C

        // Old Java ArrayList

        // Example 1
        ArrayList list = new ArrayList();
        list.add("Java"); // ["Java"]
        list.add(Boolean.TRUE);
        System.out.println(list); //[Java, true]
        // Java - Java = true

        // Example 2
        List<String> langs = new ArrayList<>();
        langs.add("java"); // [Java]
        langs.add(1, "Ceylon"); // [Java, Ceylon]
        langs.add(0, "Kotlin"); // [Kotlin, Java, Ceylon] || [Kotlin, Java, Ceylon, Groovy]
        langs.add(1, "Groovy"); // [Kotlin, Groovy Java, Ceylon] || [Groovy, Java, Ceylon, Groovy]

        for (String lang: langs) {
            System.out.println(lang);
        }

        // i don't ceylon i have allergy

        // ArrayList - remove()

        // Fisrt matching value
        List<String> langs2 = new ArrayList<>();
        langs2.add("Java"); // [Java]
        langs2.add("Java"); // [Java, Java]

        System.out.println("<<<<<<<------------------->>>>>>>>>");

        System.out.println(langs2.remove("Clojure")); // false
        System.out.println(langs2.remove("Java")); // true
        System.out.println(langs2.remove(langs2.remove(0))); // java
        System.out.println(langs2);

        // ArrayList - set()
        List<String> langs3 = new ArrayList<>();
        langs3.add("Java"); // [Java]


        System.out.println(langs3.size()); // 1

        langs3.set(0, "Ceylon"); // [Ceylon]
        System.out.println(langs3.size()); // 1

        // langs3.set(1, "Kotlin"); // IndexOutOfBoundException()
        //Index 1 out of bounds for length

        // this is ?
        // langs3.add("Kotlin"); // [Kotlin]

        System.out.println("<<<<<<<------------------->>>>>>>>>");

        // Array - Array = List

        // ArrayList - Array
        List<String> list2 = new ArrayList<>();

        list2.add("Java");
        list2.add("Ceylon");

        Object[] object = list2.toArray();
        System.out.println(object.length); // 2

        String[] stringArray = list2.toArray(new String[0]);
        System.out.println(stringArray.length); // 2

        System.out.println("<<<<<<<------------------->>>>>>>>>");

        // Hashmap - put()
        HashMap<Integer, String> hlangs = new HashMap<Integer, String>();

        hlangs.put(1995, "Java");
        hlangs.put(2011, "Ceylon");
        hlangs.put(2012, "Kotlin");

        System.out.println(1995 - 2011);
        System.out.println(1995 - 2012);
        System.out.println(1995 - 20);
        System.out.println(1995 - 12);
        System.out.println(1975 - 1983);

        // Hashmap - putAll()

        // Example 1
        HashMap<Integer, String> vmlangs = new HashMap<Integer, String>();
        vmlangs.putAll(hlangs);

        System.out.println("<<<<<<<------------------->>>>>>>>>");

        // Hashmap - get()
        String theAllMightyLang = hlangs.get(1995); // Java
        System.out.println(theAllMightyLang);

        // Hashmap - remove()
        hlangs.remove(1995); // Java

        System.out.println(Arrays.asList(hlangs)); // [{2011 = Ceylon, 2012 = Kotlin}]

        }
    }
