package Arrays;

import java.util.Arrays;
class Solution3 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum1 = (n * (n + 1)) / 2;
        int sum2 = 0;
        for(int i = 0;i<nums.length;i++){
            sum2 += nums[i];
        }
        return sum1 - sum2;
    }
}
