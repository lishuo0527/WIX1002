
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */
public class L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double M, P, D, R, Y;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the price of the car");
        P = input.nextDouble();
        System.out.println("Please input down payment");
        D = input.nextDouble();
        System.out.println("Please input interest Rate in %");
        R = input.nextDouble();
        System.out.println("Please input loan duration in year");
        Y = input.nextDouble();
        
        M = (P - D) * (1 + R * Y / 100) / (Y * 12);
        

        System.out.printf("Monthly Payment is %.2f", M);
        
        
        
    }
    
}
