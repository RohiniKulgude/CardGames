

/**
 * Created by phadkep on 7/28/2016.
 */

public class Card {

    int rank;
    int suit;

    private static String[] suits = { "HEARTS", "SPADES", "DIAMONDS", "CLUBS" };
    private static String[] ranks  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };


    public static String rankAsString( int __rank ) {

        return ranks[__rank];

    }



    Card(short suit, short rank)

    {

        this.rank=rank;

        this.suit=suit;

    }



    public String toString()

    {

        return ranks[rank] + " of " + suits[suit];

    }



    public int getRank() {

        return rank;

    }



    public int getSuit() {

        return suit;

    }




}


