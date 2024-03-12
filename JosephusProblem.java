
/* @author :- Utkrist Ark
 *  @date :- 06/11/2023
 *  @version :- java 11.0.19
 */

package Arrays;

import java.util.Scanner;

public class JosephusProblem {
    public static int josProblem(int n,int k){
        if (n == 1){
            return 0;
        }
        else {
            return (josProblem(n - 1,k) + k) % n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = josProblem(n,k) + 1;
        System.out.println(ans);
    }
}
