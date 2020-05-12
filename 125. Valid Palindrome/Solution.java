class Solution {
    public boolean isPalindrome(String s) {
        
        if(s=="")
            return true;
        int i=0,j=s.length()-1;
        s=s.toLowerCase();
        while(i<j)
        {
            char ch=s.charAt(i);
            char chr=s.charAt(j);
            if(!Character.isLetterOrDigit(ch))
            {
                i++;
                continue;
            }
            else if(!Character.isLetterOrDigit(chr))
            {
                j--;
                continue;
            }
            else if(ch != chr)
                return false;
            i++;
            j--;
        }
        return true;
    }
}