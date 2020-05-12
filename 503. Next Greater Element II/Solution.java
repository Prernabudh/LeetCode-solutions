class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        if(nums.length == 0)
            return nums;
        int i,len=0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int arr[] = new int[nums.length];
        for(i=1;i<nums.length;i++)
        {
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()])
                arr[stack.pop()]=nums[i];
            stack.push(i);
        }
        if(!stack.isEmpty())
            len=stack.peek();
        for(i=0;i<len;i++)
        {
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()])
                arr[stack.pop()]=nums[i];
        }
        while(!stack.isEmpty())
            arr[stack.pop()]=-1;
        return arr;
    }
}