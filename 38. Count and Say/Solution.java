class Solution {
    public String countAndSay(int n) {
        
        String arr[] = {"1","11","21","1211","111221"};
        if(n<=5)
            return arr[n-1];
        String s = "111221", st="";
        int i,j,c=1;
        for(i=6;i<=n;i++)
        {
            for(j=0;j<s.length();j++)
            {
                while((j+1)<s.length() && s.charAt(j) == s.charAt(j+1))
                {
                    c++;
                    j++;
                }
                st = st + c + String.valueOf(s.charAt(j));
                c=1;
            }
            s = st;
            st="";
        }
        
        return s;
    }
}