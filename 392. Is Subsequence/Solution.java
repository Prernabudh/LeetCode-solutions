class Solution {
    public boolean isSubsequence(String s, String t) {
        if( s.length()==0 && t.length()!=0)
            return true;
        else if( s.length()!=0 && t.length()==0)
            return false;
        else if( s.length()==0 || t.length()==0)
            return true;
        int max= t.indexOf(s.charAt(0));
        if(max==-1)
            return false;
        for(int i=1;i<s.length();i++)
        {
            char ch = s.charAt(i);
            int pos = t.indexOf(ch,max+1);
            if(pos>max)
                max=pos;
            else
                return false;

        }
        return true;
        
    }
}