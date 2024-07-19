package Polymorphism.More_About_Using_Inhertance_And_Polymorphism.Animal;

public class Animal {

    protected boolean hasEaten;

    public Animal() {
        hasEaten = false;
    }

    public void eat() {
        System.out.println("The animal is eating...");
        hasEaten = true;
    }

}
