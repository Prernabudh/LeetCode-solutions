class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack.length() == 0 && needle.length() == 0)
            return 0;
        if(haystack.length() == 0 && needle.length() != 0)
            return -1;
        return haystack.indexOf(needle);
        }
}