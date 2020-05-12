class Solution {
    public int maxRotateFunction(int[] arr) {
        
        int i,j,max=0,temp,sum=0;
        int n=arr.length;
        for(i=0;i<n;i++)
            sum=sum+i*arr[i];
        max=sum;
        sum=0;
        for(i=0;i<n;i++)
        {
            temp=arr[n-1];
            for(j=n-1;j>0;j--)
                arr[j]=arr[j-1];
            arr[0]=temp;
            for(j=0;j<n;j++)
                sum=sum+j*arr[j];
            if(sum>max)
                max=sum;
            sum=0;
        }
        return max;
    }
}