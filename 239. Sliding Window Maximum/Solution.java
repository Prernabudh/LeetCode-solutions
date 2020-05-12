class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int arr[] = new int[nums.length-k+1];
        int i,c=0,j;
        int temp[] = new int[k];
        for(i=0;i<nums.length-k+1;i++)
        {
            for(j=i;j<i+k;j++)
            {
                temp[c]=nums[j];
                c++;
            }
            Arrays.sort(temp);
            c=0;
            arr[i]=temp[k-1];
        }
        return arr;
    }
}