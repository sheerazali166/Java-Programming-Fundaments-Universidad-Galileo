package Inheritance_And_Inheritance_Screencast;

public class Main {

    public static void main(String[] args) {

        Car carFerrari = new F1Car(320);
        Car carCop = new Car(220);

        carFerrari.printDescription();
        carCop.printDescription();
    }



}
