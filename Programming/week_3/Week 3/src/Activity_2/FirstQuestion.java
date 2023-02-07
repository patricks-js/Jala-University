package Activity_2;

import java.util.Arrays;
import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int col = 4;
        int row = 4;

        int[][] matrix = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = keyboardInput.nextInt();
            }
        }

        System.out.println(matrix.length);
    }
}
