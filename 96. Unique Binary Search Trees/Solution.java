class Solution {
    public int numTrees(int n) {
        
        int arr[] = new int[n+1];
        int i,j;
        arr[0]=1;
        arr[1]=1;
            
        for(i=2; i<=n; i++)
        {
            for(j=1;j<=i;j++)
            {
                arr[i] = arr[i] + arr[i-j]*arr[j-1];
            }
        }
        
        return arr[n];
    }
}