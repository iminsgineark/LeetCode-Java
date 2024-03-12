package Arrays;

import java.util.HashSet;
import java.util.Set;

public class unionOfArray {
    public static Set<Integer> union(int[] arr1, int [] arr2){
        Set<Integer> set = new HashSet<>();
        for (int x: arr1
             ) {
            set.add(x);
        }
        for (int y: arr2
             ) {
            set.add(y);
        }
        return set;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 8};
        int[] arr2 = {2, 4, 6, 8, 10};
        System.out.println(union(arr1,arr2));
    }
}
