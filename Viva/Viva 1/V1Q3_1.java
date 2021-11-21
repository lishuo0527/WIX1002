
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */
public class V1Q3_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String equation;
        //ax2+bx+c=0
        System.out.print("Enter: quadratic equation: ");
        equation = input.next();
        char[] chs = equation.toCharArray();
        
        int a = chs[0];
        int b = chs[4];
        int c = chs[7];
        char s = chs[6];
        int sign = 1;
        if (s == '+')
            sign = 1;
        else
            sign = -1;
        
        int delta = b*b - 4*a*sign*c;
        
        if (delta < 0){
            System.out.println("This quadratic equation has 0 root.\n" +
            "No solution"); 
        }
        else if (delta == 0){
            System.out.println("This quadratic equation has 1 root(s).\n" +
"x = " + -b/2*a);
        }
        else
            System.out.println("This quadratic equation has 2 root(s).\n" +
"x = " + (-b+Math.sqrt(delta))/2*a +
"\nx = " + (-b-Math.sqrt(delta))/2*a);
    }

}
