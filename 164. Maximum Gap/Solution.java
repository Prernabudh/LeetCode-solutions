class Solution {
    public int maximumGap(int[] arr) {
        
        Arrays.sort(arr);
        int diff=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]>diff)
                diff=arr[i+1]-arr[i];
        }
        return diff;
    }
}