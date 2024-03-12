package Arrays;

public class PalindromeNumber {
    public static boolean palindromeNumber(int n){
        int original = n;
        int remainder,reversed = 0;
        while (n != 0){
             remainder = n % 10;
             reversed = reversed * 10 + remainder;
             n /= 10;
        }
        return original == reversed;
    }
    public static void main(String[] args) {
        int n = 22;
        System.out.println(palindromeNumber(n));
    }
}
