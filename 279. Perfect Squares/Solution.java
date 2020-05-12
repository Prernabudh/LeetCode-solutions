class Solution {
    public int numSquares(int n) {
        
        int i,j;
        if(n<=3)
            return n;
        int dp[] = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(i=4;i<=n;i++)
        {
            dp[i]=i;
            for(j=1;j<=Math.ceil(Math.sqrt(i));j++)
            {
                int temp=j*j;
                if(temp>i)
                    break;
                else
                    dp[i]=Math.min(dp[i],dp[i-temp]+1);
            }
        }
        return dp[n];
    }
}