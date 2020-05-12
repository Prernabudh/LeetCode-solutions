class Solution {
    public void setZeroes(int[][] matrix) {
        
        int i,j;
        Boolean iscol=false;
        for(i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]==0)
                iscol=true;
            
            for(j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        for(i=1;i<matrix.length;i++)
        {
            for(j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }
        
        if(matrix[0][0]==0)
        {
            for(j=1;j<matrix[0].length;j++)
                matrix[0][j]=0;
        }
        
        if(iscol)
        {
            for(i=0;i<matrix.length;i++)
                matrix[i][0]=0;
        }
    }
}