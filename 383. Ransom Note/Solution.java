class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> map = new LinkedHashMap<>();
        if(ransomNote.length()>magazine.length())
            return false;
        for(int i=0;i<magazine.length();i++)
        {
            char ch=magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            char ch=ransomNote.charAt(i);
            if(!map.containsKey(ch))
                return false;
            map.put(ch, map.get(ch)-1);
            if(map.get(ch)<1)
                map.remove(ch);
        }
        return true;
    }
}