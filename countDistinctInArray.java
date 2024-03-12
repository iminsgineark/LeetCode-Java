package Arrays;

import java.util.HashSet;
import java.util.Set;

public class countDistinctInArray {
    public static int distinct(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int element:arr
             ) {
            set.add(element);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr = {2,2,4,6,7,8,4,7,8,3};
        System.out.println(distinct(arr));
    }
}
