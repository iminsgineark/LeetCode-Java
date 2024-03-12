package Arrays;

public class BinarySearch {
//    public static int binarySearch(int[]arr,int k){
//        int low = 0;
//        int high = arr.length - 1;
//        while (low <= high){
//            int mid = low + (high - low) / 2;
//            if (arr[mid] == k){
//                return mid;
//            }
//            else if (k > arr[mid]){
//                low = mid + 1;
//            }
//            else if (k < arr[mid]){
//                high = mid - 1;
//            }
//        }
//        return -1;
//    }

    // using recursion

    public static int binarySearch(int[] arr,int k,int low,int high){
        if (low > high){
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == k){
            return mid;
        }
        else if (k > arr[mid]){
            return binarySearch(arr,k,mid+1,high);
        }
        else {
            return binarySearch(arr,k,low,mid - 1);
        }
    }
    public static void main(String[] args) {
      int[] arr = {2,3,5,6,8,9};
      int k = 6;
        System.out.println(binarySearch(arr,k,0,arr.length - 1));
    }
}
