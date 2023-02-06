package Activity_1;

import java.util.Scanner;

public class SecondQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the value " + (i + 1) + ": ");
            numbers[i] = keyboardInput.nextInt();
        }

        for(int number : numbers) {
            if (number % 2 == 1) {
                System.out.println("Number " + number + " is odd!");
            }
        }
    }
}
