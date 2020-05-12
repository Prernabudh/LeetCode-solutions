class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int first=-1,last=-1,f=0;
        int arr[] = nums.clone();
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != nums[i])
            {
                if(f==0)
                {
                    first=i;
                    f++;
                }
                else
                    last=i;
            }
        }
        if(first ==-1)
            return 0;
        else if(first != -1 && last!=-1)
            return last-first+1;
        return 0;
    }
}