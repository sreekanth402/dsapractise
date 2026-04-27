class Solution {
    public int[] sortedSquares(int[] nums) {
      int []arr =new int[nums.length];
      int left=0;
      int right=nums.length-1;
      int index=nums.length-1;
      while(left<=right){
        int lefts =nums[left]*nums[left];
        int rights =nums[right]*nums[right];
        if(lefts>rights){    
        arr[index]=lefts; 
        left++;
        }
        else {
            arr[index] =rights; 
        right--;
        }
      index --;  
      }
      return arr ;
    }
}