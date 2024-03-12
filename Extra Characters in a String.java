package Arrays;

import java.util.HashSet;
import java.util.Set;

class Solution4 {
    public int minExtraChar(String s, String[] dictionary) {
         int n = s.length();
        int[] dp = new int[n + 1];
        Set<String> wordSet = new HashSet<>();

        for (String word : dictionary) {
            wordSet.add(word);
        }

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;

            for (int j = 0; j < i; j++) {
                String substr = s.substring(j, i);
                if (wordSet.contains(substr)) {
                    dp[i] = Math.min(dp[i], dp[j]);
                }
            }
        }

        return dp[n];
    }
}
