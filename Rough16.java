package Arrays;

public class Rough16 {
    public static void intersection(int[] arr1 , int[] arr2){
        int i = 0;
        int j = 0;
        int m = arr1.length;
        int n = arr2.length;
        while (i<m && j<n){
            if (arr1[i] < arr2[j]){
                i++;
            }
            else if (arr1[i] > arr2[j]){
                j++;
            }
            else {
                System.out.println(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {

    }
}
