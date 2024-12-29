package org.example.prefixsum;

public class pivotIndex {
    public static int pivotIndex1(int[] nums) {
        int lsum=0,total=0;

        for(int i:nums)
            total=total+i;

        for(int j=0;j<nums.length;lsum+=nums[j++])
        {
            if(lsum*2==total-nums[j])
                return j;

        }

        return -1;
    }
    public static void main(String[] args) {

    }
}
