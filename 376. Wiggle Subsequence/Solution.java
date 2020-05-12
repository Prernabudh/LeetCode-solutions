class Solution {
    public int wiggleMaxLength(int[] nums) {
        
        if(nums.length<2)
            return nums.length;
        int i;
        int previous = nums[1]-nums[0];
        int c = previous != 0?2:1;
        for(i=1;i<nums.length-1;i++)
        {
            int diff=nums[i+1]-nums[i];
            if((diff>0 && previous<=0) || (diff<0 && previous>=0))
            {
                c++;
                previous=diff;
            }
        }
        return c;
    }
}