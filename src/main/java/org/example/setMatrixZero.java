package org.example;

public class setMatrixZero {
    public static void setZeroes(int[][] matrix) {
        int col = 1;
        int row = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0){
                col = 0;
            }
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0){
                    matrix[i][j] = matrix[j][i] = 0;
                }
            }
        }

        for (int i = row-1; i >= 0 ; i--) {
            for (int j = cols - 1; j >= 1 ; j--) {
                if (matrix[i][0] == 0 || matrix[j][0] == 0){
                    matrix[i][j] = 0;
                }
            }
            if (col == 0){
                matrix[i][0] = 0;
            }
        }

    }

    public static void main(String[] args) {

    }
}
