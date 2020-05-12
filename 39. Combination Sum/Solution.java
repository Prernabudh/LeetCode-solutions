class Solution {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
     private void comb(int arr[], int i, int sum,List<Integer> path)
     {
        if(sum<0)
            return;
        if(sum==0)
        {
            this.result.add(path);
            return;
        }
        while(i<arr.length && sum-arr[i]>=0)
        {
            List<Integer> list=new ArrayList<>(path);
            list.add(arr[i]);
            comb(arr,i,sum-arr[i],list);
            i++;
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        // List<List<Integer>> list = new ArrayList<List<Integer>>
        Arrays.sort(candidates);
        comb(candidates, 0, target,new ArrayList<>());
        return this.result;
    }
}