
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */
public class L3Q2 {

    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(6);
        switch ( i ) {
            case 0:
                    System.out.println(i + " is zero.");
                    break;
            case 1:
                    System.out.println(i + " is one.");
                    break;
            case 2:                    
                    System.out.println(i + " is two.");
                    break;
            case 3:
                    System.out.println(i + " is three.");
                    break;
            case 4:
                    System.out.println(i + " is four.");
                    break;
            case 5:                    
                    System.out.println(i + " is five.");
                    break;
        }
    }

}
