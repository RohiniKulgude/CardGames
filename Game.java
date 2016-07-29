/**
 * Created by ashoka on 7/28/2016.
 */
public class Game {

    public static void main(String[] args) {
        Deck D = new Deck(1);
        D.Shuffle();
        Rummy UserHand = new Rummy(D.takeCards(7));
        System.out.println(UserHand.Hand);
        System.out.println(UserHand.HandStatus());

    }
}
