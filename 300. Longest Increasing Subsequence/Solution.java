class Solution {
    public int lengthOfLIS(int[] nums) {
        
        if(nums.length == 0)
            return 0;
        int n=nums.length;
        int dp[]= new int[n];
        int i,j,max=Integer.MIN_VALUE;
        for(i=0;i<n;i++)
            dp[i]=1;
        for(i=1;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(nums[j]<nums[i] && dp[i]<dp[j]+1)
                    dp[i]=dp[j]+1;
            }
        }
        for(i=0;i<n;i++)
        {
            if(dp[i]>max)
                max=dp[i];
        }
        return max;
    }
}