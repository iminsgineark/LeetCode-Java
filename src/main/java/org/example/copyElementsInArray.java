package org.example;

public class copyElementsInArray {
    public static void main(String[] args) {
        int[] arr1 = {1,8,3};
        int[] arr2 = new int[arr1.length];

        arr2 = arr1;


        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
