class Solution {
    static int gcd(int a, int b) 
    { 
        if (b == 0) 
            return a; 

        else
            return gcd(b, a % b); 
    } 
    public void rotate(int[] nums, int d) {
        
        int n=nums.length;
        if(d>n)
            d=d-n;
        int lim=gcd(n,d);
        int i,j,k,temp;
        for(i=n-1;i>=n-lim;i--)
        {
            temp=nums[i];
            j=i;
            while(true)
            {
                k=j-d;
                if(k<0)
                    k=n+k;
                if(k==i)
                    break;
                nums[j]=nums[k];
                j=k;
            }
            nums[j]=temp;
        }
    }
}