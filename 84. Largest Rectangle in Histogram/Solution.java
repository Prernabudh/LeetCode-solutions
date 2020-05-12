class Solution {
    
    public int largestRectangleArea(int[] arr) {
        
        if(arr.length == 0)
            return 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int index = 0; index < arr.length; index++)
        {
            list.add(arr[index]);
        }
        list.add(0);
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        stack.push(0);
        int i,max=0;
        for(i=1;i<list.size();i++)
        {
            while(stack.peek()!=-1 && list.get(i)<list.get(stack.peek()))
            {
                int temp=stack.pop();
                int val=(i-stack.peek()-1)*list.get(temp);
                if(val>max)
                    max=val;
            }
            stack.push(i);
        }
        return max;
    }
}