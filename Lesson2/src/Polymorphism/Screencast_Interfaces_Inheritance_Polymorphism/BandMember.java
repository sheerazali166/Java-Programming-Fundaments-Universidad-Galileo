package Polymorphism.Screencast_Interfaces_Inheritance_Polymorphism;

public class BandMember extends Human implements Vocalist, Guitarist {

    public BandMember(String _name) {
        super(_name);
    }

    @Override
    public void printName() {
        System.out.println("Bad Member: " + name);
    }

    @Override
    public void sing() {
        System.out.println("la la la");
    }
}
