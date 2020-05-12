class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1)
            return "";
        int l=0,r=0,i,len,gr=-1;
        String st="";
        for(i=0;i<s.length();i++)
        {
            l=i-1;r=i+1;
            while(l>=0 && r<s.length())
            {
                if(s.charAt(l)!=s.charAt(r))
                    break;
                else
                    l--;
                    r++;
            }
            l+=1;
            r-=1;
            len=r-l;
            if(len>=gr)
            {
                gr=len;
                st=s.substring(l,r+1);
            }
        }
        for(i=0;i<s.length()-1;i++)
        {
            l=i-1;r=i+2;
            if(s.charAt(i)==s.charAt(i+1))
            {
                while(l>=0 && r<s.length())
                {
                    if(s.charAt(l)!=s.charAt(r))
                        break;
                    else
                        l--;
                        r++;
                }
                l+=1;
                r-=1;
                len=r-l-1;
                if(len>=gr)
                {
                   gr=len;
                   st=s.substring(l,r+1);
                }
            }
            
        }
        return st;
    }
}