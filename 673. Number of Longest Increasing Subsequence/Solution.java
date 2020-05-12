class Solution {
    public int findNumberOfLIS(int[] nums) {
        
        if(nums.length == 0)
            return 0;
        int n=nums.length;
        int dp[] = new int[n];
        int count[] = new int[n];
        // Arrays.fill(dp,1);
        Arrays.fill(count,1);
        int i,j,max=0;
        for(i=1;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    if(dp[j]>=dp[i])
                    {
                        dp[i]=dp[j]+1;
                        if(dp[i]>max)
                            max=dp[i];
                        count[i]=count[j];
                    }
                    else if(dp[i]==dp[j]+1)
                        count[i]=count[i]+count[j];
                }
            }
        }
        int c=0;
        for(i=0;i<n;i++)
        {
            if(dp[i]==max)
                c=c+count[i];
        }
        return c;
    }
}