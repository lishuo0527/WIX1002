
import java.util.Random;


/**
 *
 * @author Shuo
 */
public class V1Q2 {

    public static void main(String[] args) {
        Random r = new Random();
        
        //initialize integer variables for colours and numbers of the card
        int colourNum1 = r.nextInt(4);
        int colourNum2 = r.nextInt(4);
        int cardNum1 = 1 + r.nextInt(10);
        int cardNum2 = 1 + r.nextInt(10);
        
        //display two players' cards
        System.out.println("Card 1 : " + colour(colourNum1) + " " + cardNum1);
        System.out.println("Card 2 : " + colour(colourNum2) + " " + cardNum2);
        
        //determine who is the winner and display the result
        if (cardNum1==1 && cardNum2 == 10)
            System.out.println("Card 1 is bigger");
        else if (cardNum1==10 && cardNum2 == 1)
            System.out.println("Card 2 is bigger");
        else if (cardNum1 > cardNum2)
            System.out.println("Card 1 is bigger");
        else if (cardNum1 < cardNum2)
            System.out.println("Card 2 is bigger");
        else{
            //if the card is the same value
                if (colourNum1 > colourNum2)
                System.out.println("Card 1 is bigger");
                else if (colourNum1 < colourNum2)
                System.out.println("Card 2 is bigger");
                else
                System.out.println("Two cards are the same");
            }
        }

        
    //a funtion to convert colourNum into colour string 
    public static String colour(int t){
        if (t == 0)
            return "Yellow";
        else if (t == 1)
            return "Green";
        else if (t == 2)
            return "Blue";        
        else if (t == 3)
            return "Red";
        else
            return null;
    }

}
