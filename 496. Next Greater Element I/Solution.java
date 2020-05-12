class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        if(nums1.length == 0 || nums2.length == 0)
            return nums1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<>();
        int i;
        stack.push(nums2[0]);
        for(i=1;i<nums2.length;i++)
        {
            while(!stack.isEmpty() && nums2[i]>stack.peek())
            {
                int num = stack.pop();
                map.put(num,nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while(!stack.isEmpty())
            map.put(stack.pop(),-1);
        int arr[] = new int[nums1.length];
        for(i=0;i<nums1.length;i++)
            arr[i]=map.get(nums1[i]);
        return arr;
    }
}