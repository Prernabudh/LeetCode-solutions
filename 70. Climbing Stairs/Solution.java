class Solution {
    public int climbStairs(int n) {
        
        int dp[] = new int[n+1];
        dp[0]=1;
        int i;
        for(i=1;i<=n;i++)
        {
            int sum=0;
            if(i-1>=0)
                sum=sum+dp[i-1];
            if(i-2>=0)
                sum=sum+dp[i-2];
            dp[i]=sum;
        }
        return dp[n];
    }
}