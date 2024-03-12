package Arrays;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMakeArrayContinuous {
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int j = 1;
        int ans = n - 1;
        int repeat = 0;
        while (j < n){
            if (nums[j] != nums[j-1]){
                while(nums[j] - nums[i] >= n){
                    if (nums[i] == nums[i+1]){
                        repeat--;
                    }
                    i++;
                }
                ans = Math.min(ans,n-(j-i+1-repeat));
            }
            else {
                repeat++;
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
