package Arrays;
import java.lang.Math;
import java.util.Scanner;

public class POW {
    public static double myPow(double x, int n) {
        return Math.pow(x,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int x = sc.nextInt();
        System.out.println(myPow(a,x));
    }
}
