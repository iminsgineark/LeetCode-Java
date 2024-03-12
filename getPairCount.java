package Arrays;

import java.util.HashMap;

public class getPairCount {
    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr ={1,5,7,1};
        int k = 6;
        System.out.println(getPairsCount(arr,arr.length,k));
    }
}
