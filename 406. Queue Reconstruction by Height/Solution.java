class Solution {
    public static void sortbyColumn(int arr[][], int col) 
    { 
        // Using built-in sort function Arrays.sort 
        Arrays.sort(arr, new Comparator<int[]>() { 
            
          @Override              
          // Compare values according to columns 
          public int compare(final int[] entry1,  
                             final int[] entry2) { 
  
            // To sort in descending order revert  
            // the '>' Operator 
            if (entry1[col] > entry2[col]) 
                return 1; 
            else
                return -1; 
          } 
        });  // End of function call sort(). 
    } 
      
    public int[][] reconstructQueue(int[][] people) {
        
        sortbyColumn(people,1);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int i,j,c,height,pos;
        for(i=0;i<people.length;i++)
        {
            height=people[i][0];
            pos=people[i][1];
            c=0;
            List<Integer> a1=new ArrayList<Integer>();
            for(j=0;j<list.size();j++)
            {
                if(list.get(j).get(0)>=height)
                    c++;
                if(c>pos)
                    break;
            }
            a1.add(height);
            a1.add(pos);
            if(c==pos)
                list.add(a1);
            else
                list.add(j,a1);
        }
        int arr[][] = new int[people.length][2];
        for(i=0;i<list.size();i++)
        {
            arr[i][0]=list.get(i).get(0);
            arr[i][1]= list.get(i).get(1);
        }
        
        return arr;
    }
}