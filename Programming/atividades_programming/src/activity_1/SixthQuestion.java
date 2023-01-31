package activity_1;

import java.util.Scanner;

public class SixthQuestion {
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

        System.out.print("Enter the third number: ");
        int thirdNumber =  keyboardInput.nextInt();

        boolean equals = firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber;

        if (equals) {
            return "equals";
        } else if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            if (secondNumber > thirdNumber) {
                return "The sum of the two largest numbers is: " + (firstNumber + secondNumber);
            } else {
                return "The sum of the two largest numbers is: " + (firstNumber + thirdNumber);
            }
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) if (firstNumber > thirdNumber) {
            return "The sum of the two largest numbers is: " + (firstNumber + secondNumber);
        } else {
            return "The sum of the two largest numbers is: " + (secondNumber + thirdNumber);
        }
        else {
            if (firstNumber > secondNumber) {
                return "The sum of the two largest numbers is: " + (firstNumber + thirdNumber);
            } else {
                return "The sum of the two largest numbers is: " + (secondNumber + thirdNumber);
            }
        }
    }
}
