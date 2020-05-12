class Solution {
    public void nextPermutation(int[] nums) {
        
        int i,f=0,j,k=0;
        for(i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[i-1])
            {
                f++;
                break;
            }
        }
        if(f==0)
        {
            Arrays.sort(nums);
            return;
        }
        int a=i-1;
        int b=i;
        for(j=i+1;j<nums.length;j++)
        {
            if(nums[j]>nums[a] && nums[j]<=nums[b])
                b=j;
        }
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        
        int arr[] = new int[nums.length-i];
        for(j=nums.length-1;j>=i;j--)
        {
            arr[k]=nums[j];
            k++;
        }
        k=0;
        for(j=i;j<nums.length;j++)
        {
            nums[j]=arr[k];
            k++;
        }
    }
}