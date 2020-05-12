class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        if(matrix.length == 0)
            return 0;
        int i,area=0,j;
        int n=matrix.length;
        int m=matrix[0].length;
        int arr[]=new int[m+1];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(matrix[i][j]=='1')
                    arr[j]=arr[j]+1;
                else
                    arr[j]=0;
            }
            arr[m]=0;
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            int max=0;
            for(j=0;j<m+1;j++)
            {
                while(stack.size()!=1 && arr[stack.peek()]>arr[j])
                {
                    int temp=stack.pop();
                    if(arr[temp]*(j-stack.peek()-1)>max)
                        max=arr[temp]*(j-stack.peek()-1);
                }
                stack.push(j);
            }
            if(max>area)
                area=max;
        }
        return area;
    }
}