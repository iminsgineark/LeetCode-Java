package Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int lowPointer = 0;
        int midPointer = nums.length - 1;
        int highPointer = 0;
        int temp;
        while (midPointer <= highPointer){
            switch (nums[midPointer]){
                case 0:
                    temp = nums[lowPointer];
                    nums[lowPointer] = nums[midPointer];
                    nums[midPointer] = temp;
                    lowPointer++;
                    midPointer++;;
                    break;
                case 1:
                    midPointer++;
                    break;
                case 2:
                    temp = nums[midPointer];
                    nums[midPointer] = nums[highPointer];
                    nums[highPointer] = temp;
                    highPointer--;
                    break;
            }
        }
    }
    public static void main(String[] args) {

    }
}
