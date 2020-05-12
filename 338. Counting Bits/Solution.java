class Solution {
    public int[] countBits(int num) {
        
        int i;
        int dp[] = new int[num+1];
        dp[0]=0;
        for(i=1;i<=num;i++)
        {
            if(i%2==0)
                dp[i]=dp[i/2];
            else
                dp[i]=dp[i-1]+1;
        }
        return dp;
    }
}