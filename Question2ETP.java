package Arrays;
import java.util.Scanner;

public class Question2ETP {

    public static void constructTree(int n, int d) {
        if (d < n - 1 || d > (n * (n - 1)) / 2) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        int remainingDepth = d - (n - 1);
        int depth = 1;
        int currentVertex = 2;
        while (currentVertex <= n) {
            for (int i = 1; i <= Math.min(remainingDepth, currentVertex - 1); i++) {
                System.out.println(i + " " + currentVertex);
                currentVertex++;
            }
            depth++;
            remainingDepth -= currentVertex - 1;
            break;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int d = scanner.nextInt();
            constructTree(n, d);
        }
    }
}