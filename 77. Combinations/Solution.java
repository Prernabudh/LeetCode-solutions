class Solution {
    // static List<List<Integer>> results= new ArrayList<List<Integer>>();
    public static List<List<Integer>> comb(int arr[], int i, int k, List<List<Integer>> results, List<Integer> path)
    {
        if(i==arr.length)
        {
            if(path.size()==k)
                results.add(path);
            return results;
        }
        
        List<Integer> list=new ArrayList<>(path);
        list.add(arr[i]);
        comb(arr,i+1,k,results,path);
        comb(arr,i+1,k,results,list);
        return results;
    }
    public List<List<Integer>> combine(int n, int k) {
        
        int arr[]=new int[n];
        List<List<Integer>> results= new ArrayList<List<Integer>>();
        int i;
        for(i=0;i<n;i++)
            arr[i]=i+1;
        List<Integer> path = new ArrayList<>();
        return(comb(arr,0,k,results,path));
    }
}