class Solution {
    public int[] singleNumber(int[] nums) {
       int xor =0;
       for(int num: nums){
         xor^=num;
       }
         int a =0,b=0;
         int mask=xor&(-xor);
         for(int c:nums){
            if((c&mask)==0){
                a^=c;
            }
            else{
                b^=c;
            }
         }
         return new int[]{a,b};
    }
}