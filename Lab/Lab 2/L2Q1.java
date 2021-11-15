




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */
import java.util.Scanner;
public class L2Q1 {

    public static void main(String[] args) {

        double cel, fah;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Fahrenheit value:");
        fah = input.nextDouble();
        cel = (fah - 32) / 1.8;
        System.out.printf("%.2f degree Fahrenheit equals to %.2f degree Celsius.", fah, cel);

    }
    
}
