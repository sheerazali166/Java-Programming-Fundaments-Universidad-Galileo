package Polymorphism.Screencast_Interfaces_Inheritance_Polymorphism;

public class Human {

    protected String name;

    public Human(String _name) {
        this.name = _name;
    }

    public void printName() {
        System.out.println(this.name);
    }

}
