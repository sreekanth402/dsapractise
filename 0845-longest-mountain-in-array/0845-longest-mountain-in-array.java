class Solution {
    public int longestMountain(int[] arr) {
     int count =0, n =arr.length;
     for(int i=1;i<n-1;i++){
        if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
            int right =i ,left=i;
            while(left>0&&arr[left]>arr[left-1]){
                left--;       
            }
            while(right<n-1&&arr[right]>arr[right+1]){
                right++;            
            }
            int leng =right-left+1;
            count =Math.max(count ,leng);
        }
     }
     return count ;
    }
}