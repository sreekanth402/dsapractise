
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
     ArrayList<Integer> ne = new ArrayList<>();
     int i=0;
     int j=0;
     while(i<nums1.length&&j<nums2.length){
        if(nums1[i]<nums2[j]) i++;
        else if(nums1[i]>nums2[j])  j++;


        else{
            ne.add(nums1[i]);
            i++;
            j++;
        }
           }
         int [] result =new int[ne.size()];
         for(int k=0;k<result.length;k++){
            result[k]=ne.get(k);
         }
         return result;


    }
}