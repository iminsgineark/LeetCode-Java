package Arrays;
import java.math.BigInteger;
import java.util.Arrays;

public class CodeVitaQ1 {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 1};
        System.out.println(findPrime(numbers));
    }

    public static String findPrime(int[] numbers) {
        Arrays.sort(numbers);
        int q = numbers[0];
        BigInteger p = new BigInteger(String.valueOf(numbers[numbers.length - 1])).nextProbablePrime();
        while (p.compareTo(new BigInteger("10000000000")) < 0) {
            boolean isPrime = true;
            for (int i = 1; i < numbers.length; i++) {
                if (!p.mod(new BigInteger(String.valueOf(numbers[i]))).equals(new BigInteger(String.valueOf(q)))) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                return p.toString();
            }
            p = p.nextProbablePrime();
        }
        return "None";
    }
}
