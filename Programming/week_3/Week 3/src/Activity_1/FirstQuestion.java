package Activity_1;

import java.util.Scanner;

public class FirstQuestion {
    static int[] menu() {
        Scanner keyboardInput = new Scanner(System.in);

        int[] index = new int[2];

        System.out.print("Enter the X index: ");
        index[0] = keyboardInput.nextInt() - 1;

        System.out.print("Enter the X index: ");
        index[1] = keyboardInput.nextInt() - 1;



        return index;
    }
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        float[] numbers = new float[12];

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the value " + (i + 1) + ": ");
            numbers[i] = keyboardInput.nextFloat();
        }

        int[] index = menu();

        System.out.println(numbers[index[0]] + numbers[index[1]]);
    }
}
