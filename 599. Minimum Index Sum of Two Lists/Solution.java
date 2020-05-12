class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        int i=0;
        int pos, max=Integer.MAX_VALUE;
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> list = new ArrayList<String>();
        for(i=0;i<list1.length;i++)
            map.put(list1[i],i);
        for(i=0;i<list2.length;i++)
        {
            if(map.containsKey(list2[i]))
            {
                pos = map.get(list2[i])+i;
                if(pos<max)
                {
                    list.clear();
                    max=pos;
                    list.add(list2[i]);
                }
                else if(pos == max)
                    list.add(list2[i]);
            }
        }
        String arr[] = new String[list.size()];
        for(i=0;i<list.size();i++)
            arr[i]=list.get(i);
        
        return arr;
        
    }
}