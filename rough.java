package Arrays;

import java.util.ArrayList;
import java.util.List;

public class rough {
    public static List<Integer> majorityElement(int[] nums){
        int num1 = -1;
        int num2 = -1;
        int c1 = 0;
        int c2 = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == num1){
                c1++;
            } else if (nums[i] == num2) {
                c2++;
            } else if (c1 == 0) {
                num1 = nums[i];
                c1 = 1;
            } else if (c2 == 0) {
                num2 = nums[i];
                c2 = 1;
            }
            else {
                c1--;
                c2--;
            }
        }
        List<Integer> ls = new ArrayList<>();
        c1 = 0;
        c2 = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == num1){
                c1++;
            } else if (nums[i] == num2) {
                c2++;
            }
        }
        if (c1 > len/3){
            ls.add(num1);
        } else if (c2 > len / 3) {
            ls.add(num2);
        }
        return ls;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        //System.out.println(majorityElement(nums));
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }
    }
}
