class Solution {
    static int binarySearch(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1,m=0; 
        while (l <= r) { 
            m = l + (r - l) / 2; 
  
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
        if(x<arr[m])
            return m;
        return m+1; 
    } 
    public int searchInsert(int[] nums, int target) {
        int ans = binarySearch(nums, target);
        return ans;
    }
}