class Solution {
    public int reverse(int x) {
         long revrse=0;
         while(x!=0){
            int digit =x%10;
             revrse =revrse*10+digit;
             x/=10;
         }

         if(revrse>Integer.MAX_VALUE||revrse<Integer.MIN_VALUE){
            return 0;
         }
         return (int) revrse;
    }
}