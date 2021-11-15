import java.util.Random;

public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int MAX = 41;
        double sum, avg, num1, num2, num3;
        num1 = 10 + r.nextInt(MAX);
        num2 = 10 + r.nextInt(MAX);
        num3 = 10 + r.nextInt(MAX);
        sum = num1 + num2 + num3;
        avg = sum / 3;
        System.out.printf("The number1 is %.2f, the number2 is %.2f and the number3 is %.2f .\n",num1, num2, num3);
        System.out.printf("The sum is %.2f, average is %.2f .\n",sum, avg);
    }
    
}
