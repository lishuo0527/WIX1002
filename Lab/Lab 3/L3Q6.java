
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */
public class L3Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the radius of the circle: ");
        double r = input.nextDouble();
        System.out.println();
        System.out.print("Please enter the horizontal coordinate value: ");
        double x = input.nextDouble();
        System.out.println();
        System.out.print("Please enter the vertical coordinate value: ");
        double y = input.nextDouble();
        System.out.println();
        
        if (x*x + y*y < r*r)
            System.out.println("The point is inside the circle");
        else if (x*x + y*y > r*r)
            System.out.println("The point is outside the circle");
        else
            System.out.println("The point is right on the circle");
    }

}
