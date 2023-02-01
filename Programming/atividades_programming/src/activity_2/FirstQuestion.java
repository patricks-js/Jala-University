package activity_2;

import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args) {
        String secondNumberEqualsZero =  inputMenu();

        while (secondNumberEqualsZero.equals("0")) {
            System.out.println("Second number can't be 0 (zero)");
            System.out.println();
            secondNumberEqualsZero = inputMenu();
        }

        System.out.println(secondNumberEqualsZero);
    }
    public static String inputMenu() {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber =  keyboardInput.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber =  keyboardInput.nextInt();

        if (secondNumber == 0) {
            return "0";
        }

        double result = (double) firstNumber/secondNumber;
        return firstNumber + "/" + secondNumber + " equals: " + (result);
    }
}
