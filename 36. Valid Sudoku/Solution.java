class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int i,j,k,x=0,y=0;
        Map<Character, Integer> map = new HashMap<>();
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                if(board[i][j]>= '0' && board[i][j] <= '9')
                {
                    if(map.containsKey(board[i][j]))
                        return false;
                    else
                        map.put(board[i][j],j);   
                }
            }
            map.clear();
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            {
                if(board[j][i]>= '0' && board[j][i] <= '9')
                {
                    if(map.containsKey(board[j][i]))
                        return false;
                    else
                        map.put(board[j][i],j);
                }
            }
            map.clear();
        }
        for(i=1;i<=9;i++)
        {
            for(j=y;j<y+3;j++)
            {
                for(k=x;k<x+3;k++)
                {
                    if(board[j][k]>= '0' && board[j][k] <= '9')
                    {
                        if(map.containsKey(board[j][k]))
                            return false;
                        else
                            map.put(board[j][k],j);   
                    }
                }
            }
            x=x+3;
            if(i%3==0)
            {
                y=y+3;
                x=0;
            }
            map.clear();
        }
        
        return true;
    }
}