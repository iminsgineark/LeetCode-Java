package org.example;

import java.util.Scanner;

public class avgTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Days");
        int days = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < days; i++) {
            int next = sc.nextInt();
            sum = sum + next;
        }
        double temp = (double) sum /days;
        System.out.println(temp);
    }
}
