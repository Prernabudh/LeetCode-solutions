class Solution {
    public int numJewelsInStones(String J, String S) {
        
        int i,sum=0;
        Map<Character, Integer> map = new HashMap<>();
        for(i=0;i<S.length();i++)
            map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
        for(i=0;i<J.length();i++)
        {
            if(map.containsKey(J.charAt(i)))
                sum=sum+map.get(J.charAt(i));
        }
        return sum;
    }
}