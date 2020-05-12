class Solution {
    public String removeKdigits(String num, int k) {
        
        int len =num.length();
        if(len == k)
            return "0";
        
        int v=len-k-1,min=-1,pos=0,minval=Integer.MAX_VALUE,i;
        String ans="";
        while(ans.length() != len-k)
        {
           for(i=min+1;i<len-v;i++)
            {
               int ch = (int)(num.charAt(i)-48);
                if(ch<minval)
                {
                    minval=ch;
                    pos=i;
                }
            }
            ans=ans+String.valueOf(minval);
            v--;
            min=pos;
            minval=Integer.MAX_VALUE;
        }
        
        if(ans.charAt(0) == '0')
        {
            for(i=0;i<ans.length();i++)
            {
                if(ans.charAt(i) != '0')
                    break;
            }
            ans=ans.substring(i);
        }
        if(ans.length() == 0)
            return "0";
        return ans;
    }
}