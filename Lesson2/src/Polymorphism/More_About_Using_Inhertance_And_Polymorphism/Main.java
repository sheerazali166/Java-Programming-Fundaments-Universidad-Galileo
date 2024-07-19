package Polymorphism.More_About_Using_Inhertance_And_Polymorphism;

import Polymorphism.More_About_Using_Inhertance_And_Polymorphism.Animal.Animal;
import Polymorphism.More_About_Using_Inhertance_And_Polymorphism.Animal.Bear;
import Polymorphism.More_About_Using_Inhertance_And_Polymorphism.Animal.PolarBear;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal animalPolarBear = new PolarBear();

        System.out.println("----------------");
        System.out.println("-------- Animal Eating --------");

        animal.eat();

        System.out.println("----------------");
        System.out.println("-------- Animal Polar Bear Eating --------");

        animalPolarBear.eat();


        // protected variable can't access by out side class
        // System.out.println(animal.hasEaten);
        // System.out.println(animalBear.color);


    }

}
