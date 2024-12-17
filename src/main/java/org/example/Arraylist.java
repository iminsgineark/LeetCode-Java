package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>(10);
        Scanner dc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            ls.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ls.get(i).add(dc.nextInt());
            }
        }

        System.out.println(ls);
    }
}
