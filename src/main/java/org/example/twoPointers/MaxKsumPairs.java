package org.example.twoPointers;

import java.util.Arrays;

public class MaxKsumPairs {
    public static int maxOperations(int[] nums, int k) {
        int i = 0;
        int j = nums.length-1;
        int carry  = 0;
        while (i<j){
            if (nums[i] + nums[j] == k) {
                carry++;
                i++;
                j--;
            } else if (nums[i]+nums[j] < k) {
                i++;
            } else if (nums[i] + nums[j] > k) {
                j--;
            }
        }
        return carry;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 5;
        System.out.println(maxOperations(arr,k));
    }
}
