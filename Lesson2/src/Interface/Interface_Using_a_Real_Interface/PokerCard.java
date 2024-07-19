package Interface.Interface_Using_a_Real_Interface;

public class PokerCard implements Comparable<PokerCard> {

    int suit; // 4 - spades, 3 - hearts, 2 - clubs, 1 - diamonds
    int number; // from 2 to 14, being 11 the Jack, 12 the Queen, 13 the King and 14 the Ace

    public PokerCard(int _suit, int _number) {

        this.suit = _suit;
        this.number = _number;

    }

    @Override
    public int compareTo(PokerCard pokerCard) {

        if (this.number < pokerCard.number) {
            return -1;

        } else if (this.number > pokerCard.number) {
            return 1;

        } else {

            if (this.suit < pokerCard.suit) {
                return -1;

            } else if (this.suit > pokerCard.suit) {
                return 1;

            } else {
                return 0;
            }
        }
    }
}
