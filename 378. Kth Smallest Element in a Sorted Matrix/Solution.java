class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int n = matrix.length,c=0,i,j;
        int arr[] = new int[n*n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[c]=matrix[i][j];
                c++;
            }
        }
        
        Arrays.sort(arr);
        return arr[k-1];
        
    }
}