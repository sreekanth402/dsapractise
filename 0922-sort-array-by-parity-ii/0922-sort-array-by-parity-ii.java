class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int index =0 ,n =nums.length ,k=1;
        int []arr =new int[n];
        for(int i:nums){
            if(i%2==0){
                arr[index]=i;
                index+=2;
            }
            else{
               arr[k]=i; 
               k+=2;
            }
        }
        return arr;
    }
}