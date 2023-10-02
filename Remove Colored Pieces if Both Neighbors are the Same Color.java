
class Solution {
    public boolean winnerOfGame(String colors) {
        boolean result = false;
        int ACount = ConsecutiveString(colors,'A');
        int BCount = ConsecutiveString(colors,'B');
        return ACount > BCount;
    }
    private int ConsecutiveString(String s,char ch){
        int c = 0;
        int i = 1;
        while(i < s.length() - 1){
            if(s.charAt(i) == ch && s.charAt( i -1) == s.charAt(i) && s.charAt(i) == s.charAt(i+1)){
                c++;
            }
            i++;
        }
        return c;
    }
}
