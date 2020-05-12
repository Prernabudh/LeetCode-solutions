class Solution {
   public static void sortbyColumn(int arr[][], int col) 
    { 
        Arrays.sort(arr, new Comparator<int[]>() { 
            
          @Override              
          public int compare(final int[] entry1,  
                             final int[] entry2) { 
  
            if (entry1[col] > entry2[col]) 
                return 1;
            else if(entry1[col]==entry2[col])
                return 0;
            else
                return -1; 
          } 
        });
    } 
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length ==0)
            return intervals;
        sortbyColumn(intervals,0);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int start = intervals[0][0];
        int stop =intervals[0][1];
        int i,begin=0,end=0;
        List<Integer> a1 = new ArrayList<Integer>();
        for(i=1;i<intervals.length;i++)
        {
            a1 = new ArrayList<Integer>();
            begin=intervals[i][0];
            end = intervals[i][1];
            if(begin<=stop)
                stop=Math.max(stop,end);
            else if(begin>start || i==intervals.length-1)
            {
                a1.add(start);
                a1.add(stop);
                list.add(a1);
                start=begin;
                stop=end;
            }
        }
        if(list.size() == 0 || (list.get(list.size()-1).get(0) != start && list.get(list.size()-1).get(1) != stop))
        {
            a1=new ArrayList<Integer>();
            a1.add(start);
            a1.add(stop);
            list.add(a1);
        }
        int arr[][] = new int[list.size()][2];
        for(i=0;i<list.size();i++)
        {
            arr[i][0]=list.get(i).get(0);
            arr[i][1]=list.get(i).get(1);
        }
        return arr;
    }
}