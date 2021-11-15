import java.util.Random;

public class L2Q3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int MAX = 41;
        double sum = 0, avg;
        double [] num = new double [3];
        
        for(int i = 0; i < 3; i++){
            num[i] = 10 + r.nextInt(MAX);
            System.out.printf("Number%d is %.2f \n",i+1, num[i]);
        }
        
        for(int i = 0; i < 3; i++){
            sum += num[i];
        }
        
        avg = sum / 3;
        
        System.out.printf("Sum is %.2f, average is %.2f .\n",sum, avg);
    }
    
}
