package activity_1;

import java.util.Scanner;

public class SeventhQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber =  keyboardInput.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber =  keyboardInput.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Equal numbers");
        } else if (firstNumber > secondNumber) {
            System.out.println("First is bigger");
        }
        System.out.println("Second is bigger");
    }
}
