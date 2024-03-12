package Arrays;

import java.util.*;

public class StringPermutation {
    static void Permutation(String s,int l, int r){
        if (l >= r){
            System.out.println(s);
            return;
        }
        for (int i = l;i<=r;i++){
            s = swap(s,l,i);
            Permutation(s,l+1,r);
            s = swap(s,l,i);
        }
    }
    public static String swap(String s,int i,int j){
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return new String(charArray);
    }
    public static void main(String[] args) {
        String s = "abc";
        Permutation(s,0,s.length()-1);
    }
}
