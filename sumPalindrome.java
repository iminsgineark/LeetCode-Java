package Arrays;

public class sumPalindrome {
    public static long sum(long n){
        long original = n;
        long reversed = 0;
        while (n != 0){
            long remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n = n / 10;
        }
        return (reversed + original);
    }
    public static void main(String[] args) {
        int n = 32;
        System.out.println(sum(n));
    }
}
