class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0)
            return 0;
        int i=0,j;
        for(j=1;j<nums.length;j++)
        {
            if(nums[i] != nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        // Arrays.sort(nums,0,i+1);
        return i+1;
    }
}