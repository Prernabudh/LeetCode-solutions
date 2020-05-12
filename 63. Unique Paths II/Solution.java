class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        int i,j;
        dp[0][0]=grid[0][0]==0?1:0;
        for(i=1;i<n;i++)
        {
            if(grid[i][0]==1 || dp[i-1][0] == 0)
                dp[i][0]=0;
            else
                dp[i][0]=1;
        }
        for(i=1;i<m;i++)
        {
            if(grid[0][i]==1 || dp[0][i-1] == 0)
                dp[0][i]=0;
            else
                dp[0][i]=1;
        }
        for(i=1;i<n;i++)
        {
            for(j=1;j<m;j++)
            {
                if(grid[i][j]==0)
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                else
                    dp[i][j]=0;
            }
        }
        return dp[n-1][m-1];
        
    }
}