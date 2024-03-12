
/**
 * @author Utkrist Ark
 * @date 05-10-2023
 * @version java 11.0.19
 */



package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static List<Integer> majorityElement(int[] nums) {
        int num1 = -1;
        int num2 = -1;
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < nums.length; i++) {
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
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1){
                c1++;
            } else if (nums[i] == num2) {
                c2++;
            }
        }
        if (c1 > nums.length/3){
            ls.add(num1);
        } else if (c2 > nums.length / 3) {
            ls.add(num2);
        }
        return ls;
    }
    public static void main(String[] args) {

    }
}
