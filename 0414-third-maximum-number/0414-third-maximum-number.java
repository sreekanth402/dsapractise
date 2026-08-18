
class Solution {
    public int thirdMax(int[] nums) {
      HashSet<Integer> n =new HashSet<>();
      for(int i=0;i<nums.length;i++){
        n.add(nums[i]);
      }
      List<Integer> l =new ArrayList<>(n);
      Collections.sort(l,Collections.reverseOrder());
      if(l.size()<3){
        return l.get(0);
      }
      else 
      return l.get(2);
    } 
}