package activity_1;

import java.util.Scanner;

public class FifthQuestion {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your account number: ");
        int accountNumber = keyboard.nextInt();

        System.out.print("What is your current balance? ");
        float balance = keyboard.nextInt();

        System.out.print("How much debt do you have? ");
        float debt = keyboard.nextInt();

        System.out.print("How much credit do you have? ");
        float credit = keyboard.nextInt();

        float currentBalance = balance - debt + credit;
        System.out.println();

        System.out.println("Account number: " + accountNumber);
        if (currentBalance == 0) {
            System.out.println("Empty account");
        } else if(currentBalance > 0) {
            System.out.println("Positive balance");
        } else {
            System.out.println("Negative balance");
        }
        System.out.println("Your current balance is: " + currentBalance);
    }
}
