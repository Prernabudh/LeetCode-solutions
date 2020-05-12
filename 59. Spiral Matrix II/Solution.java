class Solution {
    public int[][] generateMatrix(int n) {
        
        int i=1;
        int r1=0,r2=n-1;
        int c1=0,c2=n-1;
        int arr[][] = new int[n][n];
        int r,c;
        while(r1<=r2 && c1<=c2)
        {
            for(c=c1;c<=c2;c++)
            {
                arr[r1][c]=i;
                i++;
            }
            for(r=r1+1;r<=r2;r++)
            {
                arr[r][c2]=i;
                i++;
            }
            if(r1<r2 && c1<c2)
            {
                for(c=c2-1;c>c1;c--)
                {
                    arr[r2][c]=i;
                    i++;
                }
                for(r=r2;r>r1;r--)
                {
                    arr[r][c1]=i;
                    i++;
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return arr;
    }
}