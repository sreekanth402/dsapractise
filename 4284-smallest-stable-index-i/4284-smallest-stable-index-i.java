class Solution {
    public int firstStableIndex(int[] nums, int k) {
         int count=0,n=nums.length;
         int []arr =new int[n];
         int min =Integer.MAX_VALUE,max=0;
         for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            arr[i]=min;
         }
         for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            int s =max-arr[i];
            if(s<=k){
                return i;
            }
         }
         return -1;
         
    }
}