package Arrays;

import java.util.Arrays;

public class UniqueArray {
    public static int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]){
                int newValue = nums[i - 1] + 1;
                count += newValue - nums[i];
                nums[i] = newValue;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(arr));
    }
}
