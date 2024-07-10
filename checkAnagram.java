package Arrays;

import java.util.Arrays;

public class checkAnagram {
    public static boolean anagramCheck(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }
    public static void main(String[] args) {
        String s1 = "Ark";
        String s2 = "Ark";
        System.out.println(anagramCheck(s1,s2));
    }
}
