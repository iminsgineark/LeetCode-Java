package org.example;

public class decimalToBinary {
    public static int dectoBin(int n) {
        if (n == 0) {
            return 0;
        }
        else{
            return n % 2 + 10*dectoBin(n/2);
        }
    }
    public static void main(String[] args) {
        System.out.println(dectoBin(10));
    }
}
