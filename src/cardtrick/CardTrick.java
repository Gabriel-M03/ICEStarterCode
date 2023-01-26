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
     */
    private static void printInfo() 
    {
         System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println(); 
    }
}