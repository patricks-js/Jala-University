package Activity_2;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int col = 6;
        int row = 6;
        int greaterThanTen = 0;

        int[][] matrix = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print("Enter the row " + (i + 1) + " col " + (j + 1) + ": ");
                matrix[i][j] = keyboardInput.nextInt();
            }
        }

        for(int[] line : matrix) {
            for(int item : line) {
                if(item > 10) {
                    greaterThanTen++;
                }
            }
        }

        System.out.println("There are " + greaterThanTen + " numbers greater than ten");
    }
}
