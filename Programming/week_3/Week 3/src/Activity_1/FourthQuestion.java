package Activity_1;

import java.util.Scanner;

public class FourthQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int[] numbers = new int[20];
        int numberFound = 0;
        boolean found = false;

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the value " + (i + 1) + ": ");
            numbers[i] = keyboardInput.nextInt();
        }

        System.out.print("What number do you want to find: ");
        int numberToFind = keyboardInput.nextInt();

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == numberToFind) {
                numberFound = i;
                found = true;
                System.out.println("The number " + numberToFind + " is in the position " + (numberFound + 1));
                break;
            }
        }

        if(!found) System.out.println("Number not found!");
    }
}
