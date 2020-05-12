class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map= new HashMap<Integer, Integer>();
        int i, n=nums.length;
        for(i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>n/2)
                return nums[i];
        }
        return 0;
    }
}