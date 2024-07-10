package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rough39 {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int total = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]){
                int newValue = nums[i - 1] + 1;
                    total += newValue + nums[i];
                    nums[i] = newValue;
            }
        }
        return total;
    }
}
