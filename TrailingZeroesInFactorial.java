package Arrays;

public class TrailingZeroesInFactorial {
    public static int trailingZeroes(int n){
        int res = 0;
        for (int i = 5; i <= n; i = i*5) {
            res = res + n/i;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 30;
        System.out.println(trailingZeroes(n));
    }
}
