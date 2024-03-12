package Arrays;

import java.util.Arrays;

public class rough2 {
    public static void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rowsArray = new int[m];
        int[] columnsArray = new int[n];

        Arrays.fill(rowsArray,1);
        Arrays.fill(columnsArray,2);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0){
                    rowsArray[i] = 0;
                    columnsArray[j] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowsArray[i] ==0 || columnsArray[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {

    }
}
