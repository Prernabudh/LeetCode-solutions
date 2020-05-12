class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String> > aList =  
                  new ArrayList<List<String> >(); 
        Map<String, List<String>> map = new HashMap<>();
        int i,j,sum=1;
        
        for(i=0;i<strs.length;i++)
        {
            char ca[] = strs[i].toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if(map.containsKey(key))
            {
                List<String> a1 = new ArrayList<String>();
                a1=map.get(key);
                a1.add(strs[i]);
                map.put(key,a1);
            }
            else
            {
                List<String> a2 = new ArrayList<String>();
                a2.add(strs[i]);
                map.put(key, a2);
            }
                
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> values = entry.getValue();
            aList.add(values);
        }
        
        return aList;
    }
}