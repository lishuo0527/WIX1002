
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */
public class L2Q4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
  int seconds = in.nextInt(); 
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;
        System.out.print( p2 + ":" + p3 + ":" + p1);
  System.out.print("\n");
    }
    
}
