class Solution {
    static int binarySearch(int arr[][], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (arr[m][0] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m][0] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        if(r==-1)
            return l;
        return r; 
    }
    static int binarySearch(int arr[][], int x, int y) 
    { 
        int l = 0, r = arr[0].length- 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (arr[y][m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[y][m] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        if(r==-1)
            return l;
        return r; 
    } 
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length==0 || matrix[0].length==0)
            return false;
        int pos = binarySearch(matrix,target);
        if(pos==-1)
            return false;
        if(matrix[pos][0]==target)
            return true;
        int ans=binarySearch(matrix,target,pos);
        if(ans==-1)
            return false;
        if(matrix[pos][ans]==target)
            return true;
        return false;
    }
}