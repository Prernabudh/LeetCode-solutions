class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int i,l,j,sum;
        l=nums.length;
        int arr[] = new int[2];
        for(i=0;i<l-1;i++)
        {
            for(j=i+1;j<l;j++)
            {
                sum = nums[i]+nums[j];
                if(sum==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
        
    }
}