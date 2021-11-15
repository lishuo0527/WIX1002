
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Shuo
 */
public class L3Q3 {

    public static void main(String[] args) {
        double sales, commission;
        Scanner input = new Scanner(System.in);
        
        do {
        System.out.println("Please enter the sales volume.");
        sales = input.nextDouble();
        } while (sales < 0);
        
        if (sales >= 0 && sales <= 100)
            commission = 0.05 * sales;
        else if (sales > 100 && sales <= 500)
            commission = 0.05 * 100 + 0.075 * (sales - 100);
        else if (sales > 500 && sales <= 1000)
            commission = 0.05 * 100 + 0.075 * 400 + 0.1 * (sales - 500);
        else 
            commission = 0.05 * 100 + 0.075 * 400 + 0.1 * 500 + 0.125 * (sales - 1000);
        
        System.out.printf("The commission is %.2f", commission);
    }

}
