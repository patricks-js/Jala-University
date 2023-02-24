import java.awt.print.PrinterGraphics;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the registration: ");
        student.setId(Integer.parseInt(input.nextLine()));

        System.out.print("Enter the name: ");
        student.setName(input.nextLine());

        System.out.print("Enter the email: ");
        student.setEmail(input.nextLine());

        System.out.print("Enter the address: ");
        student.setAddress(input.nextLine());

        System.out.print("Enter the course: ");
        student.setCourse(input.nextLine());

        System.out.print("Enter the phone: ");
        student.setPhone(input.nextInt());

        System.out.print("Enter the absences: ");
        student.setAbsences(input.nextInt());

        int[] grades = new int[3];
        for(int i = 0; i < grades.length; i++) {
            System.out.print("Enter the grade " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }
        student.setGrades(grades);

        student.throwAbsences();
        student.throwGrades();
    }
}
