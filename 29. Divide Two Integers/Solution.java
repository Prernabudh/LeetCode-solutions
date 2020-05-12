class Solution {
    public int divide(int dividend, int divisor) {
        
        long c = Long.valueOf(dividend);
        long d = Long.valueOf(divisor);
        int f=0;
        if(c==-2147483648 && d == -1)
            return 2147483647 ;
        if(d == 1)
            return dividend;
        
        if(c<0)
        {
            f++;
            c=0-c;
        }
        if(d<0)
        {
            f++;
            d=0-d;
        }
        long ans = (long)Math.exp(Math.log(c)-Math.log(d));
        int val = (int)ans;
        if(f==0)
            return val;
        else if (f==1)
            return 0-val;
        else
            return val;
        
    }
}