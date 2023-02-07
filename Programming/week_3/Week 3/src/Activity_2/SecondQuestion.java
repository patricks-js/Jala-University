package Activity_2;

import java.util.Arrays;
import java.util.Scanner;

public class SecondQuestion {
    public static void main(String[] args) {
        int col = 5;
        int row = 5;
        int pos = 0;

        int[][] matrix = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if (pos == j) {
                    matrix[i][j] = 1;
                }
            }
            pos++;
        }

        for(int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }
}
