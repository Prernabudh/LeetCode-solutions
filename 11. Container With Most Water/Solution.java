class Solution {
    public int maxArea(int[] height) {
        int l,r,h1,h2;
        l=0;
        r=height.length-1;
        double area, maxArea=0.0;
        while(l<r)
        {
            h1=height[l];
            h2=height[r];
            area=Math.min(h1,h2)*(r-l);
            maxArea=Math.max(area,maxArea);
            if(h1<h2)
                l++;
            else
                r--;
        }
        return (int)maxArea;
    }
}