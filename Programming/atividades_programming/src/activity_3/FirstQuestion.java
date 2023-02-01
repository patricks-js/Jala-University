package activity_3;

import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        float firstSideValue = keyboardInput.nextFloat();

        System.out.print("Enter the second value: ");
        float secondSideValue = keyboardInput.nextFloat();

        System.out.print("Enter the third value: ");
        float thirdSideValue = keyboardInput.nextFloat();

        float sumSide1 = firstSideValue + secondSideValue;
        System.out.println(sumSide1);
        float sumSide2 = secondSideValue + thirdSideValue;
        System.out.println(sumSide2);
        float sumSide3 = thirdSideValue + firstSideValue;
        System.out.println(sumSide3);

        if(sumSide1 < thirdSideValue || sumSide2 < firstSideValue || sumSide3 < secondSideValue) {
            System.out.println("It's not a triangle.");
        } else {
            System.out.println("It's a triangle.");
        }
    }
}
