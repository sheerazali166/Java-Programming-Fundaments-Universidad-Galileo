package DataStructures.Screencast_Hashmap;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMapMonths = new HashMap<>();

        hashMapMonths.put(1, "January");
        hashMapMonths.put(2, "Fabuary");
        hashMapMonths.put(3, "March");
        hashMapMonths.put(4, "April");
        hashMapMonths.put(5, "May");
        hashMapMonths.put(6, "June");
        hashMapMonths.put(7, "July");
        hashMapMonths.put(8, "August");
        hashMapMonths.put(9, "September");
        hashMapMonths.put(10, "October");
        hashMapMonths.put(11, "November");
        hashMapMonths.put(12, "December");

        System.out.println(hashMapMonths.get(1));
        System.out.println(hashMapMonths.get(12));
        System.out.println(hashMapMonths.get(13)); // This will give you a null value

        HashMap<String, String> hashMapCountries = new HashMap<>();

        hashMapCountries.put("GTM", "Guatemala");
        hashMapCountries.put("USA", "United States Of America");
        hashMapCountries.put("CHN", "China");
        hashMapCountries.put("ESP", "Spain");

        hashMapCountries.forEach((code, name) -> System.out.println("code: " + code + " name: " + name));


    }

}
