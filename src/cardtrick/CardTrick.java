package cardtrick;
import java.util.Scanner;
/**
 * This class +++ Insert class description here +++
 *
 * @author Gabriel Montemayor
 */
public class CardTrick 
{
    public static void main(String[] args) 
    {
        Card[] hand = new Card[7];
        Scanner input = new Scanner(System.in);
        int i = 0, a = 0;
        Card card = new Card();
        for (i = 0; i < hand.length; i++) {
            card.setValue((int) (1 + Math.random() * 14));
            card.setSuit(Card.SUITS[(int) (0 + Math.random() * 3)]);
            hand[i] = card;
            System.out.println(hand[i].getValue() + " " + hand[i].getSuit());
        }
        System.out.println("Enter a suit type");
        String s1 = input.next();

        System.out.println();
        System.out.println("Enter a random number 1 - 14:");
        System.out.println("Either: Clubs, Spades, Diamonds & Hearts");
        int num = input.nextInt();
        for (i = 0; i < hand.length; i++) 
        {
            if(hand[i].getValue() == num || hand[i].getSuit().equalsIgnoreCase(s1)) 
            {
                printInfo();
                break;
            } 
            else 
            {
                System.out.println("Sorry - array has no match to entry");
                break;
            }
        }        
    }
    /**.
    * IM DONE!! - Gabriel Montemayor
     */
    private static void printInfo() 
    {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Gabriel, but you can call me Gabe.");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Get into Sheridan COOP");
        System.out.println("-- Graduate Sheridan");
        System.out.println("-- Get into cyber security either for the government or corporate");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();

        System.out.println("My hobbies:");
        System.out.println("-- Instruments/Music Production");
        System.out.println("-- Sports/Working out");
        System.out.println("-- Anime/Watching TV");
        System.out.println("-- Driving");
        System.out.println(); 
    }
}
