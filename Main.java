
package rummy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by phadkep on 7/28/2016.
 */

public class Main {

    public static void main(String[] args) {
        Card card = new Card(3,1);
        Card card1 = new Card(3,2);
        System.out.println(card.toString());
        System.out.println(card1.toString());
        PackWithJoker Pack = new PackWithJoker(2);
        System.out.print(Pack.toString());

        ArrayList<Card> Pack1 = new ArrayList<>(13);
        //Pack1 = Pack.getPackOfCards();
        Collections.shuffle(Pack.getPackOfCards());

        for(int i =0;i<13;i++){

                 Pack1.add(Pack.PackOfCards.get(i));
        }

        System.out.println("\n Only First 13 Shuffled Cards : \n \n");
        System.out.println(Pack1);

    }
}
