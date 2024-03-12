package Arrays;

import java.util.ArrayList;
import java.util.Collection;

public class StringReversal {
    static String reverseString(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1;i>=0;i--) stringBuilder.append(s.charAt(i));
        return stringBuilder.toString();


    }
    public static void main(String[] args) {

    }
}
