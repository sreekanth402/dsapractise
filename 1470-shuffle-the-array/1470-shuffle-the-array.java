class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr [] =new int[nums.length];
    int x= 0;
    for(int i=0;i<n;i++){
        arr[x++]= nums[i];
        arr[x++]=nums[i+n];
    }
      
      int i=0;
      while(i<nums.length){
        System.out.print(arr[i]);
        i++;
      }
      return arr ;
    }
}
