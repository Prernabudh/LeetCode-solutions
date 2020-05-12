class Solution {
    public int minSteps(int n) {
        int i,j;
        if(n==1)
            return 0;
        int dp[] = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        int temp;
        for(i=2;i<=n;i++)
        {
            dp[i]=i;
            for(j=2;j<=n/2;j++)
            {
                if(i%j==0)
                {
                   temp=dp[j]+dp[i/j];
                   dp[i]=Math.min(dp[i],temp);
                }
            }
        }
        return dp[n];
    }
}