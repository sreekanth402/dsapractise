class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n =nums1.length+nums2.length;
   int [] arr =new int[n];
  System.arraycopy(nums1,0,arr,0,nums1.length);
  System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
   Arrays.sort(arr);
  if(n%2==1){
 double a = (double)arr[n/2];
 return a;
  }
else{
double b = (arr[n/2 - 1] + arr[n/2]) / 2.0;
    return b;
}

    }
}