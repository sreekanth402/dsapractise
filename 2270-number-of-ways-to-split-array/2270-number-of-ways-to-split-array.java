class Solution {
    public int waysToSplitArray(int[] nums) {
      int count=0;
      int pref=0;
      int total =0;
      for(int num:nums){
       total+=num;
      }   
      for(int i=0;i<nums.length-1;i++){
        pref+=nums[i];
        int suff= total-pref;
        if(pref>=suff){
            count++;
        }
      }
      return count;
    }
}