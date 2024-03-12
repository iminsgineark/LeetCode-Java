
/*
 * @author Utkrist Ark
 * @date 06-10-2023
 * @version java 11.0.19
 */

package Arrays;

public class IntegerBreak {
    public static int integerBreak(int n) {
        if (n == 2){
            return 1;
        } else if (n == 3) {
            return 2;
        }
        int product = 1;
        while (n > 4){
            product = product * 3;
            n = n - 3;
        }
        product = product * n;
        return product;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(integerBreak(n));
    }
}
