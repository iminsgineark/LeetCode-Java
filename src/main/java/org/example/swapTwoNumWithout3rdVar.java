package org.example;

public class swapTwoNumWithout3rdVar {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;
        a = a+b;
        b = a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
