package Inheritance_And_Inheritance_Screencast;

public class F1Car extends Car{

    public F1Car(int _topSpeed) {
        super(_topSpeed);
    }

    public void printDescription() {
        System.out.println("F1 Car");
    }
}
