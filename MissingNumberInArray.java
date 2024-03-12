package Arrays;
import java.util.Arrays;
public class MissingNumberInArray {
    public static int missingNumber(int[] array, int n){
        Arrays.sort(array);
        n = array.length;
        int sum1 = (n * (n + 1)) / 2;
        int sum2 = 0;
        for (int i =0;i<n;i++){
            sum2 = sum2 + array[i];
        }
        return sum1 - sum2;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};
        int n = arr.length;
        System.out.println(missingNumber(arr,n));
    }
}
