class Solution {
    public int maximalSquare(char[][] matrix) {
        
        if(matrix.length ==0)
            return 0;
        int i,j;
        int n=matrix.length;
        int m =matrix[0].length;
        int dp[][] = new int[n+1][m+1];
        int max=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=m;j++)
            {
                if(matrix[i-1][j-1]=='1')
                {
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]))+1;
                    max=Math.max(max,dp[i][j]);
                }
            }
        }
        return max*max;
    }
}