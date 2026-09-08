class Solution {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // int a=nums[nums.length-1];
        // int b=nums[nums.length-2];
        // return (a-1)*(b-1);

         int max =1;
         int max2 =0;
        for (int num : nums) {
            if (num > max) {
                max2 = max;
                max = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return (max-1)*(max2-1);
    }
}