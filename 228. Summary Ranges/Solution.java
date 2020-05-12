class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        if(nums.length==0)
            return list;
        int i;
        int start=0;
        int end=0;
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]+1!=nums[i+1])
            {
                if(i==start)
                    list.add(String.valueOf(nums[start]));
                else
                    list.add(nums[start]+"->"+nums[i]);
                start=i+1;
            }
        }
        if(start == nums.length-1)
            list.add(String.valueOf(nums[start]));
        else
            list.add(nums[start]+"->"+nums[i]);
        return list;
    }
}