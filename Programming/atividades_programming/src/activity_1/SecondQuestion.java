package activity_1;

import java.util.Scanner;

public class SecondQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("How many apples do you want to buy? From a dozen you get 76% off!");
        int appleQuantity =  keyboardInput.nextInt();
        double cartTotal = 0;

        if(appleQuantity == 0) {
            System.out.println("You have not added any apples to your cart!");
        } else if (appleQuantity < 0) {
            System.out.println("Invalid number!");
        } else if (appleQuantity < 12) {
            cartTotal =  appleQuantity * 1.30;
        } else {
            cartTotal = appleQuantity;             
        }
        System.out.println("Total: R$" + cartTotal);
    }
}
