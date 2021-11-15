
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */

public class L2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double Q, M, fiC, inC, fiF, inF, m;
        
        System.out.print("Enter amount of water in gram: ");
        m = input.nextDouble();
        M = m / 1000;
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        inF = input.nextDouble();
        inC = (inF - 32) / 1.8;
        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        fiF = input.nextDouble();
        fiC = (fiF - 32) / 1.8;
        
        Q = M * (fiC - inC) * 4184;
        System.out.printf("The energy needed is %e \n", Q);
        
        
        
    }
    
}
