package Arrays;

public class SumOfN_numberRecursion {
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        else {
            return n + sum(n - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
