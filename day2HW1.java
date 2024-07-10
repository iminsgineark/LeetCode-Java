package Arrays;

import java.util.Stack;

public class day2HW1 {
    public boolean isValid(String s){
        Stack<Character> sc = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                sc.push(s.charAt(i));
            }
            else if (sc.isEmpty()){
                return false;
            } else if (sc.peek() == '{' && s.charAt(i)=='}') {
                sc.pop();
            }
            else if (sc.peek() == '(' && s.charAt(i)==')'){
                sc.pop();
            } else if (sc.peek()=='[' && s.charAt(i) == ']') {
                sc.pop();
            }
            else {
                return false;
            }
        }
        return sc.isEmpty();
    }
    public static void main(String[] args) {

    }
}
