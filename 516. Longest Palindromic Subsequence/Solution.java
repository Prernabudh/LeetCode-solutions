class Solution {
    public int longestPalindromeSubseq(String s) {
        
        int n=s.length();
        int row,col;
        int dp[][] = new int[n][n];
        for(col=0;col<n;col++)
        {
            for(row=n-1;row>=0;row--)
            {
                if(row>col)
                    dp[row][col]=0;
                else if(row == col)
                    dp[row][col]=1;
                else if(s.charAt(row)==s.charAt(col))
                    dp[row][col]=Math.max(2+dp[row+1][col-1], Math.max(dp[row][col-1], dp[row+1][col]));
                else
                    dp[row][col]=Math.max(dp[row][col-1], dp[row+1][col]);
            }
        }
        return dp[0][n-1];
    }
}