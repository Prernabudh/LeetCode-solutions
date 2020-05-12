class Solution {
    public boolean wordBreak(String s, List<String> list) {
        
        int n=s.length();
        Set<String> set = new HashSet<>();
        for(int i=0;i<list.size();i++)
            set.add(list.get(i));
        Boolean dp[] = new Boolean[n+1];
        int i,j;
        Arrays.fill(dp,false);
        for(i=1;i<=n;i++)
        {
            if(set.contains(s.substring(0,i)))
                dp[i]=true;
            if(dp[i]==true)
            {
                if(i==n)
                    return true;
                for(j=i+1;j<=n;j++)
                {
                    if(set.contains(s.substring(i,j)))
                        dp[j]=true;
                    if(j==n && dp[j]==true)
                        return true;
                }
            }
        }
        return false;
    }
}