
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */
public class L2Q6_1 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Random random1 = new Random();
    int num = random1.nextInt(10000);
    System.out.println(num);

    int sum;
    for(sum = 0; num > 0; sum += num % 10, num /= 10);
    System.out.println(sum);
    }
    
}
