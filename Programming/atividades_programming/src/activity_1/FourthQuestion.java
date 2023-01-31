package activity_1;

import java.util.Scanner;

public class FourthQuestion {
    public static void main(String[] args) {
        String equals =  inputMenu();

        while (equals.equals("equals")) {
            equals = inputMenu();
        }

        System.out.println(equals);
    }
    public static String inputMenu() {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber =  keyboardInput.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber =  keyboardInput.nextInt();

        if (firstNumber == secondNumber) {
            return "equals";
        } else if (firstNumber > secondNumber) {
            return firstNumber + " is bigger than " + secondNumber;
        }
        return secondNumber + " is bigger than " + firstNumber;
    }
}
