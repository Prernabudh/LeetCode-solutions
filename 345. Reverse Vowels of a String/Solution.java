class Solution {
    public String reverseVowels(String s) {
        
        if(s.length()==0)
            return "";
        int i,j=0;
        String rev="";
        Set<Integer> set = new HashSet<Integer>();
        String st="";
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                set.add(i);
                st=String.valueOf(ch)+st;
            }
        }
        if(set.size()==0)
            return s;
        for(i=0;i<s.length();i++)
        {
            if(set.contains(i))
            {
                rev=rev+String.valueOf(st.charAt(j));
                j++;
            }
            else
                rev=rev+String.valueOf(s.charAt(i));
        }
        return rev;
    }
}