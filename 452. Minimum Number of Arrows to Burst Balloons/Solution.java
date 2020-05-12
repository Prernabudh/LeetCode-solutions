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
    public int findMinArrowShots(int[][] points) {
        
        if(points.length == 0)
            return 0;
        sortbyColumn(points,1);
        int i,start;
        int stop = points[0][1];
        int c=1;
        for(i=1;i<points.length;i++)
        {
            start = points[i][0];
            if(start>stop)
            {
                stop=points[i][1];
                c++;
            }
        }
        
        return c;
    }
}