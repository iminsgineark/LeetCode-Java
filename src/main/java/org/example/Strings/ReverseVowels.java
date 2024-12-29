package org.example.Strings;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        String vowels = "AEIOUaeiou";
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            while (start<end && vowels.indexOf(chars[start])== -1){
                start++;
            }
            while (start < end && vowels.indexOf(chars[end]) == -1) {
                end--;
            }
            char ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;
            start++;
            end--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str = "IceCreAm";
        System.out.println(reverseVowels(str));
    }
}
