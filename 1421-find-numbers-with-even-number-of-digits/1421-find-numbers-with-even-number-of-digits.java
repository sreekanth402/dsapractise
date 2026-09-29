class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i=0 ;i<nums.length;i++){
           int f=digit(nums[i]);
           if(f%2==0){
            count++;
           }
        }
        return count;
    }
    int digit(int n){
        int count=0;
        if(n==0) return 1;
        else{
            while(n>0){
                n=n/10;
                count++;
            }
        } return count;
    }
}