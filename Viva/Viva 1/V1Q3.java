
import java.util.Scanner;
/**
 *
 * @author Shuo
 */
public class V1Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String equation;
        
        //enter ax2±bx±c
        System.out.print("Enter: quadratic equation: ");
        equation = input.next();
        
        //convert the input string into char array
        char[] chs = equation.toCharArray();
        
        //initialization
        char s = 0;
        int a = 0, b = 0, c = 0;
        
        //x2±x±c
        if (chs.length == 6){
            a = 1;
            b = 1;
            char cChar = chs[5];
            s = chs[4];
                    //convert char to int
            c = Character.getNumericValue(cChar);
        
        }
        //x2±bx±c
        else if  (chs.length == 7 && chs[0] == 'x'){
            a = 1;
            char bChar = chs[3];
            char cChar = chs[6];
            s = chs[5];
                    //convert char to int
            b = Character.getNumericValue(bChar);
            c = Character.getNumericValue(cChar);
        
        }
        //ax2±x±c
        else if  (chs.length == 7 && chs[1] == 'x'){
            b = 1;
            char aChar = chs[0];
            char cChar = chs[6];
            s = chs[5];
                    //convert char to int
            a = Character.getNumericValue(aChar);
            c = Character.getNumericValue(cChar);
        
        }
        //ax2±bx±c
        else if  (chs.length == 8){
            char aChar = chs[0];
            char bChar = chs[4];
            char cChar = chs[7];
            s = chs[6];
                    //convert char to int
            a = Character.getNumericValue(aChar);
            b = Character.getNumericValue(bChar);
            c = Character.getNumericValue(cChar);
        
        }        
        
        //sign of c
        int sign = 1;
        if (s == '+')
            sign = 1;
        else
            sign = -1;

        
        //calculate delta
        int delta = b*b - 4*a*sign*c;
        //System.out.println(delta);
        
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
