class Solution {
    public int maxArea(int[] height) {
        // int n =height.length;
        // int maxa=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int h =Math.min(height[i],height[j]);
        //         int w =j-i;
        //         int area =w*h;
        //          maxa=Math.max(maxa,area);
        //     }
        // }
        // return maxa;


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