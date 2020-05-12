class Solution {
    public int firstUniqChar(String s) {
        
        if(s.length()==0)
            return -1;
        HashMap<Character, Integer> freq = new LinkedHashMap<>();
        int i,c=-1;
        for(i=0;i<s.length();i++)
        {
            if(!freq.containsKey(s.charAt(i)))
            {
                freq.put(s.charAt(i),1);
            }
            else
            {
                c=freq.get(s.charAt(i));
                c++;
                freq.put(s.charAt(i),c);
            }
        }
        c=-1;
        for (Map.Entry<Character, Integer> en : freq.entrySet()) { 
            char ch = (char)en.getKey();  
            int n = (int)en.getValue(); 
            if(n==1)
            {
                c = s.indexOf(ch);
                break;
            }
        } 
        
       return c; 
    }
}