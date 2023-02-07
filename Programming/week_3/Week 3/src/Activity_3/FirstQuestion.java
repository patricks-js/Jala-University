package Activity_3;

import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int number = -1;

        String[] numbersInWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        while (number < 0 || number > 10) {
            System.out.print("Enter the number between 0 and 10: ");
            number = keyboardInput.nextInt();

            if(number < 0 || number > 10) {
                System.out.println("Invalid option!");
            }
        }

        System.out.println(numbersInWords[number]);
    }
}
