class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int i,c,j;
        for(i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),1);
            else
            {
                c=map.get(s.charAt(i));
                c++;
                map.put(s.charAt(i),c);
            }
        }
        List<Map.Entry<Character, Integer> > list = 
               new LinkedList<Map.Entry<Character, Integer> >(map.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() { 
            public int compare(Map.Entry<Character, Integer> o1,  
                               Map.Entry<Character, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        });
          
        // put data from sorted list to hashmap  
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();  
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        String st="";
        for (Map.Entry<Character, Integer> en : temp.entrySet()) { 
            char ch = (char)en.getKey();  
            int n = (int)en.getValue();
            
            for(j=0;j<n;j++)
                st=String.valueOf(ch)+st;
        } 
        return st;
    }
}