class Solution {
    public static int firstMissingPositive(int[] nums) {
        
        Arrays.sort(nums);
        int i,c=0;
        if(nums.length==0)
            return 1;
        if(nums.length==1 && nums[0]!=1)
            return 1;
        if(nums.length==1 && nums[0]==1)
            return 2;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                c++;
                if(c==1 && nums[i]!=1)
                    return 1;
                if(i!=nums.length-1)
                {
                    if(nums[i]+1 != nums[i+1] && nums[i]!=nums[i+1])
                    return nums[i]+1;
                }
            }
        }
        if(c==0)
            return 1;
        return nums[nums.length-1]+1;
    }
}