class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        
        int dp[] = new int[n+1];
        dp[0]=1;
        int temp[] = new int[primes.length];
        int i,sm=Integer.MAX_VALUE,pos=0,prod,j;
        for(j=1;j<=n;j++)
        {
            for(i=0;i<primes.length;i++)
            {
                prod=dp[temp[i]]*primes[i];
                if(prod<sm)
                {
                    sm=prod;
                    pos=i;
                }
            }
            dp[j]=sm;
            for(i=0;i<primes.length;i++)
            {
                if(dp[temp[i]]*primes[i]==sm)
                    temp[i]=temp[i]+1;
            }
            sm=Integer.MAX_VALUE;
        }
        return dp[n-1];
    }
}