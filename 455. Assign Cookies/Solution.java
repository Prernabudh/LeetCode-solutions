class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int i,j=0,greed,next=-1,f=0,c=0;
        for(i=0;i<g.length;i++)
        {
            greed=g[i];
            for(j=next+1;j<s.length;j++)
            {
                if(s[j]>=g[i])
                {
                    f++;
                    c++;
                    next=j;
                    break;
                }
            }
            
            if(f==0)
               return c;
            f=0;
        }
       return c; 
    }
}