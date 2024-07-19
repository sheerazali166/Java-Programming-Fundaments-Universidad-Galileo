package Polymorphism.Screencast_Interfaces_Inheritance_Polymorphism;

public class Main {

    public static void main(String[] args) {

        Human humanJohn = new Human("John");
        Human humanLouis = new Human("Louis");
        BandMember bandMemberJack = new BandMember("Jack");

        humanJohn.printName();
        humanLouis.printName();
        bandMemberJack.printName();

        bandMemberJack.sing();
        bandMemberJack.playFavouriteSong();

    }
}
