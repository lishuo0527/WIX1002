
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */
public class L3Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Plase enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        
        System.out.printf("The equations are: %fx + %fy = %f, %fx + %fy = %f",a, b, c, d, e, f);
        System.out.println();
        
        if (a*d - b*c == 0)
            System.out.println("The equation has no solution.");
        else
        {
            double x = (e*d - b*f) / (a*d - b*c);
            double y = (a*f - e*c) / (a*d - b*c);
            System.out.printf("The solution is x = %f, y = %f", x, y);
            System.out.println();
        }
    }

}
