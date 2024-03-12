/**
 * @author Utkrist Ark
 * @date 01-10-2023
 * @version java 11.0.19
 */

package Arrays;

public class ReverseWord3 {
    public static String reverseWord(String s){
        StringBuilder S = new StringBuilder("Let's take LeetCode contest");
        String[] words = s.split(" ");
        for (String word: words
             ) {
            StringBuilder temp = new StringBuilder(word);
            temp.reverse();
            S.append(temp);
            S.append(" ");
        }
        return S.toString().trim();
    }
    public static void main(String[] args) {
        String s =  "Let's take LeetCode contest";
        System.out.println(reverseWord(s));
    }
}
