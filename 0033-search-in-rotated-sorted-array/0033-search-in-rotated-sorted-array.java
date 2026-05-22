class Solution {
    public int search(int[] nums, int target) {
         for(int i=0;i<nums.length;i++){
             if(nums[i]==target){
                 return i;
            }
         }
        return -1;
    //     int left=0;
    //     int right=nums.length-1;
    //     int mid=left+(right-left)/2;
       
    //         if(nums[i]==target){
    //             return i;
    //         }
    //         else if(nums[i]<mid){
    //             left=mid+1;
    //         }
    //         else{
    //             left=mid-1;
    //         }
    //     }
    //   return -1;
    }
}