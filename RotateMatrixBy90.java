package Arrays;

import java.util.Scanner;

public class RotateMatrixBy90 {

    public static void rotateMatrix(int[][] arr){
        transpose(arr);
        reverseRows(arr);
    }
    public static void transpose(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverseRows(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix.length - 1;
            while (start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void printMatrix(int[][] arr){
        for (int[] row: arr
             ) {
            for (int value: row
                 ) {
                System.out.println(value + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i = 0;i<t;i++){
            for (int j = 0;j<t;j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
