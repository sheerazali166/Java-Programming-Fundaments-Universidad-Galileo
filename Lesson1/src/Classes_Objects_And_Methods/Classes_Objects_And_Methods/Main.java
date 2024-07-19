package Classes_Objects_And_Methods.Classes_Objects_And_Methods;

public class Main {

    public static void main(String[] args) {

        Dog dogHusky = new Dog(70, "Husky");
        Dog dogGermanShepherd = new Dog(45, "German Shepherd");

        System.out.println("------------ Dog Husky ------------");


        dogHusky.bark();
        dogHusky.bark2();

        System.out.println(dogHusky.name);
        System.out.println(dogHusky.size);

        dogHusky.printName("Lion");
        dogHusky.printName("German Shepherd");

        System.out.println("------------------------");

        System.out.println("------------ Dog German Shepherd ------------");

        dogGermanShepherd.bark();
        dogGermanShepherd.bark2();

        System.out.println(dogGermanShepherd.name);
        System.out.println(dogGermanShepherd.size);

        dogGermanShepherd.printName("Tiger");
        dogGermanShepherd.printName("Husky");

        System.out.println("------------------------");

        System.out.println("------------ Person ------------");

        Person person = new Person();

        System.out.println(person.getName("John", "Doe"));
        person.printData("Jannie", "Smith", 22);




    }
}
