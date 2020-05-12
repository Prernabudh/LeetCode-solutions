class Solution {
    public void gameOfLife(int[][] board) {
        
        int flag[][] = new int[board.length][board[0].length];
        int i,j,one=0;
        for(i=0;i<board.length;i++)
        {
            for(j=0;j<board[0].length;j++)
            {
                one=0;
                if(j>0 && board[i][j-1]==1)
                    one++;
                if(j<board[0].length-1 && board[i][j+1]==1)
                    one++;
                if(i<board.length-1 && board[i+1][j]==1)
                    one++;
                if(i>0 && board[i-1][j]==1)
                    one++;
                if(i>0 && j>0 && board[i-1][j-1]==1)
                    one++;
                if(i>0 && j<board[0].length-1 && board[i-1][j+1]==1)
                    one++;
                if(i<board.length-1 && j>0 && board[i+1][j-1]==1)
                    one++;
                if(i<board.length-1 && j<board[0].length-1 && board[i+1][j+1]==1)
                    one++;
                    
                if(board[i][j]==0)
                {
                    if(one==3)
                        flag[i][j]=1;
                }
                if(board[i][j]==1)
                {
                    if(one<2)
                        flag[i][j]=0;
                    else if(one==2 || one==3)
                        flag[i][j]=1;
                    else if(one>3)
                        flag[i][j]=0;
                }
            }
        }
        for(i=0;i<board.length;i++)
        {
            for(j=0;j<board[0].length;j++)
                board[i][j]=flag[i][j];
        }
    }
}