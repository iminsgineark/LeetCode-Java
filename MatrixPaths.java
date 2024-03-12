
/* @author :- Utkrist Ark
*  @date :- 06/11/2023
*  @version :- java 11.0.19
*/

package Arrays;

import java.util.Scanner;

public class MatrixPaths {
    public static int totalPaths(int m, int n) {
        if(n == 1 || m == 1){
            return 1;
        }
        else{
            return totalPaths(n-1,m) + totalPaths(n,m-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(totalPaths(m,n));
    }
}
