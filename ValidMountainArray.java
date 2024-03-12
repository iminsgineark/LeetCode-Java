package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int  mid = start + (end - start) / 2;
        int climb = 0;
        if(arr.length < 3){
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            sc.nextInt();
        }
        if (arr.length >= 3){

        }
    }
}
