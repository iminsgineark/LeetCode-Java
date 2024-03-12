
/**
 * @author Utkrist Ark
 * @date 20-05-2023
 * @version java 11.0.19
 */



package Arrays;

import java.util.Arrays;
class Solution5 {
    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length / 2];
        int count = 0;
        int candidate = 0;
        for (int num :
                nums) {
            if (count == 0){
                candidate = num;
            } else if (num == candidate) {
                count = count + 1;
            }
            else {
                count = count - 1;
            }
        }
        return candidate;
    }
}
