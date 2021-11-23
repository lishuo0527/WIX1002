
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */
public class V1Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String equation;
        
        //enter ax2+bx+c
        System.out.print("Enter: quadratic equation: ");
        equation = input.next();
        
        //convert the input string into char array
        char[] chs = equation.toCharArray();
        
        char aChar = chs[0];
        char bChar = chs[4];
        char cChar = chs[7];
        char s = chs[6];
        
        //sign of c
        int sign = 1;
        if (s == '+')
            sign = 1;
        else
            sign = -1;
        
        //convert char to int
        int a = Character.getNumericValue(aChar);
        int b = Character.getNumericValue(bChar);
        int c = Character.getNumericValue(cChar);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        //calculate delta
        int delta = b*b - 4*a*sign*c;
        System.out.println(delta);
        
        // display the results
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
"x = " + (-b+Math.sqrt(delta))/(2*a) +
"\nx = " + (-b-Math.sqrt(delta))/(2*a));
    }

}
