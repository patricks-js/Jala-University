package Activity_1;

import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int[] numbers = new int[12];
        int numberX = -1, numberY = -1;

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the value " + (i + 1) + ": ");
            numbers[i] = keyboardInput.nextInt();
        }

        while (numberX == -1) {
            System.out.print("Enter the X index: ");
            numberX = keyboardInput.nextInt() - 1;
        }

        while (numberY == -1) {
            System.out.print("Enter the X index: ");
            numberY = keyboardInput.nextInt() - 1;
        }

        System.out.println();
        System.out.println(numbers[numberX] + numbers[numberY]);
    }
}
