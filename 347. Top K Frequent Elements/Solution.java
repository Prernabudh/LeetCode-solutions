class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        int i,gr=0,val=0,c;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums)
            map.put(num, map.getOrDefault(num,0)+1);
        List<Integer> list = new ArrayList<Integer>(map.keySet());
        Collections.sort(list, (n1,n2)-> map.get(n2)-map.get(n1));
        
        
        return list.subList(0,k);
    }
}