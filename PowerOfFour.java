package Arrays;

public class PowerOfFour {
        public static boolean isPowerOfFour(int n) {
         if (n <= 0){
             return false;
         }
        else if (n % 4 == 0){
             return true;
         }
         else if (n == 1){
             return true;
         }
         else {
             return false;
         }
        }
    public static void main(String[] args) {
            int n = -2147483648;
        System.out.println((isPowerOfFour(n)));
    }
}
