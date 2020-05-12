class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        int i,start=0,sum=0,min=Integer.MAX_VALUE;
        for(i=0;i<=nums.length;i++)
        {
            while(sum>=s && start<i)
            {
                min=Math.min(min,i-start);
                sum=sum-nums[start];
                start++;
            }
            if(i<nums.length)
                sum=sum+nums[i];
        }
        if(min==Integer.MAX_VALUE)
            return 0;
        else
            return min;
    }
}