class Solution {
    public int removeDuplicates(int[] nums) {
        
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        int i,j,k=0;
        for(i=0;i<nums.length;i++)
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        for (Map.Entry mapElement : map.entrySet()) { 
            int key = (int)mapElement.getKey(); 
            int value = (int)mapElement.getValue();
            if(value>=2)
                value=2;
            for(j=0;j<value;j++)
            {
                nums[k]=key;
                k++;
            }
        } 
        return k;
    }
}