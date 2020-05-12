class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int i,sum=0;
        Set<Integer> set = new HashSet<Integer>();
        int arr[] = new int[2];
        for(i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
                sum=sum+nums[i];
            }
            else
            {
                arr[0]=nums[i];
            }
        }
        int n=nums.length;
        arr[1]= (n*(n+1)/2)-sum;
        return arr;
        
    }
}