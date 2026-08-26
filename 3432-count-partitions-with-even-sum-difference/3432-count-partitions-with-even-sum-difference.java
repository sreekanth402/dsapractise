class Solution {
    public int countPartitions(int[] nums) {
     int total =0;
     for(int num:nums)  total+=num;
      return (total%2==0) ? nums.length-1:0;
    }
}