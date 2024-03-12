package Arrays;

public class PowerSetOfString {
    public static void powerSet(String s,int i,String cur){
        if (i == s.length()){
            System.out.println(cur);
            return;
        }
        powerSet(s,i+1,cur+s.charAt(i));
        powerSet(s,i+1,cur);
    }
    public static void main(String[] args) {
        String s = "abc";
        powerSet(s,0,"");
    }
}
