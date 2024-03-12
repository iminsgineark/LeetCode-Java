package Arrays;

public class Rough25 {
    static boolean isPrime(int N){
        if (N == 1 || N == 2){
            return true;
        }
        for (int i = 2; i < Math.sqrt(N); i++) {
            if (N % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a = 24;
        System.out.println(isPrime(a));

    }
}
