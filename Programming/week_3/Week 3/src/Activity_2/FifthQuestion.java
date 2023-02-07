package Activity_2;

import java.util.Scanner;

public class FifthQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.print("Enter a number: ");
        int numberToFind = keyboardInput.nextInt();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == numberToFind) {
                    System.out.println("The number found in row: " + (i + 1) + "; and col: " + (j + 1) + ";");
                }
            }
        }
    }
}
