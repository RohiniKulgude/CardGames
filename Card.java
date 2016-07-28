package cardsGame;

/**
 * Created by malir on 7/28/2016.
 */
public class Card {
    int pip;
    int suit;

    private static String[] suits = { "HEARTS", "SPADES", "DIAMONDS", "CLUBS" };
    private static String[] pips  = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};



    Card(int suit, int pip) {
        this.pip=pip-1;
        this.suit=suit;
    }


    public String toString() {
        return pips[pip] + " of " + suits[suit];
    }



    public int getPip() {

        return pip+1;
    }


    public int getSuit() {

        return suit;
    }

    public int comparePip(Card a){
        if(this.pip==a.pip){
            return 0;
        } else if(this.pip>a.pip){
            return 1;
        } else {
            return -1;
        }
    }

    public int compareSuit(Card a){
        if(this.suit==a.suit){
            return 1;
        } else {
            return 0;
        }
    }

    public int compareCard(Card a){
        if((this.pip==a.pip) && (this.suit==a.suit)){
            return 1;
        } else {
            return 0;
        }
    }
}
