class Solution {
    public List<Integer> partitionLabels(String s) {
        
        int i,j;
        int start = 0,first,last,sum=0;
        int end = s.lastIndexOf(s.charAt(0));
        List<Integer> list = new ArrayList<Integer>();
        Set<Character> set = new HashSet<Character>();
        set.add(s.charAt(0));
        list.add(0);
        for(i=1;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                first = s.indexOf(s.charAt(i));
                last = s.lastIndexOf(s.charAt(i));
                if(end<first)
                {
                     for(j=0;j<list.size();j++)
                           sum=sum+list.get(j);
                    list.add(end+1-sum);
                }
                    // list.add(end+1-list.get(list.size()-1));
                if(last>end)
                    end=last;
                set.add(s.charAt(i));
                sum=0;
            }
        }
        sum=0;
       for(i=0;i<list.size();i++)
           sum=sum+list.get(i);
       list.add(s.length()-sum);
       return list.subList(1,list.size()); 
    }
}