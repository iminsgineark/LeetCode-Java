package Arrays;

public class tripletsSum {
    public static boolean triplets(int[] arr, int sum, int n){
        for (int i = 0;i<arr.length - 2;i++){
            for (int j = i+1;j<arr.length - 1;j++){
                for (int k = j+1;k<arr.length;k++){
                    if (arr[i] + arr[j] + arr[k] == sum){
                        System.out.println(arr[i] + " "  + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 35;
        int n = arr.length;
        System.out.println(triplets(arr,sum,n));
    }
}
