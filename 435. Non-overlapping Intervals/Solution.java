class Solution {
    
    public static void sortbyColumn(int arr[][], int col) 
    { 
        Arrays.sort(arr, new Comparator<int[]>() { 
            
          @Override              
           
          public int compare(final int[] entry1,  
                             final int[] entry2) { 
  
            
            if (entry1[col] > entry2[col]) 
                return 1; 
            else
                return -1; 
          } 
        }); 
    } 
    public int eraseOverlapIntervals(int[][] intervals) {
        
        if(intervals.length == 0)
            return 0;
        
        sortbyColumn(intervals, 1);
        int start=intervals[0][0];
        int stop=intervals[0][1];
        int c=1,i;
        for(i=1;i<intervals.length;i++)
        {
            start = intervals[i][0];
            if(start >= stop)
            {
                stop=intervals[i][1];
                c++;
            }
        }
        return intervals.length-c;
    }
}