package activity_1;

import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number =  keyboardInput.nextInt();

        if(number > 0) {
            System.out.println("Number is positive!");
        } else if(number < 0) {
            System.out.println("Number is negative!");
        } else {
            System.out.println("Number is 0 (zero)!");
        }
    }
}
