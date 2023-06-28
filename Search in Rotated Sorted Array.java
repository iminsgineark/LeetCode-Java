//Using Binary Search

package Arrays;
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
       int k = 0;
        System.out.println(search(nums,k));

    }
    public static int search(int[] arr, int target){
       int low = 0;
       int high = arr.length - 1;
       while (low <= high){
           int mid = (low + high) / 2;
           if (arr[mid] == target){
               return mid;
           } else if (arr[low] < arr[mid]) {
               if (target >= arr[low] && target <= arr[mid]){
                   high = mid - 1;
               }
               else {
                   low = mid + 1;
               }
           }
           else {
               if (target >= arr[mid] && target <= arr[high]){
                   low = mid + 1;
               }
               else {
                   high = mid - 1;
               }
           }
       }
        return -1;
    }
}



// Easy Approach
//Using Linear Search

class Solution {
    public int search(int[] nums, int target) {
       for(int i = 0;i<nums.length;i++){
           if(nums[i] == target){
               return i;
           }
       }
       return -1;
    }
}
