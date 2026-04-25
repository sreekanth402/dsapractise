class Solution {
    public void sortColors(int[] nums) {
        // int count0=0, count1=0,count2=0 ,index =0;

        // for(int num:nums){
        //     if(num==0){
        //         count0++;
        //     }
        //     else if(num==1){
        //         count1++;
        //     }
        //     else{
        //         count2++;
        //     }

        // }
        // while(count0-- >0){
        //     nums[index++]=0;

        // }
        // while(count1-- >0){
        //     nums[index++]=1;
        // }
        // while(count2-- >0){
        //     nums[index++]=2;
        // }



        int low=0 ,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==-0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp =nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        
        }
    }
}