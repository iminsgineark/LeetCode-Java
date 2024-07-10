package Arrays;

import java.util.Scanner;

public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return str[str.length - 1].length();
    }

    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord(s));
    }
}