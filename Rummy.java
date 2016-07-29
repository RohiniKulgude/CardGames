
import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.Collections;


public class Rummy {
    ArrayList<Card> Hand = new ArrayList<>();

    Rummy(ArrayList<Card> PackOfCards){
        Hand = PackOfCards;
    }

    public int HandStatus(){

        Collections.sort(Hand);
        ArrayList<Card> spades = new ArrayList<>();
        ArrayList<Card> clubs = new ArrayList<>();
        ArrayList<Card> diamonds = new ArrayList<>();
        ArrayList<Card> hearts = new ArrayList<>();
        ArrayList<Card> Joker = new ArrayList<>();
        ArrayList<Card> CardRequiredforSequence() = new ArrayList<>();
        int cardsrequired =0;
        for(Card card: Hand) {
            if (card.getSuit() == 0)
                hearts.add(card);
            else if(card.getSuit() == 1)
                diamonds.add(card);
            else if(card.getSuit()== 2)
                spades.add(card);
            else if(card.getSuit()==3)
                clubs.add(card);
            else
                Joker.add(card);
        }

        Collections.sort(hearts);
        Collections.sort(diamonds);
        Collections.sort(spades);
        Collections.sort(clubs);

        for(int i = 0 ; i < hearts.size()-1;i++)
            if(hearts.get(i+1).getPip()- hearts.get(i).getPip() != 1)
                //while(hearts.get(i).getPip()<hearts.get(i+1).getPip()){
                //  CardRequiredforSequence.add(hearts.get());
                //}

                for(int i = 0 ; i < diamonds.size()-1;i++)
                    if(diamonds.get(i+1).getPip()- diamonds.get(i).getPip() != 1)
                        cardsrequired++;
        for(int i = 0 ; i < spades.size()-1;i++)
            if(spades.get(i+1).getPip()- spades.get(i).getPip() != 1)
                cardsrequired++;
        for(int i = 0 ; i < clubs.size()-1;i++)
            if(clubs.get(i+1).getPip()- clubs.get(i).getPip() != 1)
                cardsrequired++;

        return cardsrequired - Joker.size();
    }
}