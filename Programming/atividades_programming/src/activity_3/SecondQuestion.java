package activity_3;

import java.util.Scanner;

public class SecondQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter a code user: ");
        int codeUser = keyboardInput.nextInt();

        if(codeUser != 1234) {
            System.out.println("Invalid user!");
        } else {
            System.out.print("Enter a password: ");
            int password = keyboardInput.nextInt();

            if(password != 9999) {
                System.out.println("Invalid password!");
            } else {
                System.out.println("Allowed access!");
            }
        }
    }
}
