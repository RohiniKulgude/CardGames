/**
 * Created by ashoka on 7/28/2016.
 */
public class Main {

    public static void main(String[] args) {
        Card card = new Card(3,1);
        Card card1 = new Card(3,2);
        System.out.println(card.toString());
        System.out.println(card1.toString());
        PackWithJoker Pack = new PackWithJoker(2);
        System.out.print(Pack.toString());
    }
}
