class Solution {
    public int uniquePaths(int m, int n) {
        
        int dp[][]=new int[n][m];
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==0 || j==0)
                    dp[i][j]=1;
                else
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[n-1][m-1];
    }
}