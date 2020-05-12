class Solution {
    static int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1; 
    } 
    public int search(int[] nums, int target) {
        int i,c=1,pos;
        int arr[] = new int[nums.length];
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
                c++;
            else
                break;
        }
        for(i=0;i<nums.length;i++)
        {
            pos = i-c;
            if(pos < 0)
                pos = nums.length + pos;
            arr[pos]=nums[i];
        }
        
        int ans = binarySearch(arr,target);
        if(ans == -1)
            return ans;
        ans = ans+c;
        if(ans<nums.length)
            return ans;
        else
            return ans-nums.length;
    }
}