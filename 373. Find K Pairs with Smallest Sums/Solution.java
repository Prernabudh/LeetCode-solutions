class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) 
    {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
         if(nums1.length == 0|| nums2.length == 0)
            return list;
        int i=0,j=0,n=0;
        if(k>nums1.length * nums2.length)
            k=nums1.length*nums2.length;
        
        int index2[] = new int[nums1.length]; 
       
        while (k > 0) 
        {
            int min_sum = Integer.MAX_VALUE; 
            int min_index = 0; 
       
            for (int i1 = 0; i1 < nums1.length; i1++) 
            { 
                if (index2[i1] < nums2.length &&  
                    nums1[i1] + nums2[index2[i1]] < min_sum) 
                {  
                    min_index = i1; 
       
                    min_sum = nums1[i1] + nums2[index2[i1]]; 
                } 
            } 
       
            List<Integer> a1 = new ArrayList<Integer>();
            a1.add(nums1[min_index]);
            a1.add(nums2[index2[min_index]]);
            list.add(a1);
       
            index2[min_index]++; 
            k--;
        }
        
        return list;
    }
}