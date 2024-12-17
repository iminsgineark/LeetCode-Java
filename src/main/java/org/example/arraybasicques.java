package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class arraybasicques {

    static void swap(int[] arr,int s1, int s2){
        int temp = arr[s1];
        arr[s1] = arr[s2];
        arr[s2] = temp;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <  end) {
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
       // swap(arr,0,1);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
