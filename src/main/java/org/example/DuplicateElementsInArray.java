package org.example;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementsInArray {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
//        int slow = arr[0];
//        int fast = arr[0];
//        do {
//            slow = arr[slow];
//            fast = arr[arr[fast]];
//        } while (slow != fast);
//
//        fast = arr[0];
//        while (slow != fast) {
//            slow = arr[slow];
//            fast = arr[fast];
//        }
//        return slow;


//      List<Integer> ls = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            int index = Math.abs(arr[i]) - 1;
//
//            if (arr[i] < index) {
//                ls.add(arr[index] + 1);
//            }
//            arr[index] = -arr[index];
//
//        }
//        return ls;

        int maxElement = 1000000;
        int[] freq = new int[maxElement + 1];
        List<Integer> duplicates = new ArrayList<>();
        for (int num : arr) {
            freq[num]++;
        }
        for (int i = 0; i <= maxElement; i++) {
            if (freq[i] > 1) {
                duplicates.add(i);
            }
        }
        return duplicates;


    }
    public static void main(String[] args) {

    }
}
