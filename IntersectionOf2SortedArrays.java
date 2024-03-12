package Arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2SortedArrays {
    public static void findIntersection(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int i = 0,j = 0;
        while (i<m && j<n){
            if (arr1[i] < arr2[j]){
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            }
            else {
                System.out.println(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
    public static Set<Integer> intersection(int[] arr1,int[] arr2){
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int x: arr1
             ) {
            set.add(x);
        }
        for (int y:arr2
             ) {
            if (set.contains(y)){
                count++;
                set.remove(y);
            }
        }
        return set;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 8};
        int[] arr2 = {2, 4, 6, 8, 10};

        System.out.println("Intersection of the two arrays:");
        System.out.println(intersection(arr1, arr2));
    }
}
