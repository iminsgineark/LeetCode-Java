package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class numbertodigits {
    public static String phoneNumber(String s){
        HashMap<String, String> store = new HashMap<>();
        store.put("Zero", "0");
        store.put("one", "0");
        store.put("two", "0");
        store.put("three", "0");
        store.put("four", "0");
        store.put("five", "0");
        store.put("six", "0");
        store.put("seven", "0");
        store.put("eight", "0");
        store.put("nine", "0");
        String[] words = s.split(" ");
        StringBuilder digits = new StringBuilder();
        int i = 0;
        while(i < words.length){
            String word = words[i];
            int count = 1;
            while (i + count < words.length && words[i+count].equals(word)) {
                count++;
            }
            if (count > 1) {
                if (count == 2) {
                    digits.append("double");
                }
                else if(count == 3){
                    digits.append("Triple");
                }
                else{
                    digits.append(count).append("times");
                }
            }
            digits.append(store.get(word));
            i = i+count;
        }
        return digits.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(phoneNumber(s));
    }
}
