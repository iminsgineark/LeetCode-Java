package Arrays;

import java.util.Arrays;

public class subArray {
    public static int[] subArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    System.out.println();
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 2, 3, 99, 12, 0 };
        System.out.println(Arrays.toString(subArray(arr)));
    }
}
