import java.util.Arrays;
import java.util.Scanner;

public class Activity2 {
    public static Scanner input = new Scanner(System.in);
    static String symmetricMatrix(int[][] matrix) {
        int [][] transposedMatrix = new int[matrix.length][matrix[0].length];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        boolean isSymmetric = Arrays.deepEquals(transposedMatrix, matrix);

        if(isSymmetric) {
            return "Matrix is symmetric!";
        }
        return "Matrix don't is symmetric!";
    };

    // Calculate determinant
//    static int complementaryMinor(int[][] matrix, int i, int j) {
//        int[][] newMatrix = new int[matrix.length][matrix.length];
//        int[][] matrixToSarrus = new int[3][3];
//
//        for(int row = 0; row < matrix.length; row++) {
//            for(int col = 0; col < matrix[0].length; col++) {
//                if(row == i || col == j) {
//                    newMatrix[row][col] = 0;
//                } else {
//                    newMatrix[row][col] = matrix[row][col];
//                }
//            }
//        }
//
//        for(int row = 0; row < newMatrix.length; row++) {
//            for(int col = 0; col < newMatrix.length; col++) {
//                if(newMatrix[row][col] != 0) {
//                    matrixToSarrus[row][col] = newMatrix[row][col];
//                }
//            }
//        }
//
//        for(int[] row : matrixToSarrus) {
//            System.out.println(Arrays.toString(row));
//        }
//
//        return 0;
//    };
//    static int cofactor(int[][] matrix, int i, int j) {
//        var detIJ = complementaryMinor(matrix, i, j);
//        return (int) Math.pow(-1, (i + j)) * detIJ;
//    };
//    static int detLaPlace(int[][] matrix) {
//        return cofactor(matrix, 2, 2);
//    };
    static int multiDiagonal(int[][] matrix, int n, boolean direction) {
        int diagonal = 1;
        if(direction) {
            for(int line = 0; line < matrix.length; line++) {
                for(int itemPos = 0; itemPos < matrix[line].length; itemPos++) {
                    if(line == itemPos) {
                        diagonal *= matrix[line][itemPos + n];
                    }
                }
            }
        } else {
            for(int line = 0; line < matrix.length; line++) {
                for(int itemPos = 0; itemPos < matrix[line].length; itemPos++) {
                    if(line + itemPos == matrix.length - 1 && (line == 0 || line == 1 || line == 2)) {
                        diagonal *= matrix[line][itemPos + n];
                    }
                }
            }
        }
        return diagonal;
    };
    static int detWithSarrus(int[][] matrix) {
        int[][] subMatrix = new int[matrix.length][matrix.length + (matrix.length - 1)];
        for(int i = 0; i < subMatrix.length; i++) {
            for(int j = 0, k = 0; j < subMatrix.length + subMatrix.length - 1; j++, k++) {
                subMatrix[i][j] = matrix[i][k];
                if(k == 2) {
                    k -= 3;
                }
            }
        }

        int sumDiagonalIndo = 0;
        int sumDiagonalVoltando = 0;

        for(int i = 0; i < subMatrix.length; i++) {
            sumDiagonalIndo += multiDiagonal(subMatrix, i, true);
        }

        for(int i = 0; i < subMatrix.length; i++) {
            sumDiagonalVoltando += multiDiagonal(subMatrix, i, false);
        }

        return sumDiagonalIndo - sumDiagonalVoltando;
    };
    static int det(int[][] matrix) {
        if (matrix.length < 1) {
          return 0;
        } else if(matrix.length == 1) {
            return matrix[0][0];
        } else if(matrix.length == 2) {
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }
//        else if(matrix.length == 3) {
//            return detWithSarrus(matrix);
//        }
        return detWithSarrus(matrix);
//        return detLaPlace(matrix);
    };
    // End function

    static int[][] menu() {
        System.out.print("Enter the size of the array (only a number): ");
        int range = input.nextInt();

        int[][] matrix = new int[range][range];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter a number [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        return matrix;
    };
    static void printMatrix(int[][] matrix) {
        System.out.println();
        System.out.println("Matrix: ");
        for(int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    };
    public static void main(String[] args) {
        var matrix = menu();
        printMatrix(matrix);
        var det = det(matrix);
        System.out.println("The determinant is: " + det + "\n");
        var isSymmetric = symmetricMatrix(matrix);
        System.out.println(isSymmetric);
    };
}
