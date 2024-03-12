
/*
 * @author Utkrist Ark
 * @date 09-10-2023
 * @version java 11.0.19
 */

package Arrays;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int [] result = new int[2];
        result[0] = findStartingIndex(nums,target);
        result[1] = findEndingIndex(nums,target);
        return result;
    }
    public static int findStartingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int midpoint = start + (end - start) / 2;
            if (nums[midpoint] >= target){
                end = midpoint - 1;
            }
            else {
                start = midpoint + 1;
            }
            if (nums[midpoint] == target){
                index = midpoint;
            }

        }
        return index;
    }

    public static int findEndingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int midPoint = start + (end - start) /2;
            if (nums[midPoint] <= target){
                start = midPoint + 1;
            }
            else {
                end = midPoint - 1;
            }
            if (nums[midPoint] == target){
                index = midPoint;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr  = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
}
