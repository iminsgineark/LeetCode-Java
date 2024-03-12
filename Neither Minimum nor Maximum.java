package Arrays;
import java.util.Arrays;
class solution {
    public int findNonMinOrMax(int[] nums) {
         if (nums.length < 3) {
            return -1; 
        }

        Arrays.sort(nums);

        return nums[1];
    }
}
