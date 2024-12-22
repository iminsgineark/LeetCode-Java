package org.example;

public class sumOfDigits {
    public static int sumofdigits(int num){
        if (num == 0 || num < 0) {
            return 0;
        }
        else {
            return num%10 + sumofdigits(num/10);
        }
    }
    public static void main(String[] args) {
        System.out.println(sumofdigits(35));
    }
}
