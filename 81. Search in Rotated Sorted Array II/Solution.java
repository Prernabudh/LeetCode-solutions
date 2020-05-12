class Solution {
    public boolean search(int[] nums, int target) {
        
        Arrays.sort(nums);
        int index = Arrays.binarySearch(nums,target);
        if(index<0)
            return false;
        return true;
    }
}