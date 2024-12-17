package org.example;

import java.util.Arrays;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0,-3,-1,-5,-2};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

        }
    }
}
