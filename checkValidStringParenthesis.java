package Arrays;

public class checkValidStringParenthesis {
    public boolean checkValidString(String s) {
        int leftMin = 0;
        int leftMax = 0;
        for (int i = 0; i < s.length(); i++) {
            char val = s.charAt(i);
            if (val == '('){
                leftMin++;
                leftMax++;
            }
            else if (val == ')'){
                leftMin = leftMin - 1;
                leftMax = leftMax - 1;
            }
            else {
                leftMin = leftMin - 1;
                leftMax = leftMax + 1;
            }
        }
        if (leftMin < 0){
            leftMin = 0;
        }
        if (leftMax < 0){
            return false;
        }
        return leftMin == 0;
    }
    public static void main(String[] args) {

    }
}
