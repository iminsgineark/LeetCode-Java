package Arrays;

import java.util.*;

class twoSum {
    public static int[] twosum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 6;
        // int[] result = twoSum(nums, target);
        // System.out.println(Arrays.toString(result));

        System.out.println(Arrays.toString(twosum(nums, target)));
    }

}
