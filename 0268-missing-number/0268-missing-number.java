class Solution {
    public int missingNumber(int[] nums) {
       int a =nums.length;
       int s =a*(a+1)/2;
       int actual=0;
       for(int b :nums){
        actual+=b;
       }
    return s-actual;
    }
}