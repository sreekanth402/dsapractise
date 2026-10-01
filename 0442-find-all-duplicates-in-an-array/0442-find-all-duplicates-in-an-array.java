class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     int i=0;
     while(i<nums.length){
        int correct=nums[i]-1;
        if(i<nums.length&&nums[i]!=nums[correct]){
            swap(nums,i,correct);
        }
        else{
            i++;
        }
     }
     List<Integer>l =new ArrayList<>();
     for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
            l.add(nums[j]);
        }
     }
return l;
    }
    void swap(int[]arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
    }
