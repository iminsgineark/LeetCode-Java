package Arrays;

import java.util.Arrays;

public class Rough3 {
    class Solution {
        public boolean search(int[] nums, int target) {
            Arrays.sort(nums);
            int start = 0;
            int end = nums.length - 1;
            while (start < end){
                int mid = start + (start - end) / 2;
                if (nums[mid] == target){
                    return true;
                }
                else if (nums[start] <= nums[mid]){

                }
            }
            return true;
        }
    }
    public static void main(String[] args) {

    }
}
