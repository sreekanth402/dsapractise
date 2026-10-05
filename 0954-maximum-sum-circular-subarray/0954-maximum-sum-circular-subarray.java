class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum=0;
        int maxsum=nums[0];
        int currmax=0;
        int minsum=nums[0];
        int currmin=0;
        for(int ele:nums){
            currmax=Math.max(currmax+ele,ele);
            maxsum=Math.max(maxsum,currmax);
            currmin=Math.min(currmin+ele,ele);
            minsum=Math.min(minsum,currmin);
            totalsum+=ele;
        }
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,totalsum - minsum);
    }
}