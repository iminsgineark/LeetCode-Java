package Arrays;
import java.util.Scanner;
public class Question1ETP {

    public static int maxSubsequenceLength(String a, String b) {
        int k = 0;
        int j = 0;
        for (int i = 0; i < a.length(); i++) {
            while (j < b.length() && a.charAt(i) != b.charAt(j)) {
                j++;
            }
            if (j < b.length()) {
                k++;
                j++;
            } else {
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // consume newline
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine(); // consume newline
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            System.out.println(maxSubsequenceLength(a, b));
        }
    }
}