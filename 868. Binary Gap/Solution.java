class Solution {
    public int binaryGap(int n) {
        
        int d,pos=0,curr=0,diff=0,f=0;
        String s="";
        while(n != 0)
        {
            d=n%2;
            s=String.valueOf(d)+s;
            n=n/2;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                f++;
                if(f==1)
                    pos=i;
                else if(f>1)
                {
                    curr=i;
                    if(diff<curr-pos)
                        diff=curr-pos;
                    pos=curr;
                }
            }
        }
        return diff;
    }
}