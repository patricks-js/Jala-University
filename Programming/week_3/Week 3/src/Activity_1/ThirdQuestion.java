package Activity_1;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int[] numbers = new int[16];

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the value " + (i + 1) + ": ");
            numbers[i] = keyboardInput.nextInt();
        }

        int[] firstEight = new int[8];
        int[] lastEight = new int[8];

        for(int i = 0; i < numbers.length; i++) {
            if(i < 8) {
                firstEight[i] = numbers[i];
            } else {
                lastEight[i - 8] = numbers[i];
            }
        }

        System.out.println(Arrays.toString(lastEight) + Arrays.toString(firstEight));
    }
}
