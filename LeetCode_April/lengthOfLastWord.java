package Arrays.LeetCode_April;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return str[str.length - 1].length();
    }

    public static void main(String[] args) {

    }

    public static class IsomerphicStrings {
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()){
                return false;
            }
            Map<Character,Character> charMappingMap = new HashMap<>();
            for (int i = 0;i<s.length();i++){
                char original = s.charAt(i);
                char replacement = t.charAt(i);
                if (!charMappingMap.containsKey(original)){
                    if (!charMappingMap.containsValue(replacement)){
                        charMappingMap.put(original,replacement);
                    }
                    else {
                        return false;
                    }
                }
                else {
                    char mappedCharacter = charMappingMap.get(original);
                    if (mappedCharacter != replacement){
                        return false;
                    }
                }
            }
            return true;
        }

        // approach2
        public boolean isIsomorphic1(String s, String t) {
            HashMap<Character,Character> mapS2T = new HashMap<>();
            HashMap<Character,Character> mapT2S = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char charS = s.charAt(i);
                char charT = s.charAt(i);

                if (mapS2T.containsKey(charS)){
                    if (mapS2T.get(charS) != charT){
                        return false;
                    }
                    else {
                        if (mapT2S.containsKey(charT)){
                            return false;
                        }
                    }
                    mapS2T.put(charS, charT);
                    mapT2S.put(charT, charS);
                }
            }
            return true;
        }

        public static void main(String[] args) {

        }
    }
}

