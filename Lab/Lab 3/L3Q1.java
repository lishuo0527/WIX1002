
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */
public class L3Q1 {

    public static void main(String[] args) {
        int num1, num2, result;
        String operand;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter two integer number: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        System.out.print("Enter the operand: ");
        operand=input.next();
        
        char i = operand.charAt(0);
        
        switch ( i ){
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println(num1 + " % " + num2 + " = " + result);
                break;
            default: 
                System.out.println("Please enter the correct operand.");
        }
    }

}
