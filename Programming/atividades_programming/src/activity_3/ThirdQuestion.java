package activity_3;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ThirdQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");

        double unitPrice = 9.90;
        double off;

        System.out.println("How many products do you want to buy? Each product costs $9.90: ");
        int quantityOfProducts = keyboardInput.nextInt();

        double total = (double) quantityOfProducts * unitPrice;

        if(quantityOfProducts <= 5) {
            off =  total * (2 / 100F);
        } else if (quantityOfProducts <= 10) {
            off =  total * (3 / 100F);
        } else {
            off =  total * (5 / 100F);
        }

        double totalPayable = total - Double.parseDouble(formatter.format(off));
        System.out.println("You got $" + formatter.format(off) + " off discount and you will pay $" + formatter.format(totalPayable));
    }
}
