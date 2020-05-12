class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0],nums[1]);
        int n=nums.length;
        int dp[] = new int[n+1];
        int max=0,i;
        dp[0]=0;
        dp[1]=nums[0];
        dp[2]=nums[1];
        max=Math.max(dp[1],dp[2]);
        for(i=3;i<n+1;i++)
        {
            dp[i]=nums[i-1]+Math.max(dp[i-3],dp[i-2]);
            if(dp[i]>max)
                max=dp[i];
        }
        return max;
    }
}