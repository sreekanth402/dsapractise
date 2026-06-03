class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k=0 ,f =nums.length;
        int[]arr =new int[f];
        int n=f-1;
        for(int i=0;i<f;i++){
            if(nums[i]%2==0){
                arr[k]=nums[i];
                k++;
            }
            else{
                arr[n]=nums[i];
                n--;
            }
            
        }
        return arr;
    }
}