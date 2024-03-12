package Arrays;

public class maxSumSubArray {
    public static void subArraySum(int[] arr, int sum){
        for (int i = 0; i < arr.length; i++) {
            int currentSum = arr[i];
            if (currentSum == sum){
                System.out.println(i);
                return;
            }
            else{
                for (int j = i + 1; j < arr.length; j++) {
                    currentSum = currentSum + arr[j];
                    if (currentSum == sum){
                        System.out.println("Sum is found between " + i + " & " + j);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int sum = 23;
        subArraySum(arr,sum);
    }
}
