package activity_1;

import java.util.Scanner;

public class ThirdQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the year of birth: ");
        int birthday =  keyboardInput.nextInt();

        System.out.print("Enter the current year: ");
        int currentYear =  keyboardInput.nextInt();

        int age = currentYear - birthday;

        if (age < 16) {
            System.out.println("You cannot vote this year!");
        } else if (age < 18) {
            System.out.println("You have the option to vote this year, but it is not mandatory.");
        } else {
            System.out.println("You are " + age + " years old and must vote this year.");
        }
    }
}
