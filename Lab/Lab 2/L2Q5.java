
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int MAX = 10001, num, sum=0;
        Random r = new Random();
        int [] digit = new int [5];
        
        num = r.nextInt(MAX);
        System.out.println("The number is " + num);
        
        digit[4] = num / 10000;
        digit[3] = num % 10000 / 1000;
        digit[2] = num % 1000 / 100;
        digit[1] = num % 100 / 10;
        digit[0] = num % 10;
        
        for (int i = 0; i < 5; i++){
            sum += digit[i];
        }
        
        System.out.println("The sum of all the digits in the number is " + sum);
        
    }
    
}
