import java.lang.*;
class Solution {
    public int reverse(int x) {
        int num=x,d;
        long rev=0;
        if(x<0)
            x=0-x;
        while(x!=0)
        {
            d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        if(num<0)
            rev=0-rev;
        if(rev<-2147483648 || rev>2147483647)
            return 0;
        return (int)rev;
    }
}