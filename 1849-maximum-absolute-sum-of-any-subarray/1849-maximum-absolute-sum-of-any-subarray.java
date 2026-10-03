class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum=0,max=0;
        int minsum=0,min=0;
        for(int n:nums){
            maxsum=Math.max(n,maxsum+n);
            max=Math.max(max,maxsum);
            minsum=Math.min(n,minsum+n);
            min=Math.min(min,minsum);
        }
        return Math.max(max,Math.abs(min));
    }
}