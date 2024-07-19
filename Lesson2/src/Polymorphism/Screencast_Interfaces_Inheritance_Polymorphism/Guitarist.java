package Polymorphism.Screencast_Interfaces_Inheritance_Polymorphism;

public interface Guitarist extends PlaySong {

    public default void playFavouriteSong() {

        System.out.println("Playing my favorite song");
        PlaySong("My first song");

    }

}
