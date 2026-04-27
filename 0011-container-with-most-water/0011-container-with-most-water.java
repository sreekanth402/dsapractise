class Solution {
    public int maxArea(int[] height) {
        int start =0;
        int end= height.length-1;
        int maxa =0;
        while(start<end){
            int h =Math.min(height[start],height[end]) *(end-start);
            maxa =Math.max(h,maxa);
            if(height[start]<height[end])  start++;
            else end --;
        }
        return maxa;
    }
}