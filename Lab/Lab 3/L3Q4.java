
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */
public class L3Q4 {

    public static void main(String[] args) {
        Random r = new Random();

        int p1d1 = 1 + r.nextInt(6);
        int p1d2 = 1 + r.nextInt(6);
        int p2d1 = 1 + r.nextInt(6);
        int p2d2 = 1 + r.nextInt(6);
        int p1 = max(p1d1, p1d2);
        int p2 = max(p2d1, p2d2);
        
        System.out.println("The player 1 tossed " + p1d1 + " and " + p1d2 + ".");
        System.out.println("The player 1 tossed " + p2d1 + " and " + p2d2 + ".");
        
        if (p1 == p2)
                System.out.println("It's a tie.");
        else if (p1 == max(p1, p2))
                System.out.println("The player 1 won.");
        else
                System.out.println("The player 2 won.");
    }
    
    public static int max(int a,int b){
        int max;
        if (a >= b)
            max = a;
        else
            max = b;
        return max;
    }
}
