package activity_2;

import java.util.Scanner;

public class FifthQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        for(int i = 0; i < 10; i++ ) {
            System.out.print("Enter a number: ");
            int number = keyboardInput.nextInt();
            if(number < 0) {
                System.out.println(number);
            }
        }
    }
}
