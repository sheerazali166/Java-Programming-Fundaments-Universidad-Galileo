package Interface.Interface_Using_a_Real_Interface;

/**
 * Main class of the Java program. *
**/

public class Main {

    public static void main(String[] args) {

        PokerCard pokerCardEightOfSpades = new PokerCard(4, 8);
        PokerCard pokerCardTenOfHearts = new PokerCard(3, 10);

        System.out.println(pokerCardEightOfSpades.compareTo(pokerCardTenOfHearts));
        System.out.println(pokerCardTenOfHearts.compareTo(pokerCardEightOfSpades));
        System.out.println(pokerCardEightOfSpades.compareTo(pokerCardEightOfSpades));

    }
}
