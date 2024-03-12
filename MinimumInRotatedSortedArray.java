package Arrays;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(MinimumElement(arr));
    }
    public static int MinimumElement(int [] nums){
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
}
