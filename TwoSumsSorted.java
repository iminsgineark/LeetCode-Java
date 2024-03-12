package Arrays;

import java.util.Arrays;

public class TwoSumsSorted {
        public static int[] twoSum(int[] numbers, int target) {
            int start = 0;
            int end = numbers.length - 1;
            while(start<end){
                if (numbers[start] + numbers[end] > target) {
                    end--;
                }
                else if (numbers[start] + numbers[end] < target) {
                    start++;
                }
                else{
                    return new int[] {start + 1,end + 1};
                }
            }
            return new int[] {};
        }
    public static void main(String[] args) {
        int [] arr = {2,3,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
