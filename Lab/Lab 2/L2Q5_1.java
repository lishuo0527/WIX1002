
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */
public class L2Q5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int MAX = 10001, num, sum=0;
        Random r = new Random();
        num = r.nextInt(MAX);
        
        System.out.println("The number is " + num);
        
        while (num != 0){
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("The sum of all the digits in the number is " + sum);
    }
    
}
