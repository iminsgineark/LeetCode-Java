package Arrays;

public class GCD {
    public static int gcd(int a ,int b){
        if (b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int a = 42;
        int b = 36;
        System.out.println(gcd(a,b));
    }
}
