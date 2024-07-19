package Polymorphism.Screencast_Interfaces_Inheritance_Polymorphism;

public interface PlaySong {

    public default void PlaySong(String stringSongName) {
        System.out.println("Playing " + stringSongName);
    }
}
