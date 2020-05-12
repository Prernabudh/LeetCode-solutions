class Solution {
    public int missingNumber(int[] nums) {
        
        Set<Integer> set = new HashSet<Integer>();
        int i;
        int n=nums.length;
        for(i=0;i<nums.length;i++)
            set.add(nums[i]);
        for(i=0;i<n;i++)
        {
            if(!set.contains(i))
                return i;
        }
        return n;
    }
}