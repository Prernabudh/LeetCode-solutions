class Solution {
    public int findMin(int[] nums) {
        
        if(nums.length==0)
            return 0;
        int i;
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
                return nums[i+1];
        }
        return nums[0];
    }
}