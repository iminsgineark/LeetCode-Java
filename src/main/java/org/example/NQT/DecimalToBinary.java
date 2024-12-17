package org.example.NQT;
import java.util.Scanner;
public class DecimalToBinary {
    static int toggleBits(int n) {
        int toggleBits = Integer.toBinaryString(n).length();
        int mask = (1 << toggleBits) - 1;
        return n^mask;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        int result = toggleBits(n);

        System.out.println("Result after toggling bits: " + result);

    }
}
