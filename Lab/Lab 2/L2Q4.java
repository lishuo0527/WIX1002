
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * using  floor division 
 * @author Shuo
 */
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, h, m, s;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of seconds:");
        num = input.nextInt();
        
        h = num / 3600;
        m = (num - 3600 * h) / 60;
        s = num - 3600 * h - 60 * m;
        
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds", num, h, m, s);
        
    }
    
}
