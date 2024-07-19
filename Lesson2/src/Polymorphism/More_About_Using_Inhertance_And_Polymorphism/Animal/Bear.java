package Polymorphism.More_About_Using_Inhertance_And_Polymorphism.Animal;

public class Bear extends Animal {

    public String color;

    public Bear(String _color) {

        super();
        this.color = _color;

    }

    public void eat() {
       super.eat();
        System.out.println("The bear went fishing before eating.");
    }


}
