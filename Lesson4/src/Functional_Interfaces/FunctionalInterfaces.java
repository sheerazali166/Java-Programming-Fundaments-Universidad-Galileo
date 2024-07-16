package Functional_Interfaces;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        // Create a new Grocery Store List
        // Arrays.asList: Returns a fixed-size list backed by the specified array
        // To be dynamic use LinkedList
        List<Product> productList = new LinkedList<Product>(
                Arrays.asList(
                        new Product(0, "Tomato", "Fruit", 1.75f),
                        new Product(1, "Avocado", "Fruit", 5f),
                        new Product(2, "Lemon", "Fruit", 0.5f),
                        new Product(3, "Onion", "Vegetable", 1.50f),
                        new Product(4, "Carret", "Vegetable", 1.25f),
                        new Product(5, "Brocolli", "Vegetable", 2f),
                        new Product(6, "Shrimp", "Seafood", 10.99f),
                        new Product(7, "Chicken", "Meat", 1.35f),
                        new Product(8, "Roast Beef", "Meat", 8.35f)
                )
        );

        // Print each of the products
        System.out.println("Original List:");
        productList.forEach(product -> System.out.println(product));

        // Predicate filter of meat categorie
        Predicate<Product> productPredicate = (Product product) -> "Meat".equals(product.categorie);

        // Remove Meat Categorie
        productList.removeIf(productPredicate);

        // Print each of the products
        System.out.println("\n\nWithout Meat List:");
        productList.forEach(product -> System.out.println(product));

        // Predicate filter of expensive products
        Predicate<Product> expensiveProductPredicate = (Product product) -> product.price > 5f;

        // Remove Expensive Product
        productList.removeIf(expensiveProductPredicate);

        // Print each of the products
        System.out.println("\n\nWithout expensive & Meat List:");
        productList.forEach(product -> System.out.println(product));

        // Just Filter First Fruit Without eliminating the other products
        System.out.println("\n\nFilter First Fruit:");
        System.out.println(productList.stream().filter((Product product) -> product.categorie.equals("Fruit")).findFirst());

        // Filter Fruit new List
        System.out.println("\n\nFilter All Fruit:");
        System.out.println(
                productList.stream().filter((Product product) -> product.categorie.equals("Fruit")).collect(Collectors.toList()));

        // Print each of the products
        System.out.println("\nDon't eliminate the other products just filter:");
        productList.forEach(product -> System.out.println(product));

    }
}

class Product {

    public int id;
    public String name, categorie;
    public float price;

    public Product(int _id, String _name, String _categorie, float _price) {
       this.id = _id;
       this.name = _name;
       this.categorie = _categorie;
       this.price = _price;
    }

    public String toString() {
        return (this.name + (new DecimalFormat(" $0.00")).format(this.price));
    }

}
