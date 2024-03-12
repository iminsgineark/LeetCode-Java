
/*
 * @author Utkrist Ark
 * @date 07-10-2023
 * @version java 11.0.19
 */

package Arrays;

import java.lang.Math;

public class BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons {
    static class Solution {

        int[][][] dp = new int[55][55][105];
        int mod = (int) Math.pow(10,7) + 7;

        int solve(int idx ,int lis ,int lar , int n , int m , int k)
        {
            if(idx==n)
            {
                if(lis==k)
                    return dp[idx][lis][lar] = 1;
                return dp[idx][lis][lar] = 0;
            }

            if(dp[idx][lis][lar] != -1){
                return dp[idx][lis][lar];
            }

            int ans = 0;

            for(int i=1;i<=m;i++)
            {
                if(i>lar)
                {
                    ans = (ans%mod + solve(idx+1 , lis+1 , i , n , m , k)%mod)%mod;
                }
                else
                {
                    ans = (ans%mod + solve(idx+1 , lis , lar , n , m , k)%mod)%mod;
                }
            }

            return dp[idx][lis][lar] = ans;
        }


        public int numOfArrays(int n, int m, int k) {

            for(int i=0;i<55;i++)
            {
                for(int j=0;j<55;j++)
                {
                    for(int l=0;l<105;l++)
                    {
                        dp[i][j][l] = -1;
                    }
                }
            }
            return solve(0 ,0 ,0 , n , m , k);

        }
    }
    public static void main(String[] args) {

    }
}
