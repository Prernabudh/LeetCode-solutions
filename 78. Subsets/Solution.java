class Solution {
     public static List<List<Integer>> comb(int arr[], int i,List<List<Integer>> results, List<Integer> path)
    {
        if(i==arr.length)
        {
            results.add(path);
            return results;
        }
        
        List<Integer> list=new ArrayList<>(path);
        list.add(arr[i]);
        comb(arr,i+1,results,path);
        comb(arr,i+1,results,list);
        return results;
    }
    public List<List<Integer>> subsets(int[] arr) {

        List<List<Integer>> results= new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<>();
        return(comb(arr,0,results,path));
        
    }
}