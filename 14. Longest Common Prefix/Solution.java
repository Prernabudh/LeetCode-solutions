class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l,i,j,f=0;
        if(strs.length==0)
            return "";
        l=strs[0].length();
        char ch;
        String s="";
        for(i=0;i<l;i++)
        {
            ch=strs[0].charAt(i);
            for(j=1;j<strs.length;j++)
            {
                if(i<strs[j].length())
                {
                   if(strs[j].charAt(i)!=ch)
                    {
                        f++;
                        break;
                    } 
                }
                else
                    f++;
                
            }
            if(f==0)
                s=s+String.valueOf(ch);
            else
                break;
        }
        return s;
    }
}